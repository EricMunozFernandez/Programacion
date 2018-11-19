/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg14;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long n=0;
        int c;
        for(c=0;c<10;c++)
        {
            int valor=Integer.parseInt(JOptionPane.showInputDialog("Inserte valor para la suma de 10 numeros"));
            n=n+valor;            
        }
        JOptionPane.showMessageDialog(null,n+ " es el valor final de la suma de 10 digitos");
    }
    
}
