
package variablenumerica;

import javax.swing.JOptionPane;


public class Calculo {


    public static void main(String[] args) {
        int n1;
        double n2;
        n1 = Integer.parseInt( JOptionPane.showInputDialog("escribir un numero entero"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("escribir otro numero entero"));
        JOptionPane.showMessageDialog(null, "# Entero" + n1);
        JOptionPane.showMessageDialog(null, "# real (decimal)" + n2);
    }
    
}
