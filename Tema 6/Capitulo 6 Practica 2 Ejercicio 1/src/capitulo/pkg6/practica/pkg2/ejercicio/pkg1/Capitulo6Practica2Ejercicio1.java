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
        listaEstudios[1]= new Estudio("marvel","rivavellosa","c/juna","www.epa.com",sdf.parse("1984-07-24"),"antartida",telefono1);
        ArrayList<String>telefono2=new ArrayList();
        telefono2.add("333333333333");
        telefono2.add("4444444444444");
        listaEstudios[2]= new Estudio("Serzulu","moon","c/soya","www.mepicaelpie.com",sdf.parse("1840-07-05"),"himalaya",telefono2);    
    }
    public static void crearPeliculas()
    {   
        listaPeliculas=new ArrayList();
        ArrayList<Estudio>lista=new ArrayList();
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[0]);
        char[]año=new char[4];
        año[0]='1';
        año[1]='9';
        año[2]='6';
        año[3]='0';
        Pelicula p=new Pelicula("Terminator",año,123f,"accion",lista);
        listaPeliculas.add(p);        
      
        ArrayList<Estudio>lista2=new ArrayList();
        lista.add(listaEstudios[0]);
        lista.add(listaEstudios[2]);
        char[]año2=new char[4];
        año[0]='1';
        año[1]='9';
        año[2]='4';
        año[3]='8';
        Pelicula p2=new Pelicula("ET",año2,160f,"terror",lista2);
        listaPeliculas.add(p2);
        
        ArrayList<Estudio>lista3=new ArrayList();
        lista.add(listaEstudios[0]);        
        char[]año3=new char[4];
        año[0]='1';
        año[1]='9';
        año[2]='8';
        año[3]='4';
        Pelicula p3=new Pelicula("yo robot",año3,100f,"comedia",lista3);
        listaPeliculas.add(p3);
        
        ArrayList<Estudio>lista4=new ArrayList();
        lista.add(listaEstudios[0]);
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[2]);
        char[]año4=new char[4];
        año[0]='1';
        año[1]='9';
        año[2]='2';
        año[3]='3';
        Pelicula p4=new Pelicula("star wars",año4,200f,"infantil",lista4);
        listaPeliculas.add(p4);
    }
    public static void buscarPeliculaMasLarga()
    {
        float max=0;
        int pos=0;
        for(int x=0;x<listaPeliculas.size();x++)
        {
            max=listaPeliculas.get(x).getDuracion();
            pos=x;
        }
        JOptionPane.showMessageDialog(null,"La pelicula mas larga es "+listaPeliculas.get(pos).getTitulo()+" con una duracion de "+listaPeliculas.get(pos).getDuracion());
    }   
    public static void buscarEstudioConMasPeliculas()
    {
        for(int x=0;x<listaPeliculas.size();x++)
        {
            
        }
    }
    
    
}
