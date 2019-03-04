/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class PersonaDAO {
    private Connection con;
    public void darAlta(Persona p)
    {
        try
        {
            /*version 1*/
            /*String s ="INSERT INTO  persona VALUES('"+p.getNombre()+"',"+p.getEdad()+",'"+p.getProfesion()+"',"+p.getTelefono()+")";
            Statement sentencia =con.createStatement();
            sentencia.executeUpdate(s);*/
            /*VERSION 2*/
            String plantilla ="INSERT INTO persona VALUES(?,?,?,?);";
            PreparedStatement ps=con.prepareStatement(plantilla);
            ps.setString(1,p.getNombre());
            ps.setInt(2,p.getEdad());
            ps.setString(3,p.getProfesion());
            ps.setInt(4,p.getTelefono());
            int n=ps.executeUpdate();
        }
        catch (MySQLIntegrityConstraintViolationException e)
        {
            JOptionPane.showMessageDialog(null, "El nombre de la persona debe ser unico");
        }
        catch(Exception e)
        {
            System.out.println(e.getClass()+e.getMessage());
        }

    }
    public Persona consultarPersona(String nombre) 
   {
       Persona p=null;
 try{
       PreparedStatement consulta = con.prepareStatement("SELECT * FROM persona WHERE nombre = ?;");
       consulta.setString(1, nombre);
       ResultSet res = consulta.executeQuery();

       if(res.next())
       {
           p= new Persona();
           p.setNombre(res.getString("nombre"));
           p.setEdad(Integer.parseInt(res.getString("edad")));
           p.setProfesion(res.getString("profesion"));
           p.setTelefono(Integer.parseInt(res.getString("telefono")));
       }
       else
            throw new Exception ("Persona no encontrada");
       

       res.close();
       consulta.close();
 
       return p;
 }
 catch(Exception e)
 {
     return null;
 }
    }
    public ArrayList<Persona> listaDePersonas() throws Exception
    {
        ArrayList< Persona> listaPersonas = new ArrayList();

        Statement consulta = con.createStatement();
        ResultSet res = consulta.executeQuery("SELECT * FROM persona");
        while(res.next())
        {
          Persona persona= new Persona();
          persona.setNombre(res.getString("nombre"));
          persona.setEdad(Integer.parseInt(res.getString("edad")));
          persona.setProfesion(res.getString("profesion"));
          persona.setTelefono(Integer.parseInt(res.getString("telefono")));
          listaPersonas.add(persona);
        }
        res.close();
        consulta.close();
   
        return listaPersonas;
 }

    public PersonaDAO(Connection con) {
        this.con = con;
    }
}
