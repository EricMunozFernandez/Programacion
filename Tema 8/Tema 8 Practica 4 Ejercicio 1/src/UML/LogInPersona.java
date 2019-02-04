/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw07
 */
public class LogInPersona {
    private String dni;
    private String nss;
    private String nombreApellido;
    private String direccion;
    private int telefono;
    private Character sexo;
    private Character estadoCivil;
    private ArrayList<Contrato> tipoContrato;
    private ArrayList<Departamento> departamento;
    private LocalDate fechaAlta;
    private String numEmpleado;          

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Character estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public ArrayList<Contrato> getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(ArrayList<Contrato> tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public ArrayList<Departamento> getDepartamento() {
        return departamento;
    }

    public void setDepartamento(ArrayList<Departamento> departamento) {
        this.departamento = departamento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public LogInPersona() {
    }

    public LogInPersona(String dni, String nss, String nombreApellido, String direccion, int telefono, Character sexo, Character estadoCivil, ArrayList<Contrato> tipoContrato, ArrayList<Departamento> departamento, LocalDate fechaAlta, String numEmpleado) {
        this.dni = dni;
        this.nss = nss;
        this.nombreApellido = nombreApellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.tipoContrato = tipoContrato;
        this.departamento = departamento;
        this.fechaAlta = fechaAlta;
        this.numEmpleado = numEmpleado;
    }
            
    
}
