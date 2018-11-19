/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg3.practica.pkg3.ejercicio.pkg5;

/**
 *
 * @author 1gdaw07
 */
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
public class Capitulo3Practica3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static int tuNumero;
    public static void main(String[] args) {
        // TODO code application logic here
    boolean error=false;
    try
    {           
        String nroAleatorio;
        do
        {
            int nroGenerado=ThreadLocalRandom.current().nextInt(100,999+1);                       
            nroAleatorio = nroGenerado+"";// tambien se puede nroAleatorio=String.valueOf(nroGenerado);
            if(nroAleatorio.charAt(0)==nroAleatorio.charAt(1)||nroAleatorio.charAt(0)==nroAleatorio.charAt(2)||nroAleatorio.charAt(1)==nroAleatorio.charAt(2))
            {
                error=true;
            }
        System.out.println(nroGenerado);
        }
        while(error=false);
        String nroString;
        do
        {
            tuNumero=Integer.parseInt(JOptionPane.showInputDialog("Inserta tu numero"));            
            if(tuNumero<100||tuNumero>999)
                {
                    throw new OpcionNoValida();//excepcion creada por nosotros                
                }        
            nroString=tuNumero+"";
            if(nroString.charAt(0)==nroString.charAt(1)||nroString.charAt(0)==nroString.charAt(2)||nroString.charAt(1)==nroString.charAt(2))
            {
               throw new NumerosDistintos();
            }
            for(int x=0;x<nroString.length();x++)
            {
                if(Character.isDigit(nroString.charAt(x))==false)
                {
                    throw new DatoNoNumerico();
                }
            }        
            acertar(nroString, nroAleatorio);
        }
        while(nroAleatorio.equals(nroString));
    }
    catch(NumberFormatException |NullPointerException| ArithmeticException e)
        {
            JOptionPane.showMessageDialog(null,"Escribe un numero");
            error=true;
        }
    catch(OpcionNoValida e)
        {
            JOptionPane.showMessageDialog(null,"el numero no puede ser menor que 100 o mayor que 999");
            error=true;
        }
    catch(DatoNoNumerico e)
        {
            JOptionPane.showMessageDialog(null,"Solo números");
            error=true;
        }
    catch(NumerosDistintos e)
        {
            JOptionPane.showMessageDialog(null,"Los tres números tienen que ser diferentes");
            error=true;
        }
    catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
            error=true;
        }
    }
    public static void acertar(String nroString, String nroAleatorio)
    {        
        int contadorM=0;
        int contadorH=0;
        for(int x=0;x<nroString.length();x++)        
        {
            if(nroString.charAt(x)==nroAleatorio.charAt(x))
            {
              contadorM++;  
            }
            int y;
            for(y=0; y < nroString.length() && nroString.charAt(y)!= nroAleatorio.charAt(x) ;y++){}
            if (y != nroString.length() && x != y)
                contadorH = contadorH + 1;
        }

              
        JOptionPane.showMessageDialog(null,"tienes "+contadorM+" muertes y tienes "+contadorH+" heridos");
    }
}
