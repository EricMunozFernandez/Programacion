/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg6.practica.pkg2.ejercicio.pkg2;

import UML.Estudio;
import UML.Pelicula;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Capitulo6Practica2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    private static Estudio[]listaEstudios;
    private static ArrayList<Pelicula>listaPeliculas;
    
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        crearPeliculas();
        crearEstudios();     
        relaciones();
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
        ArrayList<String>telefono=new ArrayList();
        telefono.add("1111111111");
        telefono.add("222222222222");
        listaEstudios[0]= new Estudio("Disney","LA","c/manolo","www.hola.com",sdf.parse("1994-03-12"),"EEUU",telefono);
        
        telefono=new ArrayList();
        telefono.add("35346346457");
        telefono.add("234343242342");
        listaEstudios[1]= new Estudio("marvel","rivavellosa","c/juna","www.epa.com",sdf.parse("1984-07-24"),"antartida",telefono);
        
        telefono=new ArrayList();
        telefono.add("333333333333");
        telefono.add("4444444444444");
        listaEstudios[2]= new Estudio("Serzulu","moon","c/soya","www.mepicaelpie.com",sdf.parse("1840-07-05"),"himalaya",telefono);    
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
      
        lista=new ArrayList();
        lista.add(listaEstudios[0]);
        lista.add(listaEstudios[2]);
        año=new char[4];
        año[0]='1';
        año[1]='9';
        año[2]='4';
        año[3]='8';
        Pelicula p2=new Pelicula("ET",año,160f,"terror",lista);
        listaPeliculas.add(p2);
        
        lista=new ArrayList();
        lista.add(listaEstudios[0]);        
        año=new char[4];
        año[0]='1';
        año[1]='9';
        año[2]='8';
        año[3]='4';
        Pelicula p3=new Pelicula("yo robot",año,100f,"comedia",lista);
        listaPeliculas.add(p3);
        
        lista=new ArrayList();
        lista.add(listaEstudios[0]);
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[2]);
        año=new char[4];
        año[0]='1';
        año[1]='9';
        año[2]='2';
        año[3]='3';
        Pelicula p4=new Pelicula("star wars",año,200f,"infantil",lista);
        listaPeliculas.add(p4);
    }  
    public static void relaciones()
    {
        ArrayList<Pelicula>lista=new ArrayList();
        lista.add(listaPeliculas.get(0));
        
        lista=new ArrayList();
        lista.add(listaPeliculas.get(1));
        lista.add(listaPeliculas.get(3));
        lista.add(listaPeliculas.get(4));
        
        
        
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
          for(int y=0;y<listaEstudios.length;y++)
          {
              if(listaPeliculas.get(x).getListaEstudios().contains(listaEstudios[y]))
              {
                //hacer algo pero no se como ponerlo
              }
          }
        }
    }
}