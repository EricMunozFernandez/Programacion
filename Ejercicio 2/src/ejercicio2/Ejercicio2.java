/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author 1gdaw07
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valorA =javax.swing.JOptionPane.showInputDialog("Introduce valor del primer numero");
        int n1= Integer.parseInt(valorA);//transformar String a int
        String valorB =javax.swing.JOptionPane.showInputDialog("Introduce valor del segundo numero");
        int n2= Integer.parseInt(valorB);//transformar String a int
        int multi= n1*n2;//multiplicacion
        javax.swing.JOptionPane.showMessageDialog(null, "la multiplicacion de "+n1 +" y "+n2+" es "+ multi);
        
        
    }
    
}
