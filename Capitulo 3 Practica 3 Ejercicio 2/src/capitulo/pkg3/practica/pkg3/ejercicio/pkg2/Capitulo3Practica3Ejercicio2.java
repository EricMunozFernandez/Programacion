/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg3.practica.pkg3.ejercicio.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo3Practica3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static boolean vn;
    public static boolean c;
    public static boolean j;
    public static boolean s;
    public static void main(String[] args) {
        // TODO code application logic here
        boolean error=false;
        do
        {
            try
            {    
                int VisualNet;
                int Cobold;
                int Java;
                int SQL;
                VisualNet=JOptionPane.showConfirmDialog(null,"¿Sabes Visual.Net?");
                if(VisualNet==0)
                {
                    vn=true;
                }
                Cobold=JOptionPane.showConfirmDialog(null,"¿Sabes Cobold?");
                if(Cobold==0)
                {
                    c=true;
                }
                Java=JOptionPane.showConfirmDialog(null,"¿Sabes Java?");
                if(Java==0)
                {
                    j=true;
                }
                SQL=JOptionPane.showConfirmDialog(null,"¿Sabes SQL?");
                if(SQL==0)
                {
                    s=true;
                }   
               CalcularNota();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error");
            }
            finally
            {
                JOptionPane.showMessageDialog(null,"FIN");
            }
        }
        while(error==true);
    }
    public static void CalcularNota()
    {
        if(vn==true&&j==true&&c==true&&s==true)
        {            
            JOptionPane.showMessageDialog(null,"Sobresaliente");
        }
        else
        {
            if(c==true&&s==true&&(vn==true||j==true))
            {
                JOptionPane.showMessageDialog(null,"Notable");
            }
            else
            {
                if(c==true&&s==true)
                {
                    JOptionPane.showMessageDialog(null,"Bien");
                }
                else
                {
                    if(s==true&&(vn==true||j==true))
                    {
                        JOptionPane.showMessageDialog(null,"Suficiente");
                    }
                    else
                    {
                        if(c==true&&(vn==true||j==true))
                        {
                            JOptionPane.showMessageDialog(null,"Suficiente");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Insuficiente");
                        }
                    }
                }
            }
        }
    }            
}
