/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    static String respuesta;
    static int c=0;
    public static void main(String[] args) {
        // TODO code application logic here       
        do
        {
          notas();  
        }
        while(respuesta.equalsIgnoreCase("si"));//mientras la respuesta sea igual a si hara el ciclo (equals booleano) (compareTo int)
        JOptionPane.showMessageDialog(null, c+" alumnos han aprobado");
    }
    public static void notas()
    {        
        int n=Integer.parseInt(JOptionPane.showInputDialog("Introduce nota alumno"));
            if(n>=6)
            {
                c=c+1;                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Suspendido");
            }
            do
            {
              respuesta=JOptionPane.showInputDialog("Vas a poner mas notas");  
            }
            while(respuesta.equalsIgnoreCase("si")==false && respuesta.equalsIgnoreCase("no")==false);
            
    }
}
