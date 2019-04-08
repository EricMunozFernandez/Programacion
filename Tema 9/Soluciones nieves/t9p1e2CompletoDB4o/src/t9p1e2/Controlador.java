package t9p1e2;

import Modelo.UML.*;
import GUI.*;
import Modelo.BD.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Controlador {
   
    private static Acontecimiento acontecimiento;
    private static Persona p;
    private static Empresa e;
    
    // Lista de acontecimientos que admiten personas.
    private static ArrayList<Acontecimiento> listaAcontecimientos;
    
    private static VentanaPrincipal vp;
    private static VentanaAcontecimientos ve;
    private static VentanaInscripcion vi;
    
    public static void main(String[] args) {       
        try
        {
            // Abro solo una vez la conexión
            GenericoBD.abrirBD();

            vp = new VentanaPrincipal();
            vp.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println("Problemas en el main " + e.getClass());
        }
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
        AcontecimientoBD.alta(acontecimiento);
    }
    
   public static void terminar() throws Exception{
       GenericoBD.cerrarBD();
       System.exit(0);
   }
   
   public static String listado() throws Exception{
       return AcontecimientoBD.listado();
   }
   
   public static int borrarAcontecimiento(String nombre) throws Exception
   {
       // Primero lo consultamos, mostramos sus datos y luego pedimos confirmación.
       /* He modificado este método para que devuelva un int y
       no siempre salga en pantalla acontecimiento borrado*/
       
       acontecimiento = new Acontecimiento(nombre);
       acontecimiento = AcontecimientoBD.consultar(acontecimiento);
       if (vp.mostrar(acontecimiento.toString()) == true)
       {
           AcontecimientoBD.borrar(acontecimiento);
           return 1;
       }
       else
           return 0;
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
   
    // Añadido al completo
   public static boolean visualizarVentanaInscripcion() throws Exception{
        // Pido ya a la base de datos información sobre los proximos acontecimientos con plazas libres.
        listaAcontecimientos = AcontecimientoBD.consultarProximosLibres();
        
        if (listaAcontecimientos.isEmpty())
            return false;
        
        // Dejo por debajo la principal
         vi = new VentanaInscripcion();
         vi.setVisible(true);
         return true;
    }
   
   public static int getNumeroAcontecimientosDisponibles()
    {
        return listaAcontecimientos.size();
    }
   
    public static String getNombreAcontecimiento(int x)
    {
        return listaAcontecimientos.get(x).getNombre();
    }
   
    public static LocalDate getFechaAcontecimiento(int x)
    {
        acontecimiento = listaAcontecimientos.get(x);
        return acontecimiento.getFecha();
    }
    
    public static LocalTime getHoraAcontecimiento()
    {
        return acontecimiento.getHoraI();
    }
    
    public static boolean buscarPersona(String dni) throws Exception{
       p = new Persona();
       p.setDni(dni);
       p = PersonaBD.queryByDni(p);
       if (p != null)
           return true;
       return false;
   }
   
   public static String getNombre(){
       return p.getNombre();
   }
   
   public static String getApellidos(){
       return p.getApellidos();
   }
   
   public static String getTelefono(){
       return p.getTelefono();
   }
   
   public static String getNombreEmpresa(){
       return p.getE().getNombre();
   }
   
   public static String getNif(){
       return p.getE().getNif();
   }
   
   public static String getCnae(){
       return p.getE().getCnae().toString();
   }
   
   public static String getRazonSocial(){
       return p.getE().getRazonSocial();
   }
   
   public static void altaAsistente() throws Exception{
       // Relaciones
       acontecimiento.setAsistente(p);
       p.setEvento(acontecimiento);
       
       // A la base de datos
       AcontecimientoBD.alta(acontecimiento);
       
   }
   
   public static void altaPersonaEmpresa(String d,String n,String ap,String tel,String nif,String nEmp,String rs,String cnae) throws Exception{
     // Estructura de objetos y relaciones
       p = new Persona(d,n,ap,tel);
       
       // No se si la empresa es nueva
       e = new Empresa();
       e.setNif(nif);
       e = EmpresaBD.queryByNif(nif);
       if (e == null)
       {
           e = new Empresa(nif,nEmp,rs,Integer.parseInt(cnae));
       }
       p.setE(e);
              
       acontecimiento.setAsistente(p);
       p.setEvento(acontecimiento);
       
    // Vamos a la base de datos
       AcontecimientoBD.alta(acontecimiento);
   }
   
   public static String getAsistentes(String nombre) throws Exception
   {
       acontecimiento = AcontecimientoBD.consultar(new Acontecimiento(nombre));
       if (acontecimiento.getListaAsistentes() != null)
       {
            String datos="";
            for(Persona obj:acontecimiento.getListaAsistentes())
            {
                datos += obj.toString() + "\n";
            }
       
            return datos;
       }
       else
           return " No hay asistentes";
   }
}
