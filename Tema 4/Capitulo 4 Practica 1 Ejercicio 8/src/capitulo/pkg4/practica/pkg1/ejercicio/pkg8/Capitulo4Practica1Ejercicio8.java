/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg4.practica.pkg1.ejercicio.pkg8;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Capitulo4Practica1Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tabla [][] = new int [10][10];
        int suma=0;
        char continuar;
        do{
            int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de fila"));
            int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de columna"));
            int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un dato para esa posicion"));
            tabla [fila - 1][columna - 1] = dato;  
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? <s/n>").toLowerCase().charAt(0);
        }
        while (continuar == 's');
        String fin = "";
        for (int x = 0; x < tabla.length; x++)
        {
           
           for (int y = 0; y < tabla[x].length; y++)  
                suma += tabla[x][y];
           fin = fin + (x+1) + " - " + suma+ "\n";
  
        }   
       JOptionPane.showMessageDialog(null, "Las filas son: \n" + fin ); 
    }
    
}
