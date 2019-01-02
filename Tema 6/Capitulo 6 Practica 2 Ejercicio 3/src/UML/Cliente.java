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
public class Cliente extends Persona{
    private String telefono_de_contacto;
    private Empresa empresa;

    public Cliente() {
    }

    public Cliente(String telefono_de_contacto, Empresa empresa, String nombre, int edad) {
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    } 

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
    @Override
    public String Mostrar(String nombre, int edad)
    {
        String lista="Nombre: "+nombre+"\nEdad: "+edad;       
        return lista;
    }
    
}
