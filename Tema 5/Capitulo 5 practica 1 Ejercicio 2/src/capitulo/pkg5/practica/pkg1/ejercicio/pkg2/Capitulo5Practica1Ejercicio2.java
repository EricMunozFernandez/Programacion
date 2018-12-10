/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg5.practica.pkg1.ejercicio.pkg2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo5Practica1Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static String[]todosIdiomas;
    public static String[]todosNiveles;
    public static ArrayList<ArrayList<Integer>>alumnos;
    public static ArrayList<String>idiomas;
    public static ArrayList<String>niveles;
    public static void main(String[] args) {
        // TODO code application logic here 
        
        do
        {
            crearEstructuras();
            pedirDatos();
        }
        while(JOptionPane.showConfirmDialog(null,"Quieres continuar?")==0);
        visualizar(); 
    }
    public static void crearEstructuras()
    {
        todosIdiomas=new String[4];
        todosIdiomas[0]="ingles";
        todosIdiomas[1]="frances";
        todosIdiomas[2]="aleaman";
        todosIdiomas[3]="ruso";
        todosNiveles=new String[3];
        todosNiveles[0]="basico";
        todosNiveles[1]="medio";
        todosNiveles[2]="superior";
        alumnos=new ArrayList();
        idiomas=new ArrayList();
        niveles=new ArrayList();
    }
    public static void pedirDatos()
    {
        String idioma=JOptionPane.showInputDialog("Inserta idioma");
         
        posicionarDatos();
    }
    public static void posicionarDatos()
    {
        
    }
    public static void visualizar()
    {
       /* String lista="";
        for(int x=0;x<alumnos.size();x++)
        {
            lista+="Idioma: "+idiomas.get(x).size()+"\n";
            for(int y=0; y<niveles.get(x).size();y++)
            {
                lista+="Nivel: "+niveles.get(x).get(y)." "+alumnos.get(x).
            }
        }
        JOptionPane.showMessageDialog(null,lista); */   
    }
}
