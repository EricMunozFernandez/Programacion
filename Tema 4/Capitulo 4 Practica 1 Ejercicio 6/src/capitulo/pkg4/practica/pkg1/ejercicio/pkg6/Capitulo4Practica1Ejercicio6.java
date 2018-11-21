/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.pkg4.practica.pkg1.ejercicio.pkg6;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Capitulo4Practica1Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hojaAlumno[][]=new int [5][31];
        inicializaArrayhojaAlumno(hojaAlumno);        
        char continuar;
        do
        {
            solicitarDatosEntrada(hojaAlumno);
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? <s/n>").toLowerCase().charAt(0);
        }
        while (continuar == 's');
        
        visualizarfaltas(hojaAlumno);
    }
    
    public static void inicializaArrayhojaAlumno(int[][] hojaAlumno)
    {
        for (int x = 0; x < hojaAlumno.length; x++)
             for (int y = 0; y < hojaAlumno[x].length; y++)
                hojaAlumno[x][y] = 0;
    }

    private static void solicitarDatosEntrada(int[][] hojaAlumno)
    {

        boolean error=false;
        do
        {
            try
            {
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia de noviembre: "));
            if(dia<0||dia>31)
            {
                throw new diaMalEx();
            }
            int codAlum= Integer.parseInt(JOptionPane.showInputDialog("Teclea el codigo del alumno(1 al 5): "));
            
        
        if (hojaAlumno[codAlum-1][dia-1] != 0)
        {
            JOptionPane.showMessageDialog(null, "Para este día y alumno ya has indicado las faltas");
        }
        else
        {
            // Entrada y acumulacion de los litros caidos
            int faltas =Integer.parseInt(JOptionPane.showInputDialog("Teclea las faltas: "));
            error=false;
            hojaAlumno[codAlum-1][dia-1] = faltas;
        }
            }
            catch(diaMalEx e)
            {
             JOptionPane.showMessageDialog(null, "EL MES DE NOVIEMBRE VA DESDE 1 AL 31" );
             error=true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Inserta un numero" );
            }
        }
        while(error==true);
    }


    private static void visualizarfaltas(int[][] hojaAlumno)
    {
        String alumno = "";
        for (int x = 0; x < hojaAlumno.length; x++)
        {
           float faltasMes = 0;
           for (int y = 0; y < hojaAlumno[x].length; y++)  
                faltasMes += hojaAlumno[x][y];
           alumno = alumno + (x+1) + " - " + faltasMes+ "\n";
  
        }   
       JOptionPane.showMessageDialog(null, "Las faltas en noviembre son: \n" + alumno );        
    }
}
