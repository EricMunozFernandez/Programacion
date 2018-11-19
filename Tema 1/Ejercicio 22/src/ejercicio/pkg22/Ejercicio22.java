/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg22;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    static int resto;
    static int n=1;
    public static void main(String[] args) {
        // TODO code application logic here
        int nf=Integer.parseInt(JOptionPane.showInputDialog("Introdice el numero para sabes si es primo y todos sus anteriores"));

        do
        {
            primos();
            n++;
        }
        while(n<=nf);
    }
    public static void primos()
    {
        int div;
        if(n<4)//todos los numeros antes de 4 son primos
            {
                JOptionPane.showMessageDialog(null, n+" es primo");
            }
            else
            {
                div=n;
                while(div!=1)
                {
                    resto=n%div;
                    div=div-1;
                }
                if(resto!=0)
                {
                    JOptionPane.showMessageDialog(null,n+" es primo");
                }
            }
    }
}
