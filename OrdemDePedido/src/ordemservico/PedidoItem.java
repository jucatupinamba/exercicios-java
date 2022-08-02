package ordemservico;

public class PedidoItem{

    private String nome;
    private Double preco;
    private Integer quantidade;
    private double subTotal;

    public PedidoItem(final String nome, final Integer quantidade, final Double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Double subTotal(){
        subTotal = quantidade * preco;
        return subTotal;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(final Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String toString(){
        return "Produto: " + nome + '\n' +
                "Quantidade: " + getQuantidade() + '\n' +
                "Preço: " + preco + '\n' +
                "Subtotal: R$ " + subTotal;

    }
}
