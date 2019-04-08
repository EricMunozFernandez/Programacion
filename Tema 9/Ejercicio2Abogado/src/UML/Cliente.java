/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author hp_pc
 */
public class Cliente extends Persona {

    private int telefono;
    private ArrayList<Caso> casos;

    public Cliente() {
    }

    public Cliente(int telefono, String DNI, String nombre, String apellido1, String apellido2, String direccion) {
        super(DNI, nombre, apellido1, apellido2, direccion);
        this.telefono = telefono;
    }

    public Cliente(int telefono, ArrayList<Caso> casos, String DNI, String nombre, String apellido1, String apellido2, String direccion) {
        super(DNI, nombre, apellido1, apellido2, direccion);
        this.telefono = telefono;
        this.casos = casos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Caso> getCasos() {
        return casos;
    }

    public void setCasos(ArrayList<Caso> casos) {
        this.casos = casos;
    }

}
