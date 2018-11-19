/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

/**
 *
 * @author 1gdaw07
 */
import java.util.Scanner;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        sc = new Scanner (System.in);
        System.out.println("Inserta valor de la base");
        String base =sc.nextLine();
        int n1= Integer.parseInt(base);//transformar String a int
        System.out.println("Inserta valor de la altura");
        int n2= Integer.parseInt(sc.nextLine());//transgormar string a in directamente en el menasje de entrada
        int perimetro=2*n1+2*n2;//formula perimetro
        System.out.println("El perimetro es "+ perimetro);
        
        
        
    }
    
}
