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
public class Cliente {
    private String nombre;
    private ArrayList<Producto>compras;

    public Cliente() {
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, ArrayList<Producto> compras) {
        this.nombre = nombre;
        this.compras = compras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Producto> compras) {
        this.compras = compras;
    }
    
    
}
