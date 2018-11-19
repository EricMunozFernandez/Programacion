/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg3.ejercicio.pkg7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
        LocalDate fechaUno=LocalDate.parse(fechaString,formatter);
        fechaString=JOptionPane.showInputDialog("Teclea una fecha dd/MM/yy");
        LocalDate fechaDos=LocalDate.parse(fechaString,formatter);
        int contador=0;
        while(fechaUno.isBefore(fechaDos))
        {
            if(fechaUno.getDayOfWeek()==DayOfWeek.SUNDAY)
                contador++;
            fechaUno=fechaUno.plusDays(1);
        }
        
    }
    
}
