
package introduccionparte1;

import javax.swing.JOptionPane;


public class Calculo {
   

    public static void main(String[] args) {
     String nombre;
     int edad;
     double num;
     
    
     nombre = JOptionPane.showInputDialog("escribia su nombre ");
     edad = Integer.parseInt( JOptionPane.showInputDialog("escribia su edad "));
     num = Double.parseDouble(JOptionPane.showInputDialog("escriba un numero decimal "));
     
     JOptionPane.showMessageDialog(null,"su nombre es:" + nombre);
     JOptionPane.showMessageDialog(null,"su edad es:" + edad);
      JOptionPane.showMessageDialog(null,"$ decimal es::" + num);
    }
    
}
