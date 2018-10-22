/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double c=1;
        double resultado=0;
        String respuesta;
        do
        {
          int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del alumno"));
          c=c+1;
          resultado+=edad;//resultado=resultado+edad
          respuesta=JOptionPane.showInputDialog("¿Hay mas alumnos?");
        }
        while(respuesta.equals("si"));
        JOptionPane.showMessageDialog(null, "El promedio de edad de "+c+ " alumnos es de "+(resultado/c));           
    }    
}
