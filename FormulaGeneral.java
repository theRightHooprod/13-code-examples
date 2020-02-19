package PrimerosPasos;

import javax.swing.JOptionPane;

public class FormulaGeneral {
    public static void main(String[] args) {
    double x1,x2;
    double a,b,c;
    
    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de a"));
    
    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de a"));
    
    c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de a"));
    
    x1= (-(b) + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
    x2= (-(b) - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);

    
    JOptionPane.showMessageDialog(null, "El resultado de x1 es: \n" + 
            x1 + "\n" +"El resultado de x2 es: \n" + x2);

    
    
    }
}
