/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg21;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero para saber si es primo"));
        int div=numero-1;
        int resto=0;
        while(div!=1)
        {
            resto=numero%div;
            div=div-1;
        }
        if(resto!=0)
        {
            JOptionPane.showMessageDialog(null,numero+" es primo");
        }
        else
        {
            JOptionPane.showMessageDialog(null,numero+" no es primo");
        }        
    }    
}
