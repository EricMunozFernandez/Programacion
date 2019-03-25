/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojpa;

import Modelo.Personas;
import Modelo.PersonasJpaController;
import Vista.*;
import javax.persistence.Persistence;
public class EjemploJPA {

    private static Ventana v;
    private static Personas p;
    private static PersonasJpaController pjc;
    
    public static void main(String[] args) {
        
        pjc = new PersonasJpaController(Persistence.createEntityManagerFactory ("EjemploJPAPU"));
        
        v = new Ventana();
        v.setVisible(true);
    }
    
    public static void tenDatos(String dni, String nombre,Integer edad) throws Exception
    {
        p = new Personas(dni,nombre,edad);
        pjc.create(p);
    }
    
}
