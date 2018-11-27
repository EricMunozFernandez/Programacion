/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg5.practica.pkg1.ejercicio.pkg1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo5Practica1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Double>lista=new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
        int respuesta;        
        do
        {
            double dato=Double.parseDouble(JOptionPane.showInputDialog("Intorduce un numero"));
            lista.add(dato);
            respuesta=JOptionPane.showConfirmDialog(null,"Quieres continuar?");
        }
        while(respuesta==0);
        int opc;
        do
        {  
            opc=Integer.parseInt(JOptionPane.showInputDialog("Elige una pocion:\n1. Visualizar el valor maximo y el minimo.\n" +
"2. Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo ´\n" +
"has encontrado o no.\n" +
"3. Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra ´\n" +
"un mensaje de error.\n" +
"4. Convertir el arrayList en un array.\n" +
"5. Si no esta vac´ıo, mostrar el numero de elementos que contiene. ´\n" +
"6. Insertar un nuevo elemento por el final.\n" +
"7. Insertar un nuevo elemento en la posicion que te indique el usuario. ´\n" +
"8. Borrar un elemento de una posicion concreta. ´\n" +
"9. Calcular la suma y la media aritmetica de los valores contenidos. ´\n" +
"10. Finalizar."));

            switch(opc)
            {
                case 1:
                {
                    minimo();
                    break;
                }
                case 2:
                {
                    search();
                    break;
                }
                case 3:
                {
                    searchAndDestroy();
                    break;
                }
                case 4:
                {
                    convertir();
                    break;
                }
                case 5:
                {

                    break;
                }
                case 6:
                {

                    break;
                }
                case 7:
                {

                    break;
                }
                case 8:
                {

                    break;
                }
                case 9:
                {

                    break;
                }
                case 10:
                {
                    System.exit(0);
                }
            }
        }
        while(opc!=10);
    }

    /*public static void minimo(ArrayList<Integer>lista)*/
    public static void minimo()
    {
        double min=1000000000;
        double max=0;
        for(int x=0;x<lista.size();x++)
        {
            if(min>lista.get(x))
            {
                min=lista.get(x);
            }
            if(max<lista.get(x))
            {
                max=lista.get(x);
            }
        }
        JOptionPane.showMessageDialog(null,"El numero minimo es: "+min+"\nEl numero maximo es: "+max);
    }
    public static void search()
    {
        double numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a buscar"));
        boolean existe=lista.contains(numero);
        if(existe==true)
        {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" existe");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" no existe");
        }
    }
    public static void searchAndDestroy()
    {
        double numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a buscar"));
        boolean existe=lista.contains(numero);
        if(existe==true)
        {
            lista.remove(numero);
            JOptionPane.showMessageDialog(null, "El numero "+numero+" ha sido destruido de la lista");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" no existe");
        }
    }
    public static void convertir()
    {
        
    }
}
