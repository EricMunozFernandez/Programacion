/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg4.practica.pkg1.ejercicio.pkg3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo4Practica1Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]litros=new int[2][10];        
        for(int x=0;x<litros.length;x++)
        {            
            for(int y=0;y<litros[x].length;y++)
            {
                litros[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Inserta litros del dia "+(y+1)+" del mes "+(x+1)));                 
            }            
        }
        JOptionPane.showMessageDialog(null,"ha llovido"+Arrays.deepToString(litros));
    }
    
}
