/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg18;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ciclo=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de ciclos que haras en la serie fibonacci"));
        int a=1,b=1,c=2,suma;
        String serie=a+" "+b+" ";
        while (c<ciclo)
        {
            suma=a+b;
            serie=serie+suma+" ";
            a=b;
            b=suma;
            c++;
        }
        JOptionPane.showMessageDialog(null,serie+" es es la serie fibonacci en el ciclo "+ciclo);
    }
    
}
