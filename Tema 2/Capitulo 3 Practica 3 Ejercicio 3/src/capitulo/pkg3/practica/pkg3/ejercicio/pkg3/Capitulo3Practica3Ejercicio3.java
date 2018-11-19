/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg3.practica.pkg3.ejercicio.pkg3;


/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Capitulo3Practica3Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Opcion;
        try
        {
            boolean error=false;
            do
            {
                try
                {                   
                    Opcion=Integer.parseInt(JOptionPane.showInputDialog("nº1 Sumar dos numeros. \nnº2 Restar dos numeros. \nnº3 Visualizar la tabla de multiplicar de un numero. \nnº4 Visualizar el cociente y el resto de una division. \nnº5 Salir del programa."));                   
                        switch(Opcion)
                        {
                            case 1:
                            {
                                suma();
                                error=true;
                                break;
                            }
                            case 2:
                            {
                                resta();
                                error=true;
                                break;
                            }
                            case 3:
                            {
                                multi();
                                error=true;
                                break;
                            } 
                            case 4:
                            {
                                division();
                                error=true;
                                break;
                            }
                            case 5:
                            {
                                error=false;
                                break;
                            }
                        }                                          
                }
                catch(NumberFormatException |NullPointerException| ArithmeticException e)
                {
                    JOptionPane.showMessageDialog(null,"Escribe un numero");
                    error=true;
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Error");
                    error=true;
                }
            
            }
            while(error==true);
        }
        finally
            {
                JOptionPane.showMessageDialog(null,"FIN");
            }
    }
    public static void suma() throws Exception
    {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("inserta el numero 1 para sumar"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("inserta el numero 2 para sumar"));
        int suma=n1+n2;
        JOptionPane.showMessageDialog(null,"La suma es "+suma);        
    }
    public static void resta() throws Exception
    {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("inserta el numero 1 para sumar"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("inserta el numero 2 para sumar"));
        int resta=n1+n2;
        JOptionPane.showMessageDialog(null,"La suma es "+resta);
    }
    public static void multi() throws Exception
    {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero a multiplicar"));
        int c=0,multi;
        String serie="";
        while (c<11)
        {
            multi=numero*c;
            serie=serie+numero+"x"+c+"="+multi+"\n";            
            c++;
        }
        JOptionPane.showMessageDialog(null,serie);
    }
    public static void division() throws Exception
    {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero a dividir"));
        int divisor=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero divisor"));
        int resto, div;
        div=numero/divisor;
        resto=numero%divisor;
        JOptionPane.showMessageDialog(null,"la division es "+div+" el resto es "+resto);
    }
}
