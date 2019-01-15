/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg8.practica.pkg1;

import Vista.Ventana1;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Tema8Practica1 {

    /**
     * @param args the command line arguments
     */
    public static String nA1;
    public static String nA2;
    public static String a;
    public static String c;
    public static String f;
    public static String sumaA;
    public static int contador=0;
    public static int acierto=0;
    public static int fallo=0;
    public static Ventana1 v;
    public static void main(String[] args) {
        // TODO code application logic here
        v=new Ventana1();
        v.setVisible(true);
        
    }
    public static void crearAleatorio()
    {
        Random rd1 = new Random();
        int numeroAleatorio1 = rd1.nextInt(100)+1;
        nA1=""+numeroAleatorio1;
        Random rd2 = new Random();        
        int numeroAleatorio2 = rd2.nextInt(100)+1;
        nA2=""+numeroAleatorio2;
        int sumaAleatorio=numeroAleatorio1+numeroAleatorio2;
        sumaA=""+sumaAleatorio;          
    }
    public static void comprobar()
    {
        
        String respuesta=JOptionPane.showInputDialog("Inserta el numero:");        
        if (respuesta.equals(sumaA))
        {
            acierto++;
            a=""+acierto;
            contador++;
            c=""+contador;
        }
        else
        {
            fallo++;
            f=""+fallo;
            contador++;
            c=""+contador;
        }        
    }
    public static void salir()
    {
        v.dispose();
        System.exit(0);
    }
}
