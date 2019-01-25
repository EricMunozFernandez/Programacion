/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg8.practica.pkg3;

import UML.*;
import Vista.Ventana1;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw07
 */
public class Tema8Practica3 {

    /**
     * @param args the command line arguments
     */        
    private static ArrayList<Persona> listaPersonas;
    private static ArrayList<Curso>listaCursos;
    private static Ventana1 v1;   
    private static Persona p;

    public static void main(String[] args) {
        // Simulación de la base de datos        
        crearCursos();
        listaPersonas = new ArrayList<Persona>();
        mostrarVentana();
    }
    public static void mostrarVentana()
    {
        v1 = new Ventana1();
        v1.setVisible(true);
    }
    public static void crearCursos()
    {
        listaCursos=new ArrayList<Curso>();
        Curso curso1A =new Curso("1A");
        listaCursos.add(curso1A);
        Curso curso2A =new Curso("2A");
        listaCursos.add(curso2A);
        Curso curso3A =new Curso("3A");
        listaCursos.add(curso3A);
        Curso curso4A =new Curso("4A");
        listaCursos.add(curso4A);
        Curso curso1B =new Curso("1B");
        listaCursos.add(curso1B);
        Curso curso2B =new Curso("2B");
        listaCursos.add(curso2B);
        Curso curso3B =new Curso("3B");
        listaCursos.add(curso3B);
        Curso curso4B =new Curso("4B");
        listaCursos.add(curso4B);
        Curso curso1C =new Curso("1C");
        listaCursos.add(curso1C);
        Curso curso2C =new Curso("2C");
        listaCursos.add(curso2C);
        Curso curso3C =new Curso("3C");
        listaCursos.add(curso3C);
        Curso curso4C =new Curso("4C");
        listaCursos.add(curso4C);
        Curso curso1D =new Curso("1D");
        listaCursos.add(curso1D);
        Curso curso2D =new Curso("2D");
        listaCursos.add(curso2D);
        Curso curso3D =new Curso("3D");
        listaCursos.add(curso3D);
        Curso curso4D =new Curso("4D");
        listaCursos.add(curso4D);       
    }
    public static boolean validarDni(String dni){
        // Comprobamos que no está repetido
        int x;
        for(x = 0; x < listaPersonas.size() && listaPersonas.get(x).getDni().compareTo(dni)!= 0; x++){}
        if (x == listaPersonas.size())
        {
            return false;
        }
        p=listaPersonas.get(x);
        return true;
    }
    
    public static boolean altaPersona(String nombre, String apellidos,String dni,Curso curso)
    {
        try
        {
            listaPersonas.add(new Persona(nombre,apellidos,dni,curso));
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public static void salir(){
        v1.dispose();
        System.exit(0);
    }
    
    public static String generarListado(){
        String datos="";
        for(int x = 0; x < listaPersonas.size(); x++)
        {
            datos += listaPersonas.get(x).getNombre() + "  " + listaPersonas.get(x).getApellidos() + "  " + listaPersonas.get(x).getDni() + " \n" ;
        }
        if (datos.compareTo("")== 0)
            datos = "No hay datos que mostrar";
        return datos;
        
    }
    
    public static void terminar(){
        System.exit(0);
    }
}

