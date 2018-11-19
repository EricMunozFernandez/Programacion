/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author 1gdaw07
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear variables en java
        // Variable numericas
        // Enteros (se puede delimitar los numeros con _ pero hay que poner al final la letra de la variable B,S,I,L)
        byte v1; // 8 bits (signo y 7 bits)
        short v2; // 16 bits (signo y 15 bits)
        v2 = 6;
        int v3; // 32 bits (signo y 31 bits)
        v3 = 10;
        long v4; // 64 bits (signo y 63 bits)
        v4 = 564321;
        // Reales
        float v5; // 32 bits (con decimales)
        v5 = 8.14f;
        double v6;// 64 bits (con decimales)
        v6 = 5.78;
        //Variables alfanuméricas
        char v7; //solo un carácter
        v7 ='a'; //comillas simples
        String v8; // Cadena de caracteres
        v8="hola"; // comillas dobles
        // Variables booleanas
        boolean v9; // solo verdadero o falso 1 bit (0 o 1)
        v9 = false;
        
        String nombre = "Nieves";
        int contador = 0;
        int n1,n2;
        int n3=9,n4=8,n5;
        
        // constantes
        final float PI =3.14f;
        
        
        nombre = javax.swing.JOptionPane.showInputDialog("Dime tu nombre"); //solo String
        //Conversion
        String edad = javax.swing.JOptionPane.showInputDialog("Dime tu edad");
        byte edadNumerica =Byte.parseByte(edad); //transformar el String en byte
        //System.in.read siempre devuelve int
        //char c=(char) System.in.read();
        //sc.nextLine()siempre devuelve String
        //opcion =Integer.parseInt(sc.nextLine());
        
        System.out.println(5/9);// Muestra 0
        System.out.println((double)5/9);//muestra con decimales
        //con parse
        //byte – Byte
        //short – Short
        //int – Integer
        //long – Long
        //float – Float
        //double – Double
        //boolean – Boolean
        //char – Character
        String nombreDos;
        //nombreDos. mostrara diferentes variables para String
        
        
        
        
    }
    
}
