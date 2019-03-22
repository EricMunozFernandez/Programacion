package t9p1e2;

import Modelo.UML.Acontecimiento;
import GUI.*;
import Modelo.BD.*;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Persistence;



public class Controlador {
   
    private static Acontecimiento acontecimiento;
    
    private static VentanaPrincipal vp;
    private static VentanaAcontecimientos ve;
    private static AcontecimientosJpaController aja;
    
    public static void main(String[] args) {       
        aja = new AcontecimientosJpaController(Persistence.createEntityManagerFactory ("t9p1JPAPU"));
        vp = new VentanaPrincipal();
        vp.setVisible(true);
    }
    
    public static void visualizarVentanaAlta(){
        // Dejo por debajo la principal
         ve = new VentanaAcontecimientos();
         ve.setVisible(true);
    }
    
    public static void volver(javax.swing.JFrame v){
        v.dispose();
    }
       
    public static void grabarAcontecimiento(String nombre, String lugar, LocalDate fecha, LocalTime horaI, LocalTime horaF, int nro)throws Exception{
       
        // Alta -- Crear objeto y enviarlo a AcontecimientoBD
        acontecimiento = new Acontecimiento(nombre,lugar, fecha,horaI,horaF,nro);
        aja.create(acontecimiento);
    }
    
   public static void terminar(){
       System.exit(0);
   }
   
   public static String listado() throws Exception{
       return AcontecimientoBD.listado();
   }
   
   public static void borrarAcontecimiento(String nombre) throws Exception
   {
       // Primero lo consultamos, mostramos sus datos y luego pedimos confirmación.
       acontecimiento = new Acontecimiento(nombre);
       aja.findAcontecimientos(nombre);
       if (vp.mostrar(acontecimiento.toString()) == true)
            aja.destroy(nombre);
   }
    
    public static void modificarAcontecimientoParteUno(String nombre) throws Exception
   {
       // Primero consultamos y mostramos sus datos
       acontecimiento = AcontecimientoBD.consultar(new Acontecimiento(nombre));
       ve = new VentanaAcontecimientos(acontecimiento);
       ve.setVisible(true);
   }
    
   public static void modificarAcontecimientoParteDos(String nombre, String lugar, LocalDate fecha, LocalTime horaI, LocalTime horaF, int nro) throws Exception
   {
       // actualizamos objeto en memoria
       acontecimiento.setLugar(lugar);
       acontecimiento.setFecha(fecha);
       acontecimiento.setHoraI(horaI);
       acontecimiento.setHoraF(horaF);
       acontecimiento.setAforo(nro);
       AcontecimientoBD.modificar(acontecimiento);
   }
}
