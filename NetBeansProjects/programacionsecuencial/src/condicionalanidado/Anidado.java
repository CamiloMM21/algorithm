
package condicionalanidado;
import javax.swing.JOptionPane;

public class Anidado {
       public static void main(String[] args){   
           int n1, n2 , n3;
           
           n1 = Integer.parseInt(JOptionPane.showInputDialog("escribir numero entero #1"));
           n2 = Integer.parseInt(JOptionPane.showInputDialog("escribir numero entero #2"));
           n3 = Integer.parseInt(JOptionPane.showInputDialog("escribir numero entero #3"));
           
           if( n1 > n2 && n1 > n3){
                JOptionPane.showMessageDialog(null, n1 + "es mayor");
               
           }else{
                JOptionPane.showMessageDialog(null, n2 + "es mayor");
           }if( n2 > n1 && n2 > n3){
                   JOptionPane.showMessageDialog(null, n2 + "es mayor");
           }else{
                JOptionPane.showMessageDialog(null, n3 + "es mayor");
           }
       }
    
}
