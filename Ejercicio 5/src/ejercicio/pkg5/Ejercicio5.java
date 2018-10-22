/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float c=Float.parseFloat(JOptionPane.showInputDialog("Introduce grados celsius"));
        float f=1.8f*c+32;
        JOptionPane.showMessageDialog(null, c+" CELSIUS son "+ f + " fahrenheit");
        
        
    }
    
}
