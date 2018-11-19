/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=Integer.parseInt(JOptionPane.showInputDialog("Inserte numero del dia de la semana"));
        switch(n)
        {
            case 1:
               {
                JOptionPane.showMessageDialog(null,"lunes");
                break;
               }
            case 2:
               {
                JOptionPane.showMessageDialog(null,"martes");
                break;
               }
            case 3:
               {
                JOptionPane.showMessageDialog(null,"miercoles");
                break;
               }
            case 4:
               {
                JOptionPane.showMessageDialog(null,"jueves");
                break;
               }
            case 5:
               {
                JOptionPane.showMessageDialog(null,"viernes");
                break;
               }
            case 6:
               {
                JOptionPane.showMessageDialog(null,"sabado");
                break;
               } 
            case 7:
               {
                JOptionPane.showMessageDialog(null,"domingo");
                break;
               }    
            default:
                {
                JOptionPane.showMessageDialog(null,"dias entre 0 y 7");
                break;
                }
        }
    }
       
}
