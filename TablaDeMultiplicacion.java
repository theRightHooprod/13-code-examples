package PrimerosPasos;
import javax.swing.JOptionPane;

public class TablaDeMultiplicacion {
    public static void main(String[] args) {
    int numero;
    int a,b,c,d,e,f,g,h,i,j;
    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa" +
            "La tabla deseada"));
    
    a = numero * 1;
    b = numero * 2;
    c = numero * 3;
    d = numero * 4;
    e = numero * 5;
    f = numero * 6;
    g = numero * 7;
    h = numero * 8;
    i = numero * 9;
    j = numero * 10;
    
    JOptionPane.showMessageDialog(null, "-- Tabla del " + numero + " --" +
            "\n" + numero + " x 1 =" + a + 
            "\n" + numero + " x 2 =" + b +
            "\n" + numero + " x 3 =" + c +
            "\n" + numero + " x 4 =" + d +
            "\n" + numero + " x 5 =" + e +
            "\n" + numero + " x 6 =" + f +
            "\n" + numero + " x 7 =" + g +
            "\n" + numero + " x 8 =" + h +
            "\n" + numero + " x 9 =" + i +
            "\n" + numero + " x 1 =" + j);
            
    }

    
}
