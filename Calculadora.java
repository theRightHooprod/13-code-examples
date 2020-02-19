package PrimerosPasos;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
    double a,b;
    double suma,resta,mult,div;
    
    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el " + 
            "primer valor"));
    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el " + 
            "segundo valor"));
    
    suma = a+b;
    resta = a-b;
    mult = a * b;
    div = a / b;
    
    JOptionPane.showMessageDialog(null, "Calculadora: " + "\n" + 
            "Suma: " + suma + "\n" +
            "Resta: " + resta + "\n" +
            "Multiplicacion: " + mult + "\n" +
            "Division: " + div
            );
    }
}
