/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 1gdaw07
 */
public class Persona {
    private String nombre;
    private String dNacimiento;
    private String mNacimiento;
    private String aNacimiento;
    private String direccion;
    private String codigoPostal;
    private String ciudad;

    public Persona() {
    }

    public Persona(String nombre, String dNacimiento, String aNacimiento, String direccion, String codigoPostal, String ciudad) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.aNacimiento = aNacimiento;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(String dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public String getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(String mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public String getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(String aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public LocalDate fechaNacimiento()
    {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaString=dNacimiento+"/"+mNacimiento+"/"+aNacimiento;
        LocalDate fechaNacimiento=LocalDate.parse(fechaString,formatter);
        return fechaNacimiento;
    }
    public int edad(LocalDate fechaNacimiento)
    {
        LocalDate ahora=LocalDate.now();
        Period edad=Period.between(fechaNacimiento,ahora);
        return edad.getYears();
    }
}
