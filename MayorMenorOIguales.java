package PrimerosPasos;
import javax.swing.JOptionPane;

public class MayorMenorOIguales {
    public static void main(String[] args) {
    int a,b;
    
    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa"+
            " el primer numero"));
    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa"+
            " el segundo numero"));
    
    if(a > b){
        JOptionPane.showMessageDialog(null, "Mayor: " + a + 
                "\n" + "Menor: " + b);
    }else if(a==b){
        JOptionPane.showMessageDialog(null, a + " y " + b + " son iguales");
    }else{
        JOptionPane.showMessageDialog(null, "Mayor: " + b + 
                "\n" + "Menor: " + a);   
    
    }
    }

    
}
