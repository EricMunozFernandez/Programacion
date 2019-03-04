/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9practica2;

import GUI.*;
import UML.*;
import java.sql.*;


/**
 *
 * @author 1gdaw07
 */
public class Tema9Practica2 {

    /**
     * @param args the command line arguments
     */
    private static BaseDatos bd;
    private static Connection con;
    private static ProyectoDAO oProyectoDAO;
    private static Ventana vm;
    public static void main(String[] args) {
        // TODO code application logic here
        bd= new BaseDatos();
        con= bd.conectar();
        if(con==null)
        {
            System.out.println("Problemas con la base de datos");
            System.exit(-1);
        }
        oProyectoDAO= new ProyectoDAO(con);
        vm= new Ventana();
        vm.setVisible(true);
    }
    public static void cambiarVentana()
    {
        vProyecto= new Vproyecto();
    }
    
}
