/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9practica1;

import GUI.*;
import UML.*;
import java.sql.*;
import java.util.ArrayList;
public class Tema9Practica1 {

    private static VentanaMenu vm;
    private static PersonaDAO oPersonaDAO;
    private static BaseDatos bd;
    private static Connection con;
    private static int opc;
    private static VentanaPersona vp;
    private static int pos;
    private static ArrayList<Persona>listaPersonas;
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
    
    public static void cambioVentana()
    {
        vm.dispose();
        vp= new VentanaPersona();
        vp.setVisible(true);
    }
    public static void buscarPersona(String nombre)
    {
        try
        {
        Persona p = oPersonaDAO.consultarPersona(nombre);
        visualizar(p);
        }
        catch(Exception e)
        {
            System.out.println(e.getClass()+e.getMessage());
        }
    }
    public static void visualizar(Persona p)
    {
        System.out.println("Nombre Persona: "+p.getNombre());
        System.out.println("Edad Persona: "+p.getEdad());
        System.out.println("Profesión Persona: "+p.getProfesion());
        System.out.println("Telefono Persona: "+p.getTelefono());
        System.out.println("*************************************************\n");
    }
    public static void obtenerDatos()
    {
    try
        {  
        listaPersonas = oPersonaDAO.listaDePersonas();        
        if (listaPersonas.size()>0) 
        {            
            pos = 0;
            vp = new VentanaPersona(listaPersonas.get(0).getNombre(),listaPersonas.get(0).getEdad(),listaPersonas.get(0).getProfesion(),listaPersonas.get(0).getTelefono());
            vp.setVisible(true);
        }
        else
            throw new Exception("No hay personas");
        }
        catch(Exception e)
        {
            System.out.println(e.getClass()+e.getMessage());
        }
    }
    public static boolean isSiguiente()
    {
        if (pos == listaPersonas.size()-1)
            return false;
        return true;
    }    
    public static boolean isAnterior()
    {
        if (pos == 0)
            return false;
        return true;
    }
    public static String getSiguienteNombre()
  {
      pos = pos + 1;
      return listaPersonas.get(pos).getNombre();
  }
  
  public static Integer getEdad()
  {
     return listaPersonas.get(pos).getEdad();
  }
   
  public static String getProfesion()
  {
      return listaPersonas.get(pos).getProfesion();
  }
    
  public static int getTelefono()
  {
      return listaPersonas.get(pos).getTelefono();
  }
  
  public static String getAnteriorNombre()
  {
      pos = pos - 1;
      return listaPersonas.get(pos).getNombre();
  }
    
}
