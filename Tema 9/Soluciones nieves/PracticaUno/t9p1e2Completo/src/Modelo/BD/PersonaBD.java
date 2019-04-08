package Modelo.BD;

import Modelo.UML.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonaBD {
       
    private static PreparedStatement sentenciaPre;
    private static String plantilla;
    private static ResultSet resultado;
    private static Persona p;
    
    public static Persona queryByDni(Persona p) throws Exception{
         
        GenericoBD.abrirBD();
            
        plantilla = "select * from personas where dni = ?";
        sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,p.getDni());
        resultado = sentenciaPre.executeQuery();
        if (resultado.next())
            {
                // Completo el objeto recibido.
                // También se puede crear uno nuevo
               p.setNombre(resultado.getString("nombre"));
               p.setApellidos(resultado.getString("apellidos"));
               p.setTelefono(resultado.getString("telefono"));
               // Relación Persona Empresa
               p.setE(EmpresaBD.queryByNif(resultado.getString("nif")));
               // La lista de sus eventos no me interesa siempre
            }
            else
                p =  null;
            
            resultado.close();
            GenericoBD.cerrarBD();
            return p;
    }
    
    public static void alta(Persona p) throws Exception
    {
        GenericoBD.abrirBD();
            
        plantilla = "insert into personas values (?,?,?,?,?)";
        sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,p.getDni());
        sentenciaPre.setString(2,p.getNombre());
        sentenciaPre.setString(3,p.getApellidos());
        sentenciaPre.setString(4,p.getTelefono());
        sentenciaPre.setString(5,p.getE().getNif());
        int n=sentenciaPre.executeUpdate();
        
        GenericoBD.cerrarBD();
        
        if (n != 1)
           throw new Exception("Fallo al insertar persona");
        
    }
    
    public static ArrayList<Persona> getAsistentes(String nombreAcontecimiento)throws Exception
    {
        ArrayList<Persona> lista = new ArrayList();
        GenericoBD.abrirBD();
            
        plantilla = "select p.dni,p.nombre,p.apellidos,p.telefono from personas p, personasacontecimientos pa where pa.nombre = ? and pa.dni = p.dni";
        sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,nombreAcontecimiento);
        resultado = sentenciaPre.executeQuery();
        while(resultado.next())
        {
            crearObjeto();
            lista.add(p);
        }
        
        if (lista.isEmpty())
            throw new Exception("El evento no existe o no hay personas inscritas");
        return lista;
    }
    
    public static void crearObjeto() throws Exception{
        p = new Persona();
        p.setDni(resultado.getString(1));
        p.setNombre(resultado.getString(2));
        p.setApellidos(resultado.getString(3));
        p.setTelefono(resultado.getString(4));
    }
}
