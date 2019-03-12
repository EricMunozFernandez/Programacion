
package Modelo.BD;


import Excepciones.AcontecimientoNoEncontrado;
import Modelo.UML.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

public class AcontecimientoBD{
    
    /* Clase que contiene los métodos necesarios para trabajar
       con la tabla acontecimientos */
       
    private static Acontecimiento acontecimiento;
    
    private static PreparedStatement sentenciaPre;
    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
     
    public static void alta(Acontecimiento ac) throws Exception
    {
        /* Método que inserta una fila en la tabla de los acontecimientos
            a partir de un objeto de tipo acontecimiento.
           Este método también se suele llamar save.
        */
        
        // Abrir la conexión
            GenericoBD.abrirBD();
            
        // Preparar la sentencia que se quiere ejecutar
            plantilla = "INSERT INTO acontecimientos (nombre, lugar, fecha,horaInicio, horaFin, aforo) VALUES (?,?,?,?,?,?)";
            sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
            sentenciaPre.setString(1,ac.getNombre());
            sentenciaPre.setString(2,ac.getLugar());
            sentenciaPre.setDate(3, conversionDate(ac.getFecha()));
            sentenciaPre.setTime(4, conversionTime(ac.getHoraI()));
            sentenciaPre.setTime(5, conversionTime(ac.getHoraF()));
            sentenciaPre.setInt(6,ac.getAforo());
            
            // Ejecutar sentencia
            int n = sentenciaPre.executeUpdate();
            System.out.println( n + "filas insertadas");
      
            // Cerrar la conexión
            GenericoBD.cerrarBD();
    }
    
    public static java.sql.Date conversionDate(LocalDate fecha)
    {
        // Conversion LocalDate en java.sql.Date
        return java.sql.Date.valueOf(fecha);
    }
    
    public static java.sql.Time conversionTime(LocalTime hora)
    {
         // Conversion java.time.LocalTime en java.sql.Time
        return java.sql.Time.valueOf(hora);
    }
    
    public static String listado() throws Exception{
        // Método que genera un String con los datos de todos los acontemientos
        GenericoBD.abrirBD();
            
        sentencia=GenericoBD.getCon().createStatement();
        resultado = sentencia.executeQuery("Select * from acontecimientos");

        String mensaje="";
        while (resultado.next())
        {
            crearObjeto();
                
            mensaje += acontecimiento.toString()+"\n";
        }
        resultado.close();
        GenericoBD.cerrarBD();
        return mensaje;
    }
    
    public static void crearObjeto() throws Exception
    {
        acontecimiento = new Acontecimiento();
        acontecimiento.setNombre(resultado.getString("nombre"));
        acontecimiento.setLugar(resultado.getString("lugar"));
        acontecimiento.setFecha(resultado.getDate("fecha").toLocalDate());             
        acontecimiento.setHoraI(resultado.getTime("horaInicio").toLocalTime());      
        acontecimiento.setHoraF(resultado.getTime("horaFin").toLocalTime());
        acontecimiento.setAforo(resultado.getInt("aforo"));
    }
    
    public static void borrar(Acontecimiento ac) throws Exception{
        
        // Método que borrar un acontecimiento de la base de datos
        GenericoBD.abrirBD();
        plantilla = "delete from acontecimientos where nombre = ?";
        sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,ac.getNombre());
            
        int n = sentenciaPre.executeUpdate();
        if (n == 0)
            throw new AcontecimientoNoEncontrado();
        
        System.out.println( n + " filas borradas");
        
        GenericoBD.cerrarBD();
    }
    
    public static Acontecimiento consultar(Acontecimiento ac) throws Exception{
        // Método que consultar un acontecimiento de la base de datos
        GenericoBD.abrirBD();
        
        plantilla = "select *  from acontecimientos where nombre = ?";
        sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,ac.getNombre());
            
        resultado = sentenciaPre.executeQuery();
        if (resultado.next())
        {
            crearObjeto();
        }
        else
            throw new AcontecimientoNoEncontrado();
        
        GenericoBD.cerrarBD();
        
        return acontecimiento;
    }
    
     public static void modificar(Acontecimiento ac) throws Exception
    {
        /* Método que modifica una fila en la tabla de los acontecimientos
            a partir de un objeto de tipo acontecimiento.  
        */
        
        // Abrir la conexión
            GenericoBD.abrirBD();
            
        // Preparar la sentencia que se quiere ejecutar
            plantilla = "update acontecimientos set lugar = ?, fecha = ?,horaInicio = ?, horaFin = ?, aforo = ?  where nombre = ?";
            sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
            sentenciaPre.setString(6,ac.getNombre());
            sentenciaPre.setString(1,ac.getLugar());
            sentenciaPre.setDate(2, conversionDate(ac.getFecha()));
            sentenciaPre.setTime(3, conversionTime(ac.getHoraI()));
            sentenciaPre.setTime(4, conversionTime(ac.getHoraF()));
            sentenciaPre.setInt(5,ac.getAforo());
            
            // Ejecutar sentencia
            int n = sentenciaPre.executeUpdate();
            System.out.println( n + "filas modificadas");
      
            // Cerrar la conexión
            GenericoBD.cerrarBD();
    }
}
