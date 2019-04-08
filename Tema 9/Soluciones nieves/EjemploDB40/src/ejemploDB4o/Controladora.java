/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploDB4o;

import Modelo.BaseDatos;
import Modelo.Persona;
import Modelo.PersonaBD;
import Vista.*;
import java.util.ArrayList;
public class Controladora {

    private static Ventana v;
    private static Persona p;
    private static  PersonaBD pbd;
    
    public static void main(String[] args) {
        try{
        BaseDatos bd = new BaseDatos();
        pbd = new PersonaBD(bd.getConexion());
        
        v = new Ventana();
        v.setVisible(true);
        }
        catch(Exception e) {
            
        }
    }
    
    public static void tenDatos(String dni, String nombre,Integer edad) throws Exception
    {
        p = new Persona(dni,nombre,edad);
        pbd.insertar(p);
        mostrarDatos();
        System.exit(0);
  
    }
    
    public static void mostrarDatos(){
        ArrayList<Persona> lista = pbd.consultaTodos();
        String datos = "";
        for(Persona pe:lista)
            datos += pe.getDni() + " " + pe.getNombre() + " " + pe.getEdad() + "\n";
        System.out.println(datos);
    }
    
}
