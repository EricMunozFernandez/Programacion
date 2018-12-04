/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg6.practica.pkg1.ejercicio.pkg1;

import Clases.Circunferencia;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo6Practica1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia c1= new Circunferencia();
        c1.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Inserta radio de la circunferencia")));
        DecimalFormat format=new DecimalFormat("#.00");
        format.format(c1.getRadio());
        JOptionPane.showMessageDialog(null,"El perimetro es: \n"+format.format(c1.perimetro())+"\nEl area es: \n"+format.format(c1.area())+"\nEl volumen es: \n"+format.format(c1.volumen()));
    }
    
}
