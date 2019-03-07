/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 *
 * @author 1gdaw07
 */
public class ProyectoDAO {
    private Connection con;
    private BaseDatos bd;
    private ProyectoDAO oProyectoDAO;

    public ProyectoDAO(Connection con) {
        this.con=con;
    }
    public ProyectoDAO() {
        
    }
    public void darAlta(Proyecto pr)
    {
        try
        {
            bd= new BaseDatos();
            con = bd.abrirBD();
            
            String plantilla ="INSERT INTO proyecto VALUES(?,?,?,?,?,?);";
            PreparedStatement ps=con.prepareStatement(plantilla);
            ps.setString(1,pr.getNombre());
            ps.setString(2,pr.getLugar());
            ps.setDate(3, conversionDate(pr.getFecha()));
            ps.setTime(4, conversionTimeInicio(pr.getHoraInicio()));
            ps.setTime(5, conversionTimeFin(pr.getHoraFin()));
            ps.setInt(6, pr.getNumeroPersonas());
           
            int n=ps.executeUpdate();
            
            bd.cerrar();
            
        }
        catch(Exception e)
        {
            System.out.println(e.getClass()+e.getMessage());
        }
    }
    public Proyecto consultarProyecto(String nombre, String opcion)
   {
        try
        { 
            bd= new BaseDatos();
             con = bd.abrirBD();

            Proyecto proyecto=null;

            PreparedStatement consulta = con.prepareStatement("SELECT * FROM proyecto where nombre = ? ");
            consulta.setString(1, nombre);
            ResultSet res = consulta.executeQuery();

            if(res.next())
            {
                if(opcion.compareToIgnoreCase("borrar")==0)
                {
                PreparedStatement borrar = con.prepareStatement("DELETE FROM proyecto where nombre = ? ");
                 consulta.setString(1, nombre);
                }  
                if(opcion.compareToIgnoreCase("editar")==0)
                {
                    LocalDate date = res.getDate("fecha").toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    proyecto= new Proyecto();
                    proyecto.setNombre(res.getString("nombre"));
                    proyecto.setLugar(res.getString("lugar"));
                    proyecto.setFecha(date);
                    proyecto.setHoraInicio(toLocalTime(res.getTime("horaInicio")));
                    proyecto.setHoraFin(toLocalTime(res.getTime("horaFin")));
                    proyecto.setNumeroPersonas(res.getInt("aforo"));                    
                }
            }
            else
                 throw new Exception ("proyecto no encontrado");


            res.close();
            consulta.close();
            bd.cerrar();

            return proyecto;

        }
        catch(Exception e)
        {
            System.out.println(e.getClass()+e.getMessage());
            return null;
        }
    }
    public static java.sql.Date conversionDate(LocalDate fecha)
    {
        return java.sql.Date.valueOf(fecha);
    }
    public static java.sql.Time conversionTimeInicio(LocalTime horaInicio)
    {
        return java.sql.Time.valueOf(horaInicio);
    }
    public static java.sql.Time conversionTimeFin(LocalTime horaFin)
    {
        return java.sql.Time.valueOf(horaFin);
    }
    public static LocalTime toLocalTime(java.sql.Time time) {
    return time.toLocalTime();
  }
}
