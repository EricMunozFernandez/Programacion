/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 1gdaw07
 */
public class Estudio {
    private String nombre;
    private String ciudad;
    private String direccion;
    private String dirWeb;
    private Date fechaFundacion;//mejor LocalDate
    private String pais;
    private ArrayList<String> telefono;
    private ArrayList<Pelicula>listaPeliculas;
    ////este es el metodo nuevoEstudio (Constructor)
    public Estudio() {
    }

    public Estudio(String nombre, String ciudad, String direccion, String dirWeb, Date fechaFundacion, String pais, ArrayList<String> telefono, ArrayList<Pelicula> listaPeliculas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirWeb = dirWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.telefono = telefono;
        this.listaPeliculas = listaPeliculas;
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List getTelefono() {
        return telefono;
    }

    public void setTelefono(ArrayList telefono) {
        this.telefono = telefono;
    }
    
    public Estudio[]desplegarEstudio()
    {
        return null;
    }
    public void modificarEstudio()
    {
        
    }
    public void cierraEstudio()
    {
        
    }
}