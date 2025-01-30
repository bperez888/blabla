/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales1;

import javax.swing.JOptionPane;

/**
 *
 * @author bren
 */
public class NewClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int dato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero "));
        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "el numero es 5");
        } else {
            JOptionPane.showMessageDialog(null, "el numero es diferente de 5");
        }
        //desigualdad !=
        //mayor >
        //menor <
        //igualdad ==
        //SENTENCIA SWITCH
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entre 1-5"));
        switch (number) {
            case 1 -> JOptionPane.showMessageDialog(null, "es el numero 1");
            case 2 -> JOptionPane.showMessageDialog(null, "es el numero 2");
            case 3 -> JOptionPane.showMessageDialog(null, "el numero es el 3");
            case 4 -> JOptionPane.showMessageDialog(null, "es el numero 4");
            case 5 -> JOptionPane.showMessageDialog(null, "es el numero 5");
            default -> JOptionPane.showMessageDialog(null, "el numero no esta en el rango del 1 al 5");
        }
        //programa q lea numero entero y muestre si es multiplo de 10
        int numb;
        numb = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        if (numb % 10 == 0) {
            JOptionPane.showMessageDialog(null, "el numero " + numb + "es multiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "el numero no es multiplo de 10");
        }
        switch (number) {
            case 1 -> comisionFactura += monto * 0.10;
            case 2 -> JOptionPane.showMessageDialog(null, "es el numero 2");
            case 3 -> JOptionPane.showMessageDialog(null, "el numero es el 3");
            case 4 -> JOptionPane.showMessageDialog(null, "es el numero 4");
            case 5 -> JOptionPane.showMessageDialog(null, "es el numero 5");
            default -> JOptionPane.showMessageDialog(null, "el numero no esta en el rango del 1 al 5");
        }
    }
    
}
