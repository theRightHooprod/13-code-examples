package PrimerosPasos;
import javax.swing.JOptionPane;

public class Ecuacion2 {
    public static void main(String[] args) {
    double parteA,parteB;
    double a,b,c,n,y;
    
    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de a"));
    
    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de a"));
    
    c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de a"));
    
    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor "
            + "de a"));    
    
    parteA = Math.sqrt((25*Math.sqrt(n))/3*Math.pow(b, 4));
    parteB = Math.sqrt((25*c* Math.pow(b, 4))/2*Math.pow(a, 2)*c);
    y = parteA/parteB;

    
    JOptionPane.showMessageDialog(null, "El resultado de x es: \n" + y);

    
    }   
}
