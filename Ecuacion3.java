package PrimerosPasos;
import javax.swing.JOptionPane;

public class Ecuacion3 {
    public static void main(String[] args) {
    double z,parteA,parteB;
    double a,b,c,n;
    
    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de a"));
    
    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de b"));
    
    c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de c"));
    
    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de n"));    
    
    parteA = Math.sqrt((2*a*Math.pow(b, 3)*Math.pow(c, 3))/Math.sqrt(n));
    parteB = Math.sqrt((4*a*b)/c*Math.pow(b, 2));
    z = parteA - parteB;

    
    JOptionPane.showMessageDialog(null, "El resultado de x es: \n" + z);

    
    }   
}
