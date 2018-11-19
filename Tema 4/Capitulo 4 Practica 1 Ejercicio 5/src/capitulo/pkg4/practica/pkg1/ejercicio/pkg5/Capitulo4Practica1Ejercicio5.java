/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg4.practica.pkg1.ejercicio.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo4Practica1Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precio=Double.parseDouble(JOptionPane.showInputDialog("Inserta precio"));       
        double entrada=Double.parseDouble(JOptionPane.showInputDialog("Cuanto dinero tienes?"));       
        double devolver=entrada-precio;
        devolver=(double) Math.round(devolver * 100) / 100;
        JOptionPane.showMessageDialog(null,"La cantidad ha devolver es"+devolver);
        int contador[]=new int[15];
        double dinero[]=new double[15];
        dinero[0]=500.00;
        dinero[1]=200.00;
        dinero[2]=100.00;
        dinero[3]=50.00;
        dinero[4]=20.00;
        dinero[5]=10.00;
        dinero[6]=5.00;
        dinero[7]=2.00;
        dinero[8]=1.00;
        dinero[9]=0.50;
        dinero[10]=0.20;
        dinero[11]=0.10;
        dinero[12]=0.05;
        dinero[13]=0.02;
        dinero[14]=0.01;        
        String serie="";
        for(int x=0;x<dinero.length;x++)
        {
            serie=serie+contador[x]+" de "+dinero[x]+" €\n";
        }
        JOptionPane.showMessageDialog(null,"La cantida a devolver es:\n"+serie);       
    }    
}
