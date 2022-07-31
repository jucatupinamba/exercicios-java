package ordemservico;

import ordemservico.enumclasse.StatusDoPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemPedido {

    private List<PedidoItem> listaPedido = new ArrayList<>();
    private List<Cliente> listaCliente = new ArrayList<>();
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
    public void addCliente(Cliente cliente){
        listaCliente.add(cliente);
    }

    public void removeCliente(Cliente cliente){
        listaCliente.remove(cliente);
    }

    public Double total(){
        double somaProdutos = 0;
        for(int i = 0; i <= listaPedido.size(); i++){
            somaProdutos += listaPedido.get(i).subTotal();
        }
        return somaProdutos;
    }

        //criar toString

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
