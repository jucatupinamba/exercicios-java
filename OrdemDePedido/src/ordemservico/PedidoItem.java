package ordemservico;

public class PedidoItem extends Produto{

    private Integer quantidade;

    public Double subTotal(){
        double soma;
        soma = quantidade * getPreco();
        return soma;
    }
}
