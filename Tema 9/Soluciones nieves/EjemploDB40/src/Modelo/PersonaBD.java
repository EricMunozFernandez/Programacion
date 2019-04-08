
package Modelo;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;

public class PersonaBD {
    private Persona p;
    private ObjectContainer oc;
    
    public PersonaBD(ObjectContainer oc){
        this.oc = oc;
    }
    public void insertar(Persona p)
    {
        oc.store(p);
    }
    public ArrayList<Persona> consultaTodos(){
        p = new Persona();
        ArrayList<Persona> lista = new ArrayList();
        ObjectSet conjunto = oc.queryByExample(p);
        while(conjunto.hasNext())
        {
            p = (Persona) conjunto.next();
            lista.add(p);
        }
        oc.close();
        return lista;
    }
    
}
