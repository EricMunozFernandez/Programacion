/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 1gdaw07
 */

public class BaseDatos {
    
    private Connection con;
    private BaseDatos bd;
   // private ProyectoDAO oProyectoDAO;
    
    public Connection conectar() 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/"+"practica2";
            String usuario="root";
            String pass="usbw";
            con=DriverManager.getConnection(url,usuario,pass);
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e.getClass()+e.getMessage());
            return null;
        }
    } 
    
    
    public void cerrar()throws Exception
    {        
        con.close();
    }
    
    public Connection abrirBD()throws Exception
    {
        con = conectar();
        if(con==null)
        {
            System.out.println("Problemas con la base de datos");
            System.exit(-1);
        }        
        return con;
    } 
}
