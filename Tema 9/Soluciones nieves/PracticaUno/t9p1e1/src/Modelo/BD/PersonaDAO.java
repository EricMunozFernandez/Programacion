package Modelo.BD;

import Modelo.ClasesUML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonaDAO {
    private Connection con;
    
    public PersonaDAO(Connection con)
    {
        this.con = con;
    }
 
   
    public void registrarPersona(Persona p) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.
        /*
        Statement sentencia = con.createStatement();
        sentencia.executeUpdate("INSERT INTO personas VALUES ('"+p.getNombrePersona()+"', '"
                            +p.getEdadPersona()+"', '"
               +            p.getProfesionPersona()+"', '"+
                            p.getTelefonoPersona()+"')");
        sentencia.close();*/
        
        String plantilla = "INSERT INTO personas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getNombrePersona());
        ps.setInt(2,p.getEdadPersona());
        ps.setString(3, p.getProfesionPersona());
        ps.setString(4,p.getTelefonoPersona());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }


   public Persona consultarPersona(String nombre) throws Exception
   {
       Persona persona=null;
 
       PreparedStatement consulta = con.prepareStatement("SELECT * FROM personas where nombre = ? ");
       consulta.setString(1, nombre);
       ResultSet res = consulta.executeQuery();

       if(res.next())
       {
           persona= new Persona();
           persona.setNombrePersona(res.getString("nombre"));
           persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
           persona.setProfesionPersona(res.getString("profesion"));
           persona.setTelefonoPersona(res.getString("telefono"));
       }
       else
            throw new Exception ("Persona no encontrada");
       

       res.close();
       consulta.close();
 
       return persona;
    }

    public ArrayList<Persona> listaDePersonas() throws Exception
    {
        ArrayList< Persona> listaPersonas = new ArrayList();

        Statement consulta = con.createStatement();
        ResultSet res = consulta.executeQuery("Select * from personas");
        while(res.next())
        {
          Persona persona= new Persona();
          persona.setNombrePersona(res.getString("nombre"));
          persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
          persona.setProfesionPersona(res.getString("profesion"));
          persona.setTelefonoPersona(res.getString("telefono"));
          listaPersonas.add(persona);
        }
        res.close();
        consulta.close();
   
        return listaPersonas;
 }
}
 
