/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;

/**
 *
 * @author 1gdaw07
 */
public class Hijo {
    private String nombre;
    private LocalDate fechaNac;

    public Hijo() {
    }

    public Hijo(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    @Override
    public String toString()
    {
        return nombre+" "+fechaNac+"\n";
    }
}
