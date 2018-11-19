/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg3.ejercicio.pkg3;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Capitulo3Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c=0;
        String cadena=JOptionPane.showInputDialog("Introduce cadena de caracteres");
        String z=JOptionPane.showInputDialog("Introduce el caracter que quieres saber su cantidad en la cadena anterior");
        char y = z.charAt(0);
        for (int x=0; x <cadena.length();x++)
        {
            if(cadena.charAt(x)==y)
            {
                c++;
            }
        }
        JOptionPane.showMessageDialog(null,"la letra "+y+" sale "+c+" veces en la cadena de "+cadena);
    }
    
}
