
package condicionalsimple;
import javax.swing.JOptionPane;

public class Simple {
    
    public static void main(String[] args){     
    int num;
    num = Integer.parseInt(JOptionPane.showInputDialog("escribir numero entero"));
    if(num >0){
       JOptionPane.showMessageDialog(null, num + "es positivo");
     } else{
         JOptionPane.showMessageDialog(null, num + "es negativo");
    }
    }
}
