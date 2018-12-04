/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg6.practica.pkg1.ejercicio.pkg2;

import Clases.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07
 */
public class Capitulo6Practica1Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static Alumno a;
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alumno>agenda=new ArrayList();
        do
        {
            a= new Alumno();
            a.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Inserta el codigo del alumno")));
            a.setNombre(JOptionPane.showInputDialog("Inserta el nombre del alumno"));
            a.setDomicilio(JOptionPane.showInputDialog("Inserta el domicilio del alumno"));
            a.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Inserta el telefono del alumno")));
            agenda.add(a);
        }
        while(JOptionPane.showConfirmDialog(null,"Quieres continuar?")==0);
        int cod=Integer.parseInt(JOptionPane.showInputDialog("Inserta el codigo del alumno del que quieres saber los datos"));
        for(int x=0;x<agenda.size()&&a.getCodigo()!=cod;x++)
        {}
        if(a.getCodigo()==cod)
        {
        JOptionPane.showMessageDialog(null,"El alumno es:\n");
        }
    }
    
}
