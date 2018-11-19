/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=Integer.parseInt (JOptionPane.showInputDialog("Inserta el valor 1"));
        int b=Integer.parseInt (JOptionPane.showInputDialog("Inserta el valor 2"));
        int c=Integer.parseInt (JOptionPane.showInputDialog("Inserta el valor 3"));
        if(a>b&&a>c)
        {
            JOptionPane.showMessageDialog(null,"el valor 1 es el mas grande");
            if(b>c)
            {
                JOptionPane.showMessageDialog(null,"el valor 3 es el mas pequeño");
            }          
            else {
                JOptionPane.showMessageDialog(null,"el valor 2 es el mas pequeño");
            }
        }
        else
        {
            if(b>c)
            {
                JOptionPane.showMessageDialog(null,"el valor 2 es el mas grande");
                if(a>c)
                {
                    JOptionPane.showMessageDialog(null,"el valor 3 es el mas pequeño");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"el valor 1 es el mas pequeño");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"el valor 3 es el mas grande");
                if(a>b)
                {
                    JOptionPane.showMessageDialog(null,"el valor 2 es el mas pequeño");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"el valor 1 es el mas pequeño");
                }
            }
        }
    }
    
}
