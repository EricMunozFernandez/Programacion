/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg4.practica.pkg1.ejercicio.pkg7;

import java.util.Arrays;
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
                int cantProd = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la cantidad del producto"));
                cantidad[x]=cantProd;
            }            
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? <s/n>").toLowerCase().charAt(0);
        }
        while (continuar == 's');
        int min=100;
        int pos=0;
        for(int x=0;x<cantidad.length;x++)
        {
            for(pos=0;pos<cantidad.length;pos++)
            {
                if(min>cantidad[pos])
                {
                    min=cantidad[pos];
                }                 
            }
            cantidad[pos]=cantidad[0];
            cantidad[0]=min;
            int aux=Codigo[pos];
            Codigo[pos]=Codigo[0];
            Codigo[0]=aux;
        }        
        String lista="";
        for(int i=0; i<cantidad.length;i++)
        {
            lista=lista+"El producto "+Codigo[i]+" tiene "+cantidad[i]+" unidades\n";
        }
        JOptionPane.showMessageDialog(null,lista);
    }
    
}
