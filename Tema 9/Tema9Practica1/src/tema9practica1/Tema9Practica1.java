/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9practica1;

import GUI.*;
import UML.*;
import java.sql.*;
public class Tema9Practica1 {

    private static VentanaMenu vm;
    private static PersonaDAO oPersonaDAO;
    private static BaseDatos bd;
    private static Connection con;
    private static String nomSearch;
    private static int opc;
    public static void main(String[] args) {
        // TODO code application logic here
        bd= new BaseDatos();
        con= bd.conectar();
        if(con==null)
        {
            System.out.println("problemas con la base de datos");
            System.exit(-1);
        }
        
        oPersonaDAO= new PersonaDAO(con);
        
        vm= new VentanaMenu();
        vm.setVisible(true);
    }
    public static void darAlta(String nombre, String edadS, String profesion, String telefonoS)
    {
        int edad= Integer.parseInt(edadS);
        int telefono= Integer.parseInt(telefonoS);
        Persona p=new Persona(nombre,edad,profesion,telefono);
        //insertar
        oPersonaDAO.darAlta(p);
    }
    public static void salir()
    {
        bd.cerrar();
        System.exit(0);
    }
    public static void setOpcion(int opcion)
    {
        opc=opcion;
    }
    public static int getOpcion()
    {
        return opc;
    }
    public static void buscarNombre(String nom)
    {
        nomSearch=nom;
    }
    
}
