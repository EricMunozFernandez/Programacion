package Modelo.BD;

import java.sql.*;

public class DbConnection {

   //Parametros de conexion
    private String bd = "bdt9p1e1";
    private String login = "root";
    private String password = "usbw";
    private String url = "jdbc:mysql://localhost:3307/"+bd;
    
    // constantes???
    // Parametros para el constructor??
    // Todo static como en la clase principal???
 
    private Connection connection;
 
    public DbConnection(){}
  
    public void conectar() throws Exception
    {
         //obtenemos el driver para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         connection = DriverManager.getConnection(url,login,password);
 
         if (connection==null){
            throw new Exception("Problemas con la conexión");
         }
   }
    
    public Connection getConnection(){
      return connection;
   }
 
    public void desconectar() throws Exception{
      connection.close();
   }
}
