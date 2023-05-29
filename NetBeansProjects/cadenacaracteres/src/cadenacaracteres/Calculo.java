
package cadenacaracteres;

import javax.swing.JOptionPane;

public class Calculo {

  
    public static void main(String[] args) {
      String nombre;
     nombre = JOptionPane.showInputDialog("escriba su nombre");
        JOptionPane.showInternalMessageDialog(null,"su nombre es: " + nombre + "hasta luego" + "\n"
        + "vuelve de nuevo " + nombre);
    }
    
}
