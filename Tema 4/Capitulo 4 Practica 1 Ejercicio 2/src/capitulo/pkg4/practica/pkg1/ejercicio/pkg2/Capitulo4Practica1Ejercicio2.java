/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg4.practica.pkg1.ejercicio.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo4Practica1Ejercicio2 {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        // TODO code application logic here        
        String[]  meses=new String[12];       
        MesesDatos(meses);
        Datos(meses);        
    }
    public static void MesesDatos(String meses[])
    {
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";
        meses[4]="mayo";
        meses[5]="junio";
        meses[6]="julio";
        meses[7]="agosto";
        meses[8]="septiembre";
        meses[9]="octubre";
        meses[10]="noviembre";
        meses[11]="diciembre";        
    }
    public static void Datos(String meses[])
    {        
        try
        {
            String respuesta=JOptionPane.showInputDialog("Introduce el mes");
            for(int x=0;x< meses.length;x++)
            {
                if(respuesta.equalsIgnoreCase( meses[x]))
                {
                    JOptionPane.showMessageDialog(null,"el mes "+  meses[x]+" es correcto");
                    JOptionPane.showMessageDialog(null,"FIN");
                    System.exit(0);
                }                         
            }
            JOptionPane.showMessageDialog(null,respuesta+" no es un mes");
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
        }        
    }
}
