/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=Integer.parseInt(JOptionPane.showInputDialog("Inserte nota alumno"));
        switch(n)
        {
            case 0: case 1: case 2:
               {
                JOptionPane.showMessageDialog(null,"muy deficiente");
                break;
               }
            case 3: case 4:
               {
                JOptionPane.showMessageDialog(null,"insuficiente");
                break;
               }
            case 5: case 6:
               {
                JOptionPane.showMessageDialog(null,"bien");
                break;
               }
            case 7: case 8:
               {
                JOptionPane.showMessageDialog(null,"notable");
                break;
               }
            case 9: case 10:
               {
                JOptionPane.showMessageDialog(null,"sobresaliente");
                break;
               } 
            default:
                {
                JOptionPane.showMessageDialog(null,"Nota entre 0 y 10");
                break;
                }
        }
    }
    
}
