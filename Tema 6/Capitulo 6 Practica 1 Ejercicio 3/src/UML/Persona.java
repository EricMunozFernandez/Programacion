/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 1gdaw07
 */
public class Persona {
    private String nombre;
    private int dNacimiento;
    private int mNacimiento;
    private int aNacimiento;
    private String direccion;
    private int codigoPostal;
    private String ciudad;

    public Persona() {
    }

    public Persona(String nombre, int dNacimiento, int aNacimiento, String direccion, int codigoPostal, String ciudad) {
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

    public int getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(int dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public int getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(int mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public int getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void fechaNacimiento()
    {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("DD/MM/YYYY");
        String fechaString=dNacimiento+"/"+mNacimiento+"/"+aNacimiento;
        LocalDate fechaNacimineto=LocalDate.parse(fechaString,formatter);
    }
}
