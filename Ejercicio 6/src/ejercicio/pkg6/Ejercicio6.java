/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int r=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));//escribir mensaje
        float area=(float)Math.PI*r*r;//formula area circulo
        JOptionPane.showMessageDialog(null,"El area del riculo es " + area);//mostrar mensaje
        
    }
    
}
