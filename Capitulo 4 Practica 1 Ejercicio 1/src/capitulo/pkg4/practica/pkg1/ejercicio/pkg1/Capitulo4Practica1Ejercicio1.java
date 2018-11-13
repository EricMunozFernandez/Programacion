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
        try
        {
        double[]nros=new double[10];            
        EntradaDatos(nros);
        SalidaDatos(nros);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Tiene que ser un numero");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
   
        }
    }
    public static void EntradaDatos(double nros[])throws Exception
    {
        for(int x=0;x<nros.length;x++)
        {
            nros[x]=Double.parseDouble(JOptionPane.showInputDialog("Inserta el numero "+(x+1)));            
        }
    }
    public static void SalidaDatos(double nros[])throws Exception
    {
        double max, min;
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
        //Array.sort(nros); ordena de menor a mayor
        JOptionPane.showMessageDialog(null,"El numero maximo es "+max+" y el numero minimo es "+min);
    }
    
}
