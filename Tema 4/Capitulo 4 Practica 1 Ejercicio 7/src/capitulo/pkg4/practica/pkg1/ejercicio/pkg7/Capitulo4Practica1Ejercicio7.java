/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg4.practica.pkg1.ejercicio.pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Capitulo4Practica1Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] Codigo = {10, 23, 30, 47, 55, 65, 135, 256, 526, 663};
        int [] cantidad = new int [10];
        char continuar;
        do{
            int producto= Integer.parseInt(JOptionPane.showInputDialog("Teclea el codigo producto"));        
            int x;  
            for(x = 0; x < Codigo.length &&  Codigo[x]!=producto; x++)
            {}
            if (x == Codigo.length)
            {
                JOptionPane.showMessageDialog(null,"codigo no valido");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"codigo correcto");
            }
            int cantProd = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la cantidad del producto"));
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? <s/n>").toLowerCase().charAt(0);
        }
        while (continuar == 's');
        
    }
    
}
