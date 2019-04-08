package Modelo.BD;

import Modelo.UML.*;
import com.db4o.*;
import com.db4o.config.Configuration;

public class GenericoBD {
    /* Clase que contiene los método necesarios para trabajar
    con la base de datos */
    
    private static ObjectContainer con;
        
    public static void abrirBD() throws Exception
    { 
        Configuration configuracion = Db4o.newConfiguration();
        configuracion.objectClass(Acontecimiento.class).updateDepth(50);
        configuracion.objectClass(Empresa.class).updateDepth(50);
        configuracion.objectClass(Persona.class).updateDepth(50);
        con = Db4o.openFile(configuracion,"bdAcontecimientos");
       
    }
    
    public static void cerrarBD() throws Exception
    {    
        con.close();
    }

    public static ObjectContainer getCon() 
    {
        return con;
    }
}
