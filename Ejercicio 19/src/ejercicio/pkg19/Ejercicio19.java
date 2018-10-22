/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg19;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que se le sacara el cuadrado solo con sumas"));
        int uno=1,c=0, impar, fin;
        do
        {
           impar=uno+2;
           fin=uno+impar;
           uno=impar;
           c=c+1;
        }
        while(c!=numero);
        JOptionPane.showMessageDialog(null,fin+"= el cuadrado de "+numero);
    }
    
}
