/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg6.practica.pkg2.ejercicio.pkg1;

/**
 *
 * @author 1gdaw07
 */
import UML.Estudio;
import UML.Pelicula;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Capitulo6Practica2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    private static Estudio[]listaEstudios;
    private static ArrayList<Pelicula>listaPeliculas;
    
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        crearEstudios();
        crearPeliculas();
        buscarPeliculaMasLarga();
        buscarEstudioConMasPeliculas();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    public static void crearEstudios()throws Exception
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        listaEstudios=new Estudio[3]; 
        ArrayList<String>telefono0=new ArrayList();
        telefono0.add("1111111111");
        telefono0.add("222222222222");
        listaEstudios[0]= new Estudio("Disney","LA","c/manolo","www.hola.com",sdf.parse("1994-03-12"),"EEUU",telefono0);
        ArrayList<String>telefono1=new ArrayList();
        telefono1.add("35346346457");
        telefono1.add("234343242342");
        listaEstudios[0]= new Estudio("marvel","rivavellosa","c/juna","www.epa.com",sdf.parse("1984-07-24"),"antartida",telefono1);
        ArrayList<String>telefono2=new ArrayList();
        telefono2.add("333333333333");
        telefono2.add("4444444444444");
        listaEstudios[0]= new Estudio("Serzulu","moon","c/soya","www.mepicaelpie.com",sdf.parse("1840-07-05"),"himalaya",telefono2);    
    }
    public static void crearPeliculas()
    {   
        listaPeliculas=new ArrayList();
        char[]año=new char[4];
        año[0]='1';
        año[1]='9';
        año[2]='6';
        año[3]='0';
        pelicula=new Pelicula();
    }
    public static void buscarPeliculaMasLarga()
    {
        
    }
    public static void buscarEstudioConMasPeliculas()
    {

    }
    
    
}
