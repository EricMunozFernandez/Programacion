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
public class Curso {
    private String clase;   
    private ArrayList<Persona>alumnos;
    public Curso() {
    }

    public Curso(String clase) {
        this.clase = clase;        
    }

    public Curso(String clase, ArrayList<Persona> alumnos) {
        this.clase = clase;
        this.alumnos = alumnos;
    }

    public ArrayList<Persona> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Persona> alumnos) {
        this.alumnos = alumnos;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }    
    
}
