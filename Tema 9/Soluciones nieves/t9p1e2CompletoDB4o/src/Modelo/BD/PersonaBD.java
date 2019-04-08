package Modelo.BD;

import Modelo.UML.*;
import com.db4o.*;
import java.util.ArrayList;

public class PersonaBD {
    
    public static Persona queryByDni(Persona p) throws Exception{
         ObjectSet os =  GenericoBD.getCon().queryByExample(p);
         if (os.hasNext())
             return (Persona) os.next();
         return null;
    }
    
    public static void alta(Persona p) throws Exception
    {
        GenericoBD.getCon().store(p);
    }
    
    public static ArrayList<Persona> getAsistentes(String nombreAcontecimiento)throws Exception
    {
        ArrayList<Persona> lista = new ArrayList();
        
        Acontecimiento ac = new Acontecimiento(nombreAcontecimiento);
        ac = AcontecimientoBD.consultar(ac);
        
       
        
        return lista;
    }
    
}
