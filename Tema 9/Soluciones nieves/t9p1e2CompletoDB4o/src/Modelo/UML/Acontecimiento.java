package Modelo.UML;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Acontecimiento {
    // No pongo id
    private String nombre;
    private String lugar;
    private LocalDate fecha;
    private LocalTime horaI;
    private LocalTime horaF;
    private Integer aforo;

    public Acontecimiento() {
    }

    public Acontecimiento(String nombre, String lugar, LocalDate fecha, LocalTime horaI, LocalTime horaF, Integer aforo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaI = horaI;
        this.horaF = horaF;
        this.aforo = aforo;
    }

    public Acontecimiento(String nombre) {
        this.nombre = nombre;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
    public LocalTime getHoraI(){
        return horaI;
    }

    public void setHoraI(LocalTime horaI) {
        this.horaI = horaI;
    }
    
    public LocalTime getHoraF(){
        return horaF;
    }

    public void setHoraF(LocalTime horaF) {
        this.horaF = horaF;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer numeroAsistentes) {
        this.aforo = numeroAsistentes;
    }
    
    @Override
    public String toString(){
        String datos = nombre + " " + lugar + " " + fecha + " " + getHoraI() + " " + getHoraF() + " "  + aforo + "\n";
        if (listaAsistentes!= null)
        {
            for(Persona p: listaAsistentes)
                datos += p.toString() + "\n";
        }
        
        
        return datos;
    }
    
    // Añadido para el ejercicio completo
    // Relación con personas.
    // Muchas personas pueden asistir a un acontecimiento
    private ArrayList<Persona> listaAsistentes;
    
    public void setAsistente(Persona p){
        if (listaAsistentes == null)
            listaAsistentes = new ArrayList();
        listaAsistentes.add(p);
    }

     public ArrayList<Persona> getListaAsistentes() {
        return listaAsistentes;
    }
     
    public boolean isPlazasDisponibles()
    {
        if (listaAsistentes != null)
             if (listaAsistentes.size() < aforo)
                 return true;
             else
                 // Esta completo
                 return false;
        else
            // Todavía no se ha apuntado nadie.
            return true;
    }
}
