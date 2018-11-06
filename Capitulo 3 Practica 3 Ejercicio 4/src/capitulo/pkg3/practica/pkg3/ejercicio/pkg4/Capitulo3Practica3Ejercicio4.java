
package capitulo.pkg3.practica.pkg3.ejercicio.pkg4;

import javax.swing.JOptionPane;


public class Capitulo3Practica3Ejercicio4 {

    public static String nombre;
    public static void main(String[] args) {
        // TODO code application logic here        
        try
        {
            boolean correcto=true;
            do
            {
                try
                {    
                    double mediaGlobal;
                    int contador=0;       
                    nombre=JOptionPane.showInputDialog("Inserta nombre alumno");   
                    do
                    {                        
                        mediaGlobal=datos();                       
                        contador++;
                        nombre=JOptionPane.showInputDialog("Inserta nombre alumno");
                    }
                    while(nombre.compareToIgnoreCase("fin")!=0);
                                            
                    JOptionPane.showMessageDialog(null,"La nota media de todos los alumnos es "+(mediaGlobal/contador));                    
                }
                catch(NumberFormatException |NullPointerException| ArithmeticException e)
                {
                    JOptionPane.showMessageDialog(null,"Escribe un numero");
                    correcto=false;
                }
                catch(OpcionNoValida e)
                {
                    JOptionPane.showMessageDialog(null,"La nota no puede ser menor que 0 o mayor que 10");
                    correcto=false;
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Error");
                    correcto=false;
                }
            
            }
            while(correcto==false);
        }
        finally
            {
                JOptionPane.showMessageDialog(null,"FIN");
            }
    }    
    public static double datos() throws OpcionNoValida
    {        
        float nota;        
        float suma=0;
        for(int c=1;c<=6;c++)
        {
        nota=Float.parseFloat(JOptionPane.showInputDialog("instroduce nota de la asignatura "+c));
            if(nota<0||nota>10)
            {
                throw new OpcionNoValida();//excepcion creada por nosotros                
            }            
        suma=suma+nota;        
        }        
        double media=suma/6;        
        JOptionPane.showMessageDialog(null,"El alumno "+nombre+" ha sacado de media "+media);
        double mediaGlobal=0;
        mediaGlobal=mediaGlobal+media;        
        return(mediaGlobal);            
    }
}

