/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1gdaw07
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double area()
    {
        double area=Math.PI*this.radio*this.radio;
        return area;
    }
    public double perimetro()
    {
        double perimetro=2*Math.PI*this.radio;
        return perimetro;
    }
    public double volumen()
    {
        double volumen=4*Math.PI*this.radio*this.radio*this.radio/3;
        return volumen;
    }
    
}
