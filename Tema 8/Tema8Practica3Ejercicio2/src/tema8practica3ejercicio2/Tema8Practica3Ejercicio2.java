/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8practica3ejercicio2;

import GUI.Vista;
import UML.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw07
 */
public class Tema8Practica3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static Vista v;
    public static void main(String[] args) {       
        v= new Vista();
        v.setVisible(true);
    }
    public static void añadirSocioIndividual(String nomSocio, String apellido, String telefono,String correo)
    {
        ArrayList <SocioIndividual> sociosIndividuales= new ArrayList();
         SocioIndividual sI=new SocioIndividual(nomSocio,apellido,telefono,correo);
        sociosIndividuales.add(sI);
    }
    public static void añadirSocioFamiliar(String nomSocio, String apellido, String telefono,String correo,String nomHijo,Object dia,Object mes,Object año)
    {
        ArrayList <Hijo> hijos= new ArrayList();
        ArrayList <SocioFamiliar> SociosFamiliares= new ArrayList();
        int diaNac=Integer.parseInt(dia.toString());
        int mesNac=Integer.parseInt(mes.toString());
        int añoNac=Integer.parseInt(año.toString());
        LocalDate nacimientoHijo = LocalDate.of(añoNac,mesNac,diaNac);
        Hijo hijo=new Hijo(nomHijo,nacimientoHijo);
        hijos.add(hijo);        
        SocioFamiliar sF=new SocioFamiliar(hijos,nomSocio,apellido,telefono,correo);
        SociosFamiliares.add(sF);
    }

    
}
