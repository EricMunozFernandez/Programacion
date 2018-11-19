/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=Integer.parseInt(JOptionPane.showInputDialog("Inserte nota alumno"));
        while (n>10 || n<0)
        {
          JOptionPane.showMessageDialog(null,"Nota entre 0 y 10");
          n=Integer.parseInt(JOptionPane.showInputDialog("Inserte nota alumno"));
        }
        
          if (n>=5)
          {
            JOptionPane.showMessageDialog(null,"aprobado");  
          }
          else
          {
            JOptionPane.showMessageDialog(null,"suspenso");
          }
        
                
        
    }
    
}
