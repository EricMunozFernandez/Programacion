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
    public static int sumaAleatorio;
    public static int numeroAleatorio1;
    public static int numeroAleatorio2;
    public static String nA1;
    public static String nA2;
    public static String sumaA;
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana1 v=new Ventana1();
        v.setVisible(true);
    }
    public static void crearAleatorio()
    {
        Random rd1 = new Random();
        numeroAleatorio1 = rd1.nextInt(100)+1;
        nA1=""+numeroAleatorio1;
        Random rd2 = new Random();        
        numeroAleatorio2 = rd2.nextInt(100)+1;
        nA2=""+numeroAleatorio2;
    }
    public static void sumaAleatorio()
    {
        sumaAleatorio=numeroAleatorio1+numeroAleatorio2;
        sumaA=""+sumaAleatorio;
    }
    public static void comprobar()
    {
        int respuesta=Integer.parseInt(JOptionPane.showInputDialog("Inserta el numero:"));        
        int contador=0;
        int acierto=0;
        int fallo=0;
        if (respuesta==sumaAleatorio)
        {
            acierto++;
            contador++;
        }
        else
        {
            fallo++;
            contador++;
        }        
    }
}
