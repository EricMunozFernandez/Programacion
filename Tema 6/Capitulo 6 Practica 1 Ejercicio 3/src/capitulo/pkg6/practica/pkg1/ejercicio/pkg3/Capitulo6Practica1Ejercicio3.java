/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg6.practica.pkg1.ejercicio.pkg3;

import UML.Persona;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo6Practica1Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static LocalDate fechaNacimiento;
    public static void main(String[] args) {
        // TODO code application logic here
        Persona lista[]=new Persona[3];
        for(int x=0;x<lista.length;x++)
        {            
            try
            {
                Persona p= new Persona();
                String nombre = JOptionPane.showInputDialog("Teclea el nombre de la persona (2 caracteres minimo)");
                validarNombre(nombre);
                p.setNombre(nombre);
                String codigoPostal = JOptionPane.showInputDialog("Teclea el código Postal (5 caracteres)");
                validarCodigoPostal(codigoPostal);
                p.setCodigoPostal(codigoPostal);
                String direccion = JOptionPane.showInputDialog("Teclea la direccion de la persona (10 caracteres)");
                validarDireccion(direccion);
                p.setDireccion(direccion);
                String ciudad = JOptionPane.showInputDialog("Teclea la ciudad de la persona");
                p.setCiudad(ciudad);
                String dNacimiento = JOptionPane.showInputDialog("Teclea el dia de nacimiento (DD)");
                validarDia(dNacimiento);
                p.setdNacimiento(dNacimiento);
                String mNacimiento = JOptionPane.showInputDialog("Teclea el mes de nacimiento (MM)");
                validarMes(mNacimiento);
                p.setmNacimiento(mNacimiento);
                String aNacimiento = JOptionPane.showInputDialog("Teclea el año de nacimiento (YYYY)");
                validarAño(aNacimiento);
                p.setaNacimiento(aNacimiento);
                fechaNacimiento=p.fechaNacimiento();
                lista[x]=p;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null,"El dato introducido no es correcto");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "error"+e.getMessage());
            }
        }
        buscarMayorEdad(lista);
        buscarDireccion(lista);
        numeroPersonasMayores(lista);
    }
    public static void buscarMayorEdad(Persona[]lista)
    {
        int max=0;
        int pos=0;
        for(int x=0;x<lista.length;x++)
        {
            if(lista[x].edad(fechaNacimiento)>max)
            {
                max=lista[x].edad(fechaNacimiento);
                pos=x;
            }
        }
        JOptionPane.showMessageDialog(null,"La persona mas vieja es"+lista[pos].getNombre()+"y tiene"+lista[pos].edad(fechaNacimiento));
    }
    public static void buscarDireccion(Persona[]lista)
    {
        for(int x=0;x<lista.length;x++)
        {
            if(lista[x].getCiudad().equals("Elche"))
            {
                JOptionPane.showMessageDialog(null,"La persona "+lista[x].getNombre()+" vive en Elche"); 
            }
        }
    }
    public static void numeroPersonasMayores(Persona[]lista)
    {
        int x;
        for(x=0;x<lista.length;x++)
        {
            if(lista[x].edad(fechaNacimiento)>18)
            {
                JOptionPane.showMessageDialog(null,"La persona "+lista[x].getNombre()+" es mayor de edad");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"La persona "+lista[x].getNombre()+" no es mayor de edad");
            }
        }
    }
    public static void validarNombre(String nombre)throws Exception{
        
        boolean error=false;
        if (nombre.length()<= 2)
        {
            error = true;
        }
        else
        {            
            for (int x = 0; x < nombre.length() && error == false;x++)
            {
                if (Character.isDigit(nombre.charAt(x)))
                {
                    error = true;
                }
            }
        }
        if (error)
        {
            throw new DatoNoValido();   
        }
    }
    public static void validarCodigoPostal(String codigoPostal)throws Exception{
        // Cinco dígitos numéricos
        boolean error=false;
        if (codigoPostal.length()!= 5)
        {
            error = true;
        }
        else
        {
            for (int x = 0; x < codigoPostal.length() && error == false;x++)
            {
                if (Character.isAlphabetic(codigoPostal.charAt(x)))
                {
                    error = true;
                }
            }            
        }
        if (error)
        {
            throw new DatoNoValido();
        }                    
    }
    public static void validarDireccion(String direccion)throws Exception{
        if (direccion.length()<= 10)
        {
            throw new DatoNoValido();
        }                    
    }
    public static void validarDia(String dNacimiento)throws Exception{
        boolean error=false;
        if (dNacimiento.length()!=2)
        {
            throw new DatoNoValido();
        }   
        for (int x = 0; x < dNacimiento.length() && error == false;x++)
            {
                if (Character.isAlphabetic(dNacimiento.charAt(x)))
                {
                    error = true;
                }
            }
    }
    public static void validarMes(String mNacimiento)throws Exception{
        boolean error=false;
        if (mNacimiento.length()!=2)
        {
            throw new DatoNoValido();
        }   
        for (int x = 0; x < mNacimiento.length() && error == false;x++)
            {
                if (Character.isAlphabetic(mNacimiento.charAt(x)))
                {
                    error = true;
                }
            }
    }
    public static void validarAño(String aNacimiento)throws Exception{
        boolean error=false;
        if (aNacimiento.length()!=4)
        {
            throw new DatoNoValido();
        }   
        for (int x = 0; x < aNacimiento.length() && error == false;x++)
            {
                if (Character.isAlphabetic(aNacimiento.charAt(x)))
                {
                    error = true;
                }
            }
    }
}
