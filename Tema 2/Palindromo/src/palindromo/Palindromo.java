/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena=JOptionPane.showInputDialog("Teclea un cadena");
        boolean palindromo=fPalindromo(cadena);
        if(palindromo)
        {
            JOptionPane.showMessageDialog(null,cadena+" es palindromo");
        }
        else
        {
            JOptionPane.showMessageDialog(null,cadena+" no es palindromo");
        }
    }
    public static boolean fPalindromo (String cadena)
    {
        int x=0;
        int y =cadena.length()-1;
        while(cadena.charAt(x)==cadena.charAt(y) && x<y)
        {
            x++;
            y--;            
        }
        //return x>=y;
        if(x<y)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
}
