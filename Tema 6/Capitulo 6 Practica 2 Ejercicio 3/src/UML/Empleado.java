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
public class Empleado extends Persona{
    private float sueldo;
    private Directivo jefe;
    private Empresa empresa;
    public Empleado() {
    }

    public Empleado(float sueldo, Directivo jefe, Empresa empresa, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.jefe = jefe;
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }    

    public Directivo getJefe() {
        return jefe;
    }

    public void setJefe(Directivo jefe) {
        this.jefe = jefe;
    }
    
    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public String Mostrar(String nombre, int edad)
    {
        String lista="Nombre: "+nombre+"\nEdad: "+edad;       
        return lista;
    }
    public void calcular_salario_neto(int sueldo)
    {
        
    }
}
