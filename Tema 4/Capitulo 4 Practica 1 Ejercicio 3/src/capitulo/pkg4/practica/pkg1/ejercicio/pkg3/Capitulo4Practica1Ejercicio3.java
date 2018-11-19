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
        int [][]litros=new int[12][31];
        int []sumaDias=new int [12];
        String []meses=new String[12]; 
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
        for(int x=0;x<litros.length;x++)
        {            
            for(int y=0;y<litros[x].length;y++)
            {
                litros[x][y]=Integer.parseInt(JOptionPane.showInputDialog("Inserta litros del dia "+(y+1)+" del mes "+(x+1)));                 
            }            
        }
        for(int m=0;m<sumaDias.length;m++)
        {
            sumaDias[m]=0;  
            for (int i = 0; i < litros[m].length; i++)
            {  
               sumaDias[m]=sumaDias[m]+litros[m][i];                  
            }        
        }
        String serie="";
        for(int x=0;x<meses.length;x++)
        {
            serie=serie+"En el mes "+meses[x]+" a llovido: "+sumaDias[x]+" L\n";
        }
        JOptionPane.showMessageDialog(null,serie);
    }    
}
