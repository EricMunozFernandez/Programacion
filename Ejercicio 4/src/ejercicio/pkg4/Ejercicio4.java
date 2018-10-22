/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float d1 =Float.parseFloat (JOptionPane.showInputDialog("Inserta valor diagonal pequeña del rombo"));
        float d2 =Float.parseFloat (JOptionPane.showInputDialog("Inserta valor diagonal grande del rombo"));
        float area =d2*d1/2;
        JOptionPane.showMessageDialog(null,"El area del rombo es "+ area);
    }
    
}
