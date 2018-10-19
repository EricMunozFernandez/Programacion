/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.string.y.fechas;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class PracticaStringYFechas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int c=0;        
        String mensaje=JOptionPane.showInputDialog("Introdice una palabra");
        for (int x=0; x <mensaje.length();x++)
        {
            if (mensaje.charAt(x)=='a'||mensaje.charAt(x)=='e'||mensaje.charAt(x)=='i'||mensaje.charAt(x)=='o'||mensaje.charAt(x)=='u')
            {
                c++;
            }
        }
        JOptionPane.showMessageDialog(null, c +" vocales");
    }
    
}
