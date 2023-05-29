
package promedio;

import javax.swing.JOptionPane;

 
public class PromedioNotas {
    
     public static void main(String[] args) {
          int n1, n2,n3, suma;
          double promedio;
          String Aprendiz;
         Aprendiz =  JOptionPane.showInputDialog("escriba su nombre:");
         n1 = Integer.parseInt(  JOptionPane.showInputDialog("escriba una nota 1"));
         n2 = Integer.parseInt(  JOptionPane.showInputDialog("escriba una nota 2"));
         n3 = Integer.parseInt(  JOptionPane.showInputDialog("escriba una nota 3"));
         suma = n1 + n2 + n3;
         promedio = suma / 3;
         
         JOptionPane.showMessageDialog(null,"la multi es: " + Aprendiz + "es" + promedio);
      
    }
}
