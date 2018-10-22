/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg3.ejercicio.pkg2;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Capitulo3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena=JOptionPane.showInputDialog("TECLEA UNA CADENA DE CARACTERES");
        invertirCadena((cadena));        
    }
    public static void invertirCadena(String cadena)
    {
        StringBuilder cadenaInvertida=new StringBuilder();//con StringBuilder
        String cadenaInvertida2="";//con String
        for (int x=cadena.length()-1;x>=0;x--)
        {
           cadenaInvertida.append(cadena.charAt(x));//con StringBuilder
           cadenaInvertida2=cadenaInvertida2 + cadena.charAt(x);//con String
        }
        JOptionPane.showMessageDialog(null,"La cadena invertida es "+cadenaInvertida);
    }
}
