package PrimerosPasos;
import javax.swing.JOptionPane;

public class Multiplicacion {
    public static void main(String[] args) {
    int x,y;
    int multiplicacion;
    
    x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa"+
            " el primer numero"));
    y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa"+
            " el segundo numero"));
    
    multiplicacion = x * y;
    
    JOptionPane.showMessageDialog(null, "Multiplicacion: " + multiplicacion);
        
    }


}
