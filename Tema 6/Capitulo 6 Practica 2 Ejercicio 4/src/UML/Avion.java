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
public class Avion {
    private String aerolinia;
    private String codigo_de_avion;
    private int numero_de_asientos;
    private String compartimentos;
    private ArrayList<Vuelo>vuelos;

    public Avion() {
    }

    public Avion(String aerolinia, String codigo_de_avion, int numero_de_asientos, String compartimentos, ArrayList<Vuelo> vuelos) {
        this.aerolinia = aerolinia;
        this.codigo_de_avion = codigo_de_avion;
        this.numero_de_asientos = numero_de_asientos;
        this.compartimentos = compartimentos;
        this.vuelos = vuelos;
    }

    public String getAerolinia() {
        return aerolinia;
    }

    public void setAerolinia(String aerolinia) {
        this.aerolinia = aerolinia;
    }

    public String getCodigo_de_avion() {
        return codigo_de_avion;
    }

    public void setCodigo_de_avion(String codigo_de_avion) {
        this.codigo_de_avion = codigo_de_avion;
    }

    public int getNumero_de_asientos() {
        return numero_de_asientos;
    }

    public void setNumero_de_asientos(int numero_de_asientos) {
        this.numero_de_asientos = numero_de_asientos;
    }

    public String getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(String compartimentos) {
        this.compartimentos = compartimentos;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
    
}
