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
public class SocioFamiliar extends Socio{
    private ArrayList<Hijo> hijos;

    public SocioFamiliar() {
    }

    public SocioFamiliar(ArrayList<Hijo> hijos, String nombre, String apellido, String telefono, String email) {
        super(nombre, apellido, telefono, email);
        this.hijos = hijos;
    }

    public ArrayList<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Hijo> hijos) {
        this.hijos = hijos;
    }
    
}
