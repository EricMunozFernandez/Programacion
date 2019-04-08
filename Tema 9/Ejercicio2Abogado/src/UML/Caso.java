/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hp_pc
 */
public class Caso {

    private int numExp;
    private Cliente cliente;
    private Date fechaInicio, fechaFin;
    private String estado;
    private ArrayList<Abogado> abogados;

    public Caso() {
    }

    public Caso(int numExp) {
        this.numExp = numExp;
    }

    public Caso(int numExp, Cliente cliente) {
        this.numExp = numExp;
        this.cliente = cliente;
    }

    public Caso(int numExp, Date fechaInicio, Date fechaFin, String estado) {
        this.numExp = numExp;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public Caso(ArrayList<Abogado> abogados) {
        this.abogados = abogados;
    }

    public Caso(int numExp, Cliente cliente, Date fechaInicio, Date fechaFin, String estado, ArrayList<Abogado> abogados) {
        this.numExp = numExp;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.abogados = abogados;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumExp() {
        return numExp;
    }

    public void setNumExp(int numExp) {
        this.numExp = numExp;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Abogado> getAbogados() {
        return abogados;
    }

    public void setAbogados(ArrayList<Abogado> abogados) {
        this.abogados = abogados;
    }

}
