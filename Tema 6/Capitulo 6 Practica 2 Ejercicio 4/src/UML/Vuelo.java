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
 * @author Usuario
 */
public class Vuelo {
    private int numero_de_vuelo;
    private String hora_de_salida;
    private String hora_de_llegada;
    private String lugar_de_destino;
    private Date fecha_de_salida;
    private Date fecha_de_regreso;
    private String tipo_de_vuelo;
    private ArrayList<Asiento>asientos;
    private Ciudad ciudad;
    private ArrayList<Pasajero>pasajeros;
    private Piloto piloto;
    private Avion avion;

    public Vuelo() {
    }

    public Vuelo(int numero_de_vuelo, String hora_de_salida, String hora_de_llegada, String lugar_de_destino, Date fecha_de_salida, Date fecha_de_regreso, String tipo_de_vuelo, ArrayList<Asiento> asientos, Ciudad ciudad, ArrayList<Pasajero> pasajeros, Piloto piloto, Avion avion) {
        this.numero_de_vuelo = numero_de_vuelo;
        this.hora_de_salida = hora_de_salida;
        this.hora_de_llegada = hora_de_llegada;
        this.lugar_de_destino = lugar_de_destino;
        this.fecha_de_salida = fecha_de_salida;
        this.fecha_de_regreso = fecha_de_regreso;
        this.tipo_de_vuelo = tipo_de_vuelo;
        this.asientos = asientos;
        this.ciudad = ciudad;
        this.pasajeros = pasajeros;
        this.piloto = piloto;
        this.avion = avion;
    }

    public int getNumero_de_vuelo() {
        return numero_de_vuelo;
    }

    public void setNumero_de_vuelo(int numero_de_vuelo) {
        this.numero_de_vuelo = numero_de_vuelo;
    }

    public String getHora_de_salida() {
        return hora_de_salida;
    }

    public void setHora_de_salida(String hora_de_salida) {
        this.hora_de_salida = hora_de_salida;
    }

    public String getHora_de_llegada() {
        return hora_de_llegada;
    }

    public void setHora_de_llegada(String hora_de_llegada) {
        this.hora_de_llegada = hora_de_llegada;
    }

    public String getLugar_de_destino() {
        return lugar_de_destino;
    }

    public void setLugar_de_destino(String lugar_de_destino) {
        this.lugar_de_destino = lugar_de_destino;
    }

    public Date getFecha_de_salida() {
        return fecha_de_salida;
    }

    public void setFecha_de_salida(Date fecha_de_salida) {
        this.fecha_de_salida = fecha_de_salida;
    }

    public Date getFecha_de_regreso() {
        return fecha_de_regreso;
    }

    public void setFecha_de_regreso(Date fecha_de_regreso) {
        this.fecha_de_regreso = fecha_de_regreso;
    }

    public String getTipo_de_vuelo() {
        return tipo_de_vuelo;
    }

    public void setTipo_de_vuelo(String tipo_de_vuelo) {
        this.tipo_de_vuelo = tipo_de_vuelo;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    
    
}
