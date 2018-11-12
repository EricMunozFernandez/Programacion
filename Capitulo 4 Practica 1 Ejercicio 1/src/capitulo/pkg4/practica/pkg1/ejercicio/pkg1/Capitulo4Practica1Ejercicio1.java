/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg4.practica.pkg1.ejercicio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo4Practica1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[]nros=new double[10];
        double max, min;
 
        
        for(int x=0;x<nros.length;x++)
        {
            nros[x]=Double.parseDouble(JOptionPane.showInputDialog("Inserta el numero "+(x+1)));            
        }
        min=max=nros[0];
        for(int x=0;x<nros.length;x++)
        {
            if(min>nros[x])
            {
                min=nros[x];
            }
            if(max<nros[x])
            {
                max=nros[x];
            }
        }
        JOptionPane.showMessageDialog(null,"El numero maximo es "+max+" y el numero minimo es "+min);
    }
    
}
