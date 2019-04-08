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
public class Abogado extends Persona {

    private ArrayList<Caso> casos;

    public Abogado() {
    }

    public Abogado(ArrayList<Caso> casos, String DNI, String nombre, String apellido1, String apellido2, String direccion) {
        super(DNI, nombre, apellido1, apellido2, direccion);
        this.casos = casos;
    }

    public Abogado(String DNI, String nombre, String apellido1, String apellido2, String direccion) {
        super(DNI, nombre, apellido1, apellido2, direccion);
    }

    public ArrayList<Caso> getCasos() {
        return casos;
    }

    public void setCasos(ArrayList<Caso> casos) {
        this.casos = casos;
    }

}
