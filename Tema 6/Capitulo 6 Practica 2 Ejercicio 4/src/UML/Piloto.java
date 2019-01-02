/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Piloto {
    private String codigo_de_piloto;
    private String nombre;
    private String apellido;
    private Integer numero_de_licencia;
    private ArrayList<Vuelo>vuelos;

    public Piloto() {
    }

    public Piloto(String codigo_de_piloto, String nombre, String apellido, Integer numero_de_licencia, ArrayList<Vuelo> vuelos) {
        this.codigo_de_piloto = codigo_de_piloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_de_licencia = numero_de_licencia;
        this.vuelos = vuelos;
    }

    public String getCodigo_de_piloto() {
        return codigo_de_piloto;
    }

    public void setCodigo_de_piloto(String codigo_de_piloto) {
        this.codigo_de_piloto = codigo_de_piloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumero_de_licencia() {
        return numero_de_licencia;
    }

    public void setNumero_de_licencia(Integer numero_de_licencia) {
        this.numero_de_licencia = numero_de_licencia;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
    
}
