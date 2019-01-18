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

    public static void main(String[] args) {
        // Simulación de la base de datos
        listaPersonas = new ArrayList<Persona>();
        crearCursos();
        v1 = new Ventana1();
        v1.setVisible(true);
    }
    public static void crearCursos()
    {
        listaCursos=new ArrayList<Curso>();
               
    }
    public static boolean validarDni(String dni){
        // Comprobamos que no está repetido
        int x;
        for(x = 0; x < listaPersonas.size() && listaPersonas.get(x).getDni().compareTo(dni)!= 0; x++){}
        if (x == listaPersonas.size())
            return true;
        return false;
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

