/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.sql.*;
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
            String plantilla ="insert into personas(?,?,?,?);";
            PreparedStatement ps=con.prepareStatement(plantilla);
            ps.setString(1,p.getNombre());
            ps.setInt(1,p.getEdad());
            ps.setString(3,p.getProfesion());
            ps.setInt(4,p.getTelefono());
            int n=ps.executeUpdate();
        }
        catch(Exception e)
        {
            //System.out.println(e.getClass()+e.getMessage());
        }

    }

    public PersonaDAO(Connection con) {
        this.con = con;
    }
}
