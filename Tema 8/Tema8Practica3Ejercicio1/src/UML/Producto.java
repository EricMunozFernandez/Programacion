/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

/**
 *
 * @author Usuario
 */
public class Producto {
    private String nombre;
    private int unidades;
    private double precioUnit;

    public Producto(String nombre, int unidades, double precioUnit) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precioUnit = precioUnit;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    @Override
    public String toString(){
        return nombre + "  " + unidades + "  " + precioUnit + "\n";
    }    
            
}
