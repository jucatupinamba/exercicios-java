package ordemservico;

import ordemservico.enumclasse.StatusDoPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemPedido {

    private List<PedidoItem> listaPedido = new ArrayList<>();
    Cliente cliente = new Cliente();
    private Date horaCompra;
    StatusDoPedido status;

    public OrdemPedido(final Date horaCompra, final StatusDoPedido status) {
        this.horaCompra = horaCompra;
        this.status = status;
    }

    public OrdemPedido() {
    }

    public void addItem(PedidoItem pedidoItem){
        listaPedido.add(pedidoItem);
    }

    public void removeItem(PedidoItem pedidoItem){
        listaPedido.remove(pedidoItem);
    }


    public Double total(){
        double somaProdutos = 0;
        int i = 0;
        while( i < listaPedido.size()){
            somaProdutos = listaPedido.get(i).subTotal();
            i++;
        }
        return somaProdutos;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDEM DE PEDIDO");
        sb.append("Cliente : " + cliente.getNome());
        sb.append("Email: " + cliente.getEmail());
        sb.append("Data de Nascimento: " + cliente.getDataNascimento());
        for (PedidoItem pedidoItem : listaPedido) {
            sb.append(pedidoItem + "\n");
        }
        sb.append("Preço Total: ");
        sb.append(String.format("R$ %.2f", total()));
        return sb.toString();

    }

    public List<PedidoItem> getListaPedido() {
        return this.listaPedido;
    }

    public Date getHoraCompra() {
        return this.horaCompra;
    }

    public void setHoraCompra(final Date horaCompra) {
        this.horaCompra = horaCompra;
    }

    public StatusDoPedido getStatus() {
        return this.status;
    }

    public void setStatus(final StatusDoPedido status) {
        this.status = status;
    }
}
