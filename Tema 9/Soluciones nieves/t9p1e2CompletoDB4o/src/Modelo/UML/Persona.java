package Modelo.UML;

import java.util.ArrayList;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;
    
    // NO NIF
    // Una persona trabaja en una empresa
    private Empresa e;
    
    // Una persona puede asistir a muchos acontecimientos
    private ArrayList<Acontecimiento> listaEventos;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empresa getE() {
        return e;
    }

    public void setE(Empresa e) {
        this.e = e;
    }

    public ArrayList<Acontecimiento> getListaEventos() {
        return listaEventos;
    }

    public Persona(){
        
    }
    public Persona(String dni, String nombre, String apellidos, String tel) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = tel;
    }
    
    public void setEvento(Acontecimiento a){
        if (listaEventos == null)
            listaEventos = new ArrayList();
        listaEventos.add(a);
    }
    
    @Override
    public String toString(){
        return dni + " " + nombre + " " + apellidos + " " + telefono;
    }
}
