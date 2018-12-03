/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg5.practica.pkg1.ejercicio.pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo5Practica1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static double sumaTotal;
    public static ArrayList<Double>lista;
    public static void main(String[] args) {
        // TODO code application logic here
         
        lista=new ArrayList();      
        try
        {
            hacerArray();
            menu(); 
        }
        catch(NumMalEx e)
        {
            JOptionPane.showMessageDialog(null,"Escribe un numero entre 1 y 10");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Escribe un numero");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error tipo "+e.getMessage());
        }                     
    }
    /*public static void minimo(ArrayList<Integer>lista)*/
    public static void hacerArray() throws Exception
    {
        int respuesta;
        do
        {           
            pedirDato();
            respuesta=JOptionPane.showConfirmDialog(null,"Quieres continuar?");            
        }
        while(respuesta==0); 
    }
    public static void pedirDato()
    {
        double dato=Double.parseDouble(JOptionPane.showInputDialog("Intorduce un numero"));
        lista.add(dato);
    }
    public static void menu() throws Exception
    {
        int opc;
        do
        {  
            opc=Integer.parseInt(JOptionPane.showInputDialog("Elige una pocion:\n1. Visualizar el valor maximo y el minimo.\n" +
            "2. Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo \n" +
            "has encontrado o no.\n" +
            "3. Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra \n" +
            "un mensaje de error.\n" +
            "4. Convertir el arrayList en un array.\n" +
            "5. Si no esta vacio, mostrar el numero de elementos que contiene. \n" +
            "6. Insertar un nuevo elemento por el final.\n" +
            "7. Insertar un nuevo elemento en la posicion que te indique el usuario. \n" +
            "8. Borrar un elemento de una posicion concreta. \n" +
            "9. Calcular la suma y la media aritmetica de los valores contenidos. \n" +
            "10. Finalizar."));
            if(opc<1||opc>10)
            {
                throw new NumMalEx();
            }
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
                    mostrarNumero();
                    break;
                }
                case 6:
                {
                    insertar();
                    break;
                }
                case 7:
                {
                    insertarPosicion();
                    break;
                }
                case 8:
                {
                    borrarElemento();
                    break;
                }
                case 9:
                {
                    sumaMedia();
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
    public static void search() throws Exception
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
    public static void searchAndDestroy() throws Exception
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
        //Double[]array=lista.toArray(new Double[lista.size()]);
        Object[]listaArray=lista.toArray();
        JOptionPane.showMessageDialog(null,"El arrayList se ha convertido en array: "+Arrays.toString(listaArray));
    }
    public static void mostrarNumero()
    {
        if(lista.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Esta vacio");
        }
        else
        {
            String datos="";
            for(Double elemento:lista)
                datos+=elemento+" ";
            //datos = lista.stream().map((elemento) -> elemento+" ").reduce(datos, String::concat); opcion reciente
            JOptionPane.showMessageDialog(null,"La lista es: "+datos);
        }
    }
    public static void insertar() throws Exception
    {
        pedirDato();
        JOptionPane.showMessageDialog(null,"Has insertado el numero por el final del ArrayList");
    }
    public static void insertarPosicion() throws Exception
    {
        int pos=Integer.parseInt(JOptionPane.showInputDialog("Elige la posicion en el que insertaras el numero"));
        double num=Double.parseDouble(JOptionPane.showInputDialog("Inserta el numero"));
        lista.add(pos,num);
    }
    public static void borrarElemento()
    {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Elige la posicion que quieres borrar"));
        lista.remove(x);
    }
    public static void sumaMedia()
    {
        double suma=0;
        int x;
        for(x=0;x<lista.size();x++)
        {
            suma=suma+lista.get(x);
        }
       double media=suma/x;
       JOptionPane.showMessageDialog(null,"La media de todos los numero es "+media);
    //lista.forEach((elemento)->{sumaTotal+=elemento;});     
    }
}
