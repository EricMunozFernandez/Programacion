/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 1gdaw07
 */
@Entity
@Table(name = "acontecimientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acontecimientos.findAll", query = "SELECT a FROM Acontecimientos a")
    , @NamedQuery(name = "Acontecimientos.findByNombre", query = "SELECT a FROM Acontecimientos a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Acontecimientos.findByLugar", query = "SELECT a FROM Acontecimientos a WHERE a.lugar = :lugar")
    , @NamedQuery(name = "Acontecimientos.findByFecha", query = "SELECT a FROM Acontecimientos a WHERE a.fecha = :fecha")
    , @NamedQuery(name = "Acontecimientos.findByHoraInicio", query = "SELECT a FROM Acontecimientos a WHERE a.horaInicio = :horaInicio")
    , @NamedQuery(name = "Acontecimientos.findByHoraFin", query = "SELECT a FROM Acontecimientos a WHERE a.horaFin = :horaFin")
    , @NamedQuery(name = "Acontecimientos.findByAforo", query = "SELECT a FROM Acontecimientos a WHERE a.aforo = :aforo")})
public class Acontecimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "lugar")
    private String lugar;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "horaInicio")
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    @Basic(optional = false)
    @Column(name = "horaFin")
    @Temporal(TemporalType.TIME)
    private Date horaFin;
    @Basic(optional = false)
    @Column(name = "aforo")
    private int aforo;

    public Acontecimientos() {
    }

    public Acontecimientos(String nombre) {
        this.nombre = nombre;
    }

    public Acontecimientos(String nombre, String lugar, Date fecha, Date horaInicio, Date horaFin, int aforo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.aforo = aforo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acontecimientos)) {
            return false;
        }
        Acontecimientos other = (Acontecimientos) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.BD.Acontecimientos[ nombre=" + nombre + " ]";
    }
    
}
