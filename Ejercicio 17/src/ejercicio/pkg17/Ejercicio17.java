/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg17;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
        static int max=-1, min=11;
        static String nmax="";
        static String nmin="";
    public static void main(String[] args) {
        // TODO code application logic here
        for(int c=0;c<40;c=c+1)
        {
            String nombre=JOptionPane.showInputDialog("Introduce nombre alumno");
            int nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce nota alumno"));
            calcularMaxmin(nota,nombre);
        }
        JOptionPane.showMessageDialog(null,"El alumno "+nmax+" a sacado "+max+" como nota maxima y el alumno "+nmin+" a sacado "+min+" como nota minima");
    }
    public static void calcularMaxmin(int nota,String nombre)
    {
        if(nota>=max)
            {
                max=nota;
                nmax=nombre;
            }
            if(nota<=min)
            {
                min=nota;
                nmin=nombre;
            }
    }
}
