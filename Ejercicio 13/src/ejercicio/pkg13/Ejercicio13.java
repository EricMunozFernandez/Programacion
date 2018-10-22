/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    static int h=0;
    static int i=0;
    public static void main(String[] args) {
        // TODO code application logic here
        int g=1;
        for(g=0;g<30;g++)
            {
                String nombre= JOptionPane.showInputDialog("inserta nombre alumno");
                String genero= JOptionPane.showInputDialog("inserta genero alumno (masculino o femenino)");
                int edad=Integer.parseInt (JOptionPane.showInputDialog("inserte la edad del alumno"));
                float peso=Float.parseFloat (JOptionPane.showInputDialog("inserte la peso del alumno"));
                float altura=Float.parseFloat (JOptionPane.showInputDialog("inserte la altura del alumno"));
                if (genero.compareToIgnoreCase("masculino")==0)//si los caracteres son iguales a la cantidad de caracteres de (en nuestro caso masculino) y lo iguala a 0 si tiene mas es + y si tiene menos es -
                    {
                        if(altura>1.7 && peso>70)
                        {
                            JOptionPane.showMessageDialog(null, nombre +" puede jugar");
                            h=h+1;                     
                            
                        }
                    }
                else
                {
                    if(altura>1.6 && peso>60)
                    {
                        JOptionPane.showMessageDialog(null, nombre +" puede jugar");
                        i=i+1; 
                        
                    }
                }
            }
        JOptionPane.showMessageDialog(null, h+" chicos pueden jugar y "+i+" chicas pueden jugar");
        }
    
}
