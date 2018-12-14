/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw07
 */
public class Pelicula {
    private String titulo;
    private char año;
    private float duracion;
    private String tipo;

    public Pelicula(String titulo, char año, float duracion, String tipo) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;

    }

    public Pelicula() {
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char getAño() {
        return año;
    }

    public void setAño(char año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public static void nuevaPelicula()
    {
        
    }
    public static void modificaPelicula()
    {
        
    }
    public static void despliegaPelicula()
    {
        
    }
    public static void eliminaPelicula()
    {
        
    }
}