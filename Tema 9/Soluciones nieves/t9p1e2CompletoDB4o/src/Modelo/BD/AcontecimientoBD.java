
package Modelo.BD;


import Excepciones.AcontecimientoNoEncontrado;
import Modelo.UML.*;
import com.db4o.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class AcontecimientoBD{
       
    private static Acontecimiento acontecimiento;
     
    public static void alta(Acontecimiento ac) throws Exception
    {
         GenericoBD.getCon().store(ac);
    }
    
    public static String listado() throws Exception{
        // Método que genera un String con los datos de todos los acontemientos
        ObjectSet resultado = GenericoBD.getCon().queryByExample(new Acontecimiento());
         
        String mensaje="";
        while (resultado.hasNext())
        {
            acontecimiento = (Acontecimiento) resultado.next();
                
            mensaje += acontecimiento.toString()+"\n";
        }
        return mensaje;
    }
    
    
    public static void borrar(Acontecimiento ac) throws Exception
    {
        GenericoBD.getCon().delete(ac);
    }
    
    public static Acontecimiento consultar(Acontecimiento ac) throws Exception{
        ObjectSet resultado = GenericoBD.getCon().queryByExample(ac);
        if (resultado.hasNext())
        {
            acontecimiento = (Acontecimiento) resultado.next();
        }
        else
            throw new AcontecimientoNoEncontrado();
                
        return acontecimiento;
    }
    
    public static void modificar(Acontecimiento ac) throws Exception
    {
       GenericoBD.getCon().store(ac);
    }
    
    // Añadido para el ejercicio completo
    public static ArrayList<Acontecimiento> consultarProximosLibres() throws Exception
    { 
        /* Query query = GenericoBD.getCon().query();
        // identificamos el tipo de objeto que buscamos
        query.constrain(Acontecimiento.class);
       // subconsulta sobre la fecha
        Query consultaFecha = query.descend("fecha");
        // condición > que al actual
        LocalDate hoy = LocalDate.now();
        consultaFecha.constrain(hoy).greater();
        //consultaFecha.constrain(new Date()).greater();
        // Ejecución
        ObjectSet resultado = query.execute();*/
        
        ObjectSet resultado = GenericoBD.getCon().queryByExample(Acontecimiento.class);
        ArrayList<Acontecimiento> lista = new ArrayList();
        while (resultado.hasNext()){
           acontecimiento = (Acontecimiento) resultado.next();
           if (acontecimiento.getFecha().isAfter(LocalDate.now()))
                    if (acontecimiento.isPlazasDisponibles())
                         lista.add(acontecimiento);
        }
        return lista;
    }
}
