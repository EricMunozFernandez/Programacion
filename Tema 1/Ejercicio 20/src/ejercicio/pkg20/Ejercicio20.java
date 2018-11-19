/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg20;

/**
 *
 * @author 1gdaw07
 */
import java.util.Random;
import javax.swing.JOptionPane;
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String respuesta;
       Random rd = new Random();
       int numeroAleatorio = rd.nextInt(100)+1;       
       int entrada=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero para acertar"));
       do
       {         
            if (entrada==numeroAleatorio)
            {
                respuesta="fin";
            }
            else
            {
                if(entrada<numeroAleatorio)
                {
                    JOptionPane.showMessageDialog(null,"El numero es mayor");
                    respuesta=JOptionPane.showInputDialog("¿quieres finalizar?(escribe fin)");
                    if(respuesta.compareToIgnoreCase("fin")!=0)
                        {                 
                            entrada=Integer.parseInt(JOptionPane.showInputDialog("vuelve a introducir el numero"));
                        }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"El numero es menor");
                    respuesta=JOptionPane.showInputDialog("¿quieres finalizar?(escribe fin)");
                    if(respuesta.compareToIgnoreCase("fin")!=0)
                        {                 
                            entrada=Integer.parseInt(JOptionPane.showInputDialog("vuelve a introducir el numero"));
                        }             
                }
                  
            }
       }
       while(respuesta.compareToIgnoreCase("fin")!=0);
       JOptionPane.showMessageDialog(null, "Has finalizado, el numero es "+numeroAleatorio);
    }    
}