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
public class Directivo extends Empleado{
    private String categoria;
    private ArrayList<Empleado> listaEmpleados;
    public Directivo() {
    }

    public Directivo(String categoria, ArrayList<Empleado> listaEmpleados, float sueldo, Directivo jefe, Empresa empresa, String nombre, int edad) {
        super(sueldo, jefe, empresa, nombre, edad);
        this.categoria = categoria;
        this.listaEmpleados = listaEmpleados;
    }    
   
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    @Override
    public String Mostrar(String nombre, int edad)
    {
        String lista="Nombre: "+nombre+"\nEdad: "+edad;       
        return lista;
    }
    
}
