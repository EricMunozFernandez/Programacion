/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg3.ejercicio.pkg4;

/**
 *
 * @author 1gdaw07
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Capitulo3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            String fechaString = JOptionPane.showInputDialog ("Teclea una fecha dd/MM/yy");
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
            Date fechaUno=formatter.parse(fechaString);
            fechaString=JOptionPane.showInputDialog ("Teclea una fecha dd/MM/yy");
            SimpleDateFormat formatterDos = new SimpleDateFormat ("dd/MM/yy");
            Date fechaDos=formatterDos.parse(fechaString);
            long milisegundos=fechaUno.getTime()-fechaDos.getTime();
            long dias=milisegundos/86400000;
            JOptionPane.showMessageDialog(null,"La diferencia de las dos fechas es de "+dias+" dias");
        } catch (ParseException ex) 
            {
                Logger.getLogger(Capitulo3Ejercicio4.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
    
}
