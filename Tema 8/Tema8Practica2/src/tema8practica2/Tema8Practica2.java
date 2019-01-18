/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8practica2;

import UML.Persona;
import Vistas.*;
import java.util.ArrayList;
/**
 *
 * @author 1gdaw07
 */
public class Tema8Practica2 {

    /**
     * @param args the command line arguments
     */
    public static Ventana1 v;
    public static Ventana2 v2; 
    public static ArrayList<Persona>listaPersona=new ArrayList();;
    public static void main(String[] args) {
        // TODO code application logic here
        inicializarVentanas();
    }
    public static void inicializarVentanas(){
        
        v=new Ventana1();
        v.setVisible(true);
        
        v2=new Ventana2();
        
    }
    public static void añadirPersona(String tfNombre, String tfApellido,String tfDni)    {
        
        Persona p=new Persona(tfNombre, tfApellido, tfDni);        
        listaPersona.add(p);
        
    }
    public static void verLista()
    {
        v.setVisible(false);
        v2.setVisible(true);
        String lista="";
        for(int x=0;x<listaPersona.size();x++)
        {
            lista=lista+"Nombre: "+listaPersona.get(x).getNombre()+" Apellido: "+listaPersona.get(x).getApellido()+" DNI: "+listaPersona.get(x).getDni()+"\n";
        }
        v2.mostrar(lista);
    }
    public static void salir(){
        v.dispose();
        v2.dispose();
        System.exit(0);
    }
   
}
