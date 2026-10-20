package com.mycompany.mavenproject2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */

public class PrincipaCalculadora{


public static void main (String [] args){
    int x, y;
    String sX, sY;
    
    sX = JOptionPane.showInputDialog(null, "Digite o o primeiro numero:",
            "primeiro numero", JOptionPane.QUESTION_MESSAGE );
    x = Integer.parseInt(sX);
    
    sY = JOptionPane.showInputDialog(null, "Digite o o seguyndoo numero:",
            "segundo numero", JOptionPane.QUESTION_MESSAGE );
    y = Integer.parseInt(sY);
    
    Calculadora calc = new Calculadora();
    
    JOptionPane.showMessageDialog(null, "somar:" + calc.somar (x, y));
    JOptionPane.showMessageDialog(null, "subtrair:" + calc.dimunuir(x, y));
    JOptionPane.showMessageDialog(null, "multiplicar:" + calc.multiplicação(x, y));
    JOptionPane.showMessageDialog(null, "dividirr:" + calc.somar (x, y));
    
    System.exit(0);

}
}