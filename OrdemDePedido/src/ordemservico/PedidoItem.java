package ordemservico;

public class PedidoItem extends Produto{

    private Integer quantidade;

    public Double subTotal(){
        double soma;
        soma = quantidade * getPreco();
        return soma;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(final Integer quantidade) {
        this.quantidade = quantidade;
    }
}
