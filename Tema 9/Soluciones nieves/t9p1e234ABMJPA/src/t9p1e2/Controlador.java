package t9p1e2;

import Excepciones.AcontecimientoNoEncontrado;
import Modelo.UML.Acontecimiento;
import GUI.*;
import Modelo.BD.AcontecimientoJpaController;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import javax.persistence.Persistence;



public class Controlador {
   
    private static Acontecimiento acontecimiento;
    
    private static VentanaPrincipal vp;
    private static VentanaAcontecimientos ve;
    
    private static AcontecimientoJpaController abd;
    
    public static void main(String[] args) {    
        abd = new AcontecimientoJpaController(Persistence.createEntityManagerFactory("t9p1e234ABMJPAPU"));
        
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
        
        // Convierto los localDate y localTime a Date
        // return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        Date f =  Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        
        Instant instant = horaI.atDate(LocalDate.now()).atZone(ZoneId.systemDefault()).toInstant();
        BigInteger milis = BigInteger.valueOf(instant.getEpochSecond()).multiply(
        BigInteger.valueOf(1000));
        milis = milis.add(BigInteger.valueOf(instant.getNano()).divide(
        BigInteger.valueOf(1_000_000)));
        Date hi = new Date(milis.longValue());
        
        instant = horaF.atDate(LocalDate.now()).atZone(ZoneId.systemDefault()).toInstant();
        milis = BigInteger.valueOf(instant.getEpochSecond()).multiply(
        BigInteger.valueOf(1000));
        milis = milis.add(BigInteger.valueOf(instant.getNano()).divide(
        BigInteger.valueOf(1_000_000)));
        Date hf = new Date(milis.longValue());

        acontecimiento = new Acontecimiento(nombre,lugar, f,hi,hf,nro);
        //AcontecimientoBD.alta(acontecimiento);
        abd.create(acontecimiento);
    }
    
   public static void terminar(){
       System.exit(0);
   }
   
   public static void borrarAcontecimiento(String nombre) throws Exception
   {
       // Primero lo consultamos, mostramos sus datos y luego pedimos confirmación.
       
       acontecimiento = abd.findAcontecimiento(nombre);
       if (acontecimiento != null)
       {
            if (vp.mostrar(acontecimiento.toString()) == true)
                abd.destroy(nombre);
       }
       else
            throw new AcontecimientoNoEncontrado();
   }
    
    public static void modificarAcontecimientoParteUno(String nombre) throws Exception
   {
       acontecimiento = abd.findAcontecimiento(nombre);
       if (acontecimiento == null)
           throw new AcontecimientoNoEncontrado();
       ve = new VentanaAcontecimientos(acontecimiento);
       ve.setVisible(true);
   }
    
   public static void modificarAcontecimientoParteDos(String nombre, String lugar, LocalDate fecha, LocalTime horaI, LocalTime horaF, int nro) throws Exception
   {
       // Conversiones
       Date f =  Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        
        Instant instant = horaI.atDate(LocalDate.now()).atZone(ZoneId.systemDefault()).toInstant();
        BigInteger milis = BigInteger.valueOf(instant.getEpochSecond()).multiply(
        BigInteger.valueOf(1000));
        milis = milis.add(BigInteger.valueOf(instant.getNano()).divide(
        BigInteger.valueOf(1_000_000)));
        Date hi = new Date(milis.longValue());
        
        instant = horaF.atDate(LocalDate.now()).atZone(ZoneId.systemDefault()).toInstant();
        milis = BigInteger.valueOf(instant.getEpochSecond()).multiply(
        BigInteger.valueOf(1000));
        milis = milis.add(BigInteger.valueOf(instant.getNano()).divide(
        BigInteger.valueOf(1_000_000)));
        Date hf = new Date(milis.longValue());
        
       // actualizamos objeto en memoria
       acontecimiento.setLugar(lugar);
       acontecimiento.setFecha(f);
       acontecimiento.setHoraInicio(hi);
       acontecimiento.setHoraFin(hf);
       acontecimiento.setAforo(nro);
       
       abd.edit(acontecimiento);
   }
}
