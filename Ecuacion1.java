package PrimerosPasos;

import javax.swing.JOptionPane;

public class Ecuacion1 {
    public static void main(String[] args) {
    double x1,x2,xf;
    double a,b,c,n;
    
    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de a"));
    
    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de b"));
    
    c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de c"));
    
    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de n"));    
    
    x1 = Math.pow(b, 2) + 4*b * Math.sqrt(n);
    x2 = 2*c*a;
    xf = x1/x2;

    
    JOptionPane.showMessageDialog(null, "El resultado de x es: \n" + xf);

    
    
    }
}
