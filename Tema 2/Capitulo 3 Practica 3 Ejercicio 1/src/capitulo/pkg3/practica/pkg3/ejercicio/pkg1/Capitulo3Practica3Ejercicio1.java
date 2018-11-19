/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg3.practica.pkg3.ejercicio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo3Practica3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
        public static byte horas;
        public static char ec;
        public static char ne;
    public static void main(String[] args) {
        // TODO code application logic here
        boolean error=false;
        do
        {
            try
            {
                DatosTrabajador();
                float sueldo=CalcularSueldo();
                JOptionPane.showMessageDialog(null,"El sueldo final es "+sueldo);
                error=false;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Las horas son numeros");
                error=true;
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
    public static void DatosTrabajador()throws Exception
    {
        horas=Byte.parseByte(JOptionPane.showInputDialog("Inserta horas de trabajo"));
        do            
        {
            ec=JOptionPane.showInputDialog("Insterte Es tado civil (S de soltero, C de casado, V de viudo y D de divorciado)").charAt(0);
            ec=Character.toUpperCase(ec);
        }
        while(ec!='S'&&ec!='C'&&ec!='V'&&ec!='D');
        do
        {
        ne=JOptionPane.showInputDialog("P de primario, M de medo y S de superior").charAt(0);
        ne=Character.toUpperCase(ne);
        }
        while(ne!='P'&&ne!='M'&&ne!='S');
    }
    public static float CalcularSueldo()
    {
        final float PRECIOHORANORMAL=10;
        final float PRECIOHORAEXTRA=15;
        final float PLUS=100;
        float sueldo;
        if(horas>40)
        {
            sueldo=(horas-40)*PRECIOHORAEXTRA+40*PRECIOHORANORMAL;
        }
        else
        {
            sueldo=horas*PRECIOHORANORMAL;
        }
        if(ec=='S')
        {
            sueldo=sueldo+PLUS;
        }
        else
        {
            if(ne=='S')
            {
                sueldo=sueldo+PLUS;
            }
            else
            {
                if(ec=='V'&&ne=='P')
                {
                    sueldo=sueldo+PLUS;
                }
            }
        }
        return(sueldo);
    }
}
