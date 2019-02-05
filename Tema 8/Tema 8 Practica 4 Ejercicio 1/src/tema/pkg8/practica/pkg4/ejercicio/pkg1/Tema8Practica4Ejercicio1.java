/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg8.practica.pkg4.ejercicio.pkg1;

import GUI.*;
import UML.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw07
 */
public class Tema8Practica4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    /*ventanas*/
    public static VentanaUsuario v1;
    public static VentanaMenu v2;
    public static VentanaSecundaria v3;
    /*ArrayList*/
    public static ArrayList<Departamento> listaDep;
    public static ArrayList<Contrato> listaCont;
    public static ArrayList<LogInPersona> listaPersona; 
    /*objetos*/
    public static Departamento dep;
    public static Contrato cont;
    public static LogInPersona persona;
    public static Personal usuario;
    public static void main(String[] args) { 
        crear();
        v2= new VentanaMenu();
        v1= new VentanaUsuario(v2,true);
        v2.setVisible(true);        
        v1.setVisible(true);
    }
    public static void crear()
    {
        crearDepartamento();
        crearContrato();
        crearPersonal();
        crearUsuario();
    }
    public static void crearDepartamento()
    {
        listaDep=new ArrayList();
        listaDep.add(dep);
        dep= new Departamento("dep1");
        listaDep.add(dep);
        dep= new Departamento("dep2");
        listaDep.add(dep);
        dep= new Departamento("dep3");
        listaDep.add(dep);
        dep= new Departamento("dep4");
    }
    public static void crearContrato()
    {
        listaCont=new ArrayList();
        listaCont.add(cont);
        cont= new Contrato("cont1");
        listaCont.add(cont);
        cont= new Contrato("cont2");
        listaCont.add(cont);
        cont= new Contrato("cont3");
        listaCont.add(cont);
        cont= new Contrato("cont4");
        listaCont.add(cont); 
    }
    public static void crearPersonal()
    {
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha= LocalDate.parse("01/02/1998",formato);
        listaCont=new ArrayList();
        persona= new LogInPersona();
        persona.setDni("12345678W");
        persona.setNss("nss1");
        persona.setNombreApellido("serguiosr estesig");
        persona.setDireccion("direccion 1");
        persona.setTelefono(999999999);
        persona.setSexo('h');
        persona.setEstadoCivil('c');
        persona.setTipoContrato(listaCont);
        persona.setDepartamento(listaDep);
        persona.setFechaAlta(fecha);
        persona.setNumEmpleado("emp1");
    }
    public static void crearUsuario()
    {
        usuario=new Personal("admin","admin");      
    }
    public static boolean validar(String usuario1, String contraseña)
    {
        if(usuario.getUsuario().compareToIgnoreCase(usuario1)!=0||usuario.getPassword().compareToIgnoreCase(contraseña)!=0)
        {
            return false;
        }
        return true;
    }
}
