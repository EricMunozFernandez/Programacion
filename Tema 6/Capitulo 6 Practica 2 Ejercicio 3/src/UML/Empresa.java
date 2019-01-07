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
public class Empresa {
    private String nombre;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
    }

    public Empresa(String nombre, ArrayList<Cliente> listaClientes, ArrayList<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.listaClientes = listaClientes;
        this.listaEmpleados = listaEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
}
