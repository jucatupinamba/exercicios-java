package ordemservico;

public class PedidoItem extends Produto{

    private Integer quantidade;
    private double subTotal;

    public PedidoItem(final String nome, final Integer quantidade, final Double preco) {
        super(nome, preco);
        this.quantidade = quantidade;
    }

    public Double subTotal(){
        subTotal = quantidade * getPreco();
        return subTotal;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(final Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String toString(){
        return "Produto: " + getNome() + '\n' +
                "Quantidade: " + getQuantidade() + '\n' +
                "Preço: " + getPreco() + '\n' +
                "Subtotal: R$ " + subTotal;

    }
}
