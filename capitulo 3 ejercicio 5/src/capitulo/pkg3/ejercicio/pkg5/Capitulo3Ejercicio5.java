/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg3.ejercicio.pkg5;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Capitulo3Ejercicio5 {

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
                String FechaString=JOptionPane.showInputDialog("inserta la fecha dd/MM/yy");                
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
                fechaUno.setTime(formatter.parse(FechaString));//para pasar de Date a calendar Calendar nombre=Calendar.getInstance(); Calendar.setTime(nombreDelDate);
                fechaUno.add(Calendar.DAY_OF_YEAR,100);                
                JOptionPane.showMessageDialog(null,"La fecha es "+fechaUno.getTime());
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
