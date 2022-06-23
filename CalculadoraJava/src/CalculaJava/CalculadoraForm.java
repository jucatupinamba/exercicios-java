package src.CalculaJava;

import javax.swing.*;

public abstract class CalculadoraForm extends JFrame {

    protected JLabel lblSoma;
    protected JTextField txtSoma;

    protected JLabel lblSubtracao;

    public CalculadoraForm(){
        this.inicializar();
    }

    private void inicializar(){
        this.setTitle("Calculadora");
        this.setSize(640, 480);
    }
}

