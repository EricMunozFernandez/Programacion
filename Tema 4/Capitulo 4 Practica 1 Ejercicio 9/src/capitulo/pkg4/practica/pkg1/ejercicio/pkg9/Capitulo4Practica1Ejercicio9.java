/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg4.practica.pkg1.ejercicio.pkg9;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Capitulo4Practica1Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String alumno[][]={{"ingles","frances","aleman","ruso"},{ "basico","medio","perfeccionamiento"}};
        int x;
        String idioma=JOptionPane.showInputDialog("Introduce el idioma").toLowerCase();
        for( x = 0; x < alumno.length &&  alumno[x].equals(idioma); x++)
            {}
            if (x == alumno.length)
            {
                JOptionPane.showMessageDialog(null,"idioma no valido");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"idioma correcto");
                String nivel =JOptionPane.showInputDialog(null, "Introduzca el nivel").toLowerCase();
                int y;
                for( y = 0; y < alumno[x].length &&  alumno[x].equals(nivel); y++)
                {}
                if (y == alumno[x].length)
                {
                    JOptionPane.showMessageDialog(null,"nivel no valido");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"nivel correcto");
                    int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la cantidad de alumnos"));
                    String datoString=dato+"";
                    alumno[x][y]=datoString;
                }
            }
    }
    
}
