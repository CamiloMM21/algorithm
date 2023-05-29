
package ventadefrutas;

import javax.swing.JOptionPane;


public class Ventadefrutas {

  
    public static void main(String[] args) {
        int valsi, fruta = 0;
        double iva, total;
        fruta = Integer.parseInt(  JOptionPane.showInputDialog("menu de frutas\n"
        + "1 para manzanas \n"
        + "2 para peraz\n"
        + "3 para piña\n"
        + "4 para bananos\n"
        + "5 para fresas\n"));
        switch(fruta){
            case 1: {
                valsi = 3000;
                iva = (fruta * 19)/100;
                total = valsi + iva;
                JOptionPane.showMessageDialog(null,"fruta manzana:\n "
                        +"valor sin iva:  $3.000 \n "
                 + "fruta manzana: "+ iva +"\n "
                 + "fruta manzana: "+ total);
                break;
            }
            case 2: {
                valsi = 3400;
                iva = (fruta * 19)/100;
                total = valsi + iva;
                JOptionPane.showMessageDialog(null,"fruta peraz:\n "
                        +"valor sin iva:  $3.000 \n "
                 + "fruta manzana: "+ iva +"\n "
                 + "fruta manzana: "+ total);
                break;
            }
            case 3: {
                valsi = 1400;
                iva = (fruta * 19)/100;
                total = valsi + iva;
                JOptionPane.showMessageDialog(null,"fruta piña:\n "
                        +"valor sin iva:  $3.000 \n "
                 + "fruta manzana: "+ iva +"\n "
                 + "fruta manzana: "+ total);
                break;
            }
            case 4: {
                valsi = 3000;
                iva = (fruta * 19)/100;
                total = valsi + iva;
                JOptionPane.showMessageDialog(null,"fruta bananos:\n "
                        +"valor sin iva:  $3.000 \n "
                 + "fruta manzana: "+ iva +"\n "
                 + "fruta manzana: "+ total);
                break;
            }
            case 5: {
                valsi = 2000;
                iva = (fruta * 19)/100;
                total = valsi + iva;
                JOptionPane.showMessageDialog(null,"fruta fresas:\n "
                        +"valor sin iva:  $3.000 \n "
                 + "fruta manzana: "+ iva +"\n "
                 + "fruta manzana: "+ total);
                break;
            }
            default:{
                   JOptionPane.showMessageDialog(null,"no existe: ");
                    }
            
        }
    }
    
}
