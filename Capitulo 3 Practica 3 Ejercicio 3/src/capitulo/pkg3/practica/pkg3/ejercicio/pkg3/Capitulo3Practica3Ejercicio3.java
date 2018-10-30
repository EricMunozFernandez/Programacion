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
        boolean error=false;
        do
        {
            try
            {
                int Opcion=Integer.parseInt(JOptionPane.showInputDialog("nº1 Sumar dos numeros. \nnº2 Restar dos numeros. \nnº3 Visualizar la tabla de multiplicar de un numero. \nnº4 Visualizar el cociente y el resto de una division. \nnº5 Salir del programa."));
                switch(Opcion)
                {
                    case 1:
                    {
                        suma();
                        break;
                    }
                    case 2:
                    {
                        resta();
                        break;
                    }
                    case 3:
                    {
                        multi();
                        break;
                    } 
                    case 4:
                    {
                        
                        break;
                    }
                    case 5:
                    {
                        error=false;
                        break;
                    }
                }
                error=false;   
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"La nota es un numero");   
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error");
                error=true;
            }
            finally
            {
                JOptionPane.showMessageDialog(null,"FIN");
            }
        }
        while(error==true);
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
        int b=1,c=0,multi;
        String serie=numero+" "+b+" ";
        while (c<10)
        {
            multi=numero*c;
            serie=serie+multi+" ";
            numero=multi;
            b++;
            c++;
        }
        JOptionPane.showMessageDialog(null,serie);
    }
}
