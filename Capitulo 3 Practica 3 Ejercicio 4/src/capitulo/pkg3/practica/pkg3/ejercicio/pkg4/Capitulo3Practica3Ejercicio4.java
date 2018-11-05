
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
                    do
                    {
                        datos();
                    }
                    while(nombre.equalsIgnoreCase("FIN"));
                }
                catch(NumberFormatException |NullPointerException| ArithmeticException e)
                {
                    JOptionPane.showMessageDialog(null,"Escribe un numero");
                    correcto=false;
                }
                catch(OpcionNoValida e)
                {
                    JOptionPane.showMessageDialog(null,"La nota no puede ser menor que 0 o mayor que 10");
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
    public static int datos() throws OpcionNoValida
    {
        nombre=JOptionPane.showInputDialog("Inserta nombre alumno");
        int nota;
        int suma=0;
        for(int c=0;c>=6;c++)
        {
        nota=Integer.parseInt(JOptionPane.showInputDialog("instroduce nota de la asignatura "+c));
            if(nota<0||nota>10)
            {
                throw new OpcionNoValida();//excepcion creada por nosotros                
            }            
        suma=suma+nota;        
        }        
        int media=suma/6;        
        JOptionPane.showMessageDialog(null,"El alumno "+nombre+" ha sacado de media "+media);
        return(media);            
    }
}

