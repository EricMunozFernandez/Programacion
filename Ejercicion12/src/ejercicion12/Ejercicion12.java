/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicion12;

/**
 *
 * @author 1gdaw07
 */
import javax.swing.JOptionPane;
public class Ejercicion12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n=Double.parseDouble(JOptionPane.showInputDialog("Inserte consumo mensual"));
        if(n<300)
        {
            double f=n*0.04;
            JOptionPane.showMessageDialog(null,"se te cobra "+ f+"€");
        }
        else
        {
            if(n<500)
            {
                double f = n*0.03;
                JOptionPane.showMessageDialog(null,"se te cobra "+ f+"€");
            }
            else{
                if(n<800)
                {
                    double f=300*0.03+(n-300)*0.02;
                    JOptionPane.showMessageDialog(null,"se te cobra "+ f+"€");
                }
                else
                {
                    double f=300*0.03+(n-300)*0.02;
                    double porcentaje=f*1.25/100;
                    double a=f-porcentaje;
                    JOptionPane.showMessageDialog(null,"se te cobra "+ a+"€");
                }
            }
        }
    }
    
}
