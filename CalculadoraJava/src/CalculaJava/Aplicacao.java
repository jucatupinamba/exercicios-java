package src.CalculaJava;

import javax.swing.*;

public class Aplicacao {
    public static void main (String [] args){
        SwingUtilities.invokeLater(() -> {
            Calculadora calc = new Calculadora();
            calc.setVisible(true);
        });
    }
}
