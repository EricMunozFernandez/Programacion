/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.exception;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class EjemploException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int nota=Integer.parseInt(JOptionPane.showInputDialog("nota entre 0 y 10"));
            if(nota<0||nota>10)
            {
                throw new ExceptionNotaMal();//excepcion creada por nosotros                
            }
            funcionUno();
        }
        catch(ExceptionNotaMal e)
        {
            JOptionPane.showMessageDialog(null,"La nota no puede ser menor que 0 o mayor que 10");
        }
        catch(NumberFormatException e)
        {
         JOptionPane.showMessageDialog(null,"La nota es un numero");   
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
        }
        finally
        {
         JOptionPane.showMessageDialog(null,"FIN");   
        }
    }
    public static void funcionUno()throws Exception
    {
     int nota2;   
     nota2 = Integer.parseInt(JOptionPane.showInputDialog("teclea segundo numero"));
    }
}
