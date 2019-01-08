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
public class Ciudad {
    private String codigo_ciudad;
    private String nombre;
    private ArrayList<Vuelo>vuelos;

    public Ciudad() {
    }

    public Ciudad(String codigo_ciudad, String nombre, ArrayList<Vuelo> vuelos) {
        this.codigo_ciudad = codigo_ciudad;
        this.nombre = nombre;
        this.vuelos = vuelos;
    }

    public String getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(String codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
    public void agregarNuevo()
    {
        
    }
    public Ciudad obtener()
    {
        return null;
    }    
}
