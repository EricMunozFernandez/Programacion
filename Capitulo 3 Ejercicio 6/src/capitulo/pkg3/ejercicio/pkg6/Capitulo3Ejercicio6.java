/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg3.ejercicio.pkg6;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Capitulo3Ejercicio6 {

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
                Calendar fechaUno = Calendar.getInstance();                
                String FechaString=JOptionPane.showInputDialog("inserta la fecha MM/dd");                
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd");
                fechaUno.setTime(formatter.parse(FechaString));   
                
                final Calendar IPrimavera = Calendar.getInstance();
                IPrimavera.set(1970,2,21);
                final Calendar IVerano = Calendar.getInstance();
                IVerano.set(1970,5,21);
                final Calendar IOtoño = Calendar.getInstance();
                IOtoño.set(1970,8,22);
                final Calendar IInvierno = Calendar.getInstance();
                IInvierno.set(1970,11,21);
                
                if(fechaUno.after(IPrimavera)&&fechaUno.before(IVerano))
                {
                 JOptionPane.showMessageDialog(null,"Primavera");
                }
                else
                {
                    if(fechaUno.after(IVerano)&&fechaUno.before(IOtoño))
                    {
                        JOptionPane.showMessageDialog(null,"Verano");
                    }
                    else
                    {
                        if(fechaUno.after(IOtoño)&&fechaUno.before(IInvierno))
                        {
                            JOptionPane.showMessageDialog(null,"Otoño");
                        }
                        else
                        {
                            
                            JOptionPane.showMessageDialog(null,"Invierno");
                            
                        }
                    }
                }
                error=false;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error");
                error=true;
            }
            finally
            {
                JOptionPane.showMessageDialog(null,"Programa finalizado");
            }
        }
        while(error==true);
    }
    
}
