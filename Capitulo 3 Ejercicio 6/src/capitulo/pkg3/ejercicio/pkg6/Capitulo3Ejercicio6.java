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
                String FechaString=JOptionPane.showInputDialog("inserta la fecha dd/MM");                
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");
                fechaUno.setTime(formatter.parse(FechaString));
                Calendar IPrimavera = Calendar.getInstance();
                IPrimavera.set(0000,1,1);
                JOptionPane.showMessageDialog(null,IPrimavera.getTime());                
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
