/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;

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
}
