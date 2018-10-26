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
import javax.swing.JOptionPane;
public class Capitulo3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean error=false;
        do
        {
        try 
            {
                // TODO code application logic here
                //para calendar es Calendar fecha Uno=Calendar.getInstance(); antes de todo lo mismo que con Date
                //para localDate DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yy");
                String fechaString = JOptionPane.showInputDialog ("Teclea una fecha dd/MM/yy");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
                Date fechaUno=formatter.parse(fechaString);
                //Para Calendar fechaUno.setTime(formatter.parse(fechaString);
                //Para LocalDate LocalDate fechaUno=LocalDate.parse(fechaString,formatter);
                fechaString=JOptionPane.showInputDialog ("Teclea una fecha dd/MM/yy");
                SimpleDateFormat formatterDos = new SimpleDateFormat ("dd/MM/yy");
                Date fechaDos=formatterDos.parse(fechaString);
                long milisegundos=fechaUno.getTime()-fechaDos.getTime();
                //En Calendar es getTimeInMillis()
                //Para LocalDate Period period=Period.between(fechaUno,fechaDos);
                long dias=milisegundos/86400000;
                JOptionPane.showMessageDialog(null,"La diferencia de las dos fechas es de "+dias+" dias");
                error=false;
            } 
        catch (ParseException ex) 
            {
                JOptionPane.showMessageDialog(null,"Ya te vale");
                error=true;
            }
        finally
            {
                JOptionPane.showMessageDialog(null,"Se acabo");
            }
        }
        while(error==true);
    }
    
}
