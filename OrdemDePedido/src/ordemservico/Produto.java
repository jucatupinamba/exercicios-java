package ordemservico;

public class Produto {

    private String nome;
    private Double preco;

    public Produto(){}

    public Produto(final String nome, final Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(final Double preco) {
        this.preco = preco;
    }
}
