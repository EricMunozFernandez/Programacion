/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9practica2;

import GUI.*;
import UML.*;
import java.time.LocalDate;
import java.time.LocalTime;


/**
 *
 * @author 1gdaw07
 */
public class Tema9Practica2 {

    /**
     * @param args the command line arguments
     */
    private static ProyectoDAO oProyectoDAO;
    private static Ventana vm;
    private static Vproyecto vp;
    private static Proyecto pr;
    public static void main(String[] args) {
        // TODO code application logic here
        vm= new Ventana();
        vm.setVisible(true);
    }
    public static void cambiarVentana()
    {
        vp= new Vproyecto(vm,true);        
        vp.setLocationRelativeTo(vm);
        vp.setVisible(true);
    }
    public static void darAlta(String nombre, String lugar, LocalDate fecha, LocalTime horaI, LocalTime horaF, int aforo)
    {
       oProyectoDAO= new ProyectoDAO();
       pr= new Proyecto(nombre,lugar,fecha,horaI,horaF, aforo);
       oProyectoDAO.darAlta(pr);
    }
    public static void cancelarEvento(String nombre, String opcion)
            
    {
        oProyectoDAO.consultarProyecto(nombre, opcion);
    }
    public static void editarEvento(String nombre, String opcion)
    {
        Proyecto proyecto=oProyectoDAO.consultarProyecto(nombre, opcion);
        enviarAVentana(proyecto);
    }
    public static void enviarAVentana(Proyecto p)
    {
        vp= new Vproyecto(vm,true,p.getNombre(),p.getLugar(),p.getFecha(),p.getHoraInicio(),p.getHoraFin(),p.getNumeroPersonas());        
        vp.setLocationRelativeTo(vm);
        vp.setVisible(true);
    }
    
}
