package src.CalculaJava;

public class Calculadora extends CalculadoraForm{
    private double n1;
    private double n2;
    private double soma;
    private double subtracao;
    private double divisao;
    private double multiplicacao;

    public Calculadora(){

    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        soma = n1 + n2;
        this.soma = soma;
    }

    public double getSubtracao() {
        return subtracao;
    }

    public void setSubtracao(double subtracao) {
        subtracao = n1 - n2;
        this.subtracao = subtracao;
    }

    public double getDivisao() {
        return divisao;
    }

    public void setDivisao(double divisao) {
        divisao = n1 / n2;
        this.divisao = divisao;
    }

    public double getMultiplicacao() {
        return multiplicacao;
    }

    public void setMultiplicacao(double multiplicacao) {
        multiplicacao = n1 * n2;
        this.multiplicacao = multiplicacao;
    }
}
