package Modelo.BD;

import Modelo.UML.Acontecimiento;
import Modelo.UML.Persona;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AsistentesBD {
    
    private static PreparedStatement sentenciaPre;
    private static String plantilla;
    private static ResultSet resultado;
    
    public static int getNumeroAsistentes(String nombre) throws Exception
    { 
        //GenericoBD.abrirBD(); Vengo de AcontecimientoBD
        
        // opcion dos: if (GenericoBD.getCon() == null) Si llamo desde varios lugares
         
        plantilla = "select count(*) from personasacontecimientos where nombre = ?";
        sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,nombre);
        resultado = sentenciaPre.executeQuery();
        // Sin if y sin while. Doy por hecho que tengo una fila resultado de la consulta, aunque sea con un cero
        resultado.next(); 
        int numero = resultado.getInt(1);
        resultado.close();
        //GenericoBD.cerrarBD();
        return numero;
    }
    
    public static void alta(Acontecimiento ac,Persona p) throws Exception
    {
        try
        {
        GenericoBD.abrirBD();
        plantilla = "insert into personasacontecimientos values(?,?)";
        sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
        // Se está apuntando al último del arraylist
        sentenciaPre.setString(1,ac.getNombre());
        sentenciaPre.setString(2,p.getDni());
        int n = sentenciaPre.executeUpdate();
        GenericoBD.cerrarBD();
        if (n != 1)
           throw new Exception("Insert de asistentes");
        }
        catch(MySQLIntegrityConstraintViolationException ex)
        {
            throw new Exception("Ya estás inscrito");
        }
    }
}

