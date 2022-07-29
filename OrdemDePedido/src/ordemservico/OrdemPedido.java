package ordemservico;

import ordemservico.enumclasse.StatusDoPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemPedido {

    private List<PedidoItem> listaPedido = new ArrayList<>();
    private Date horaCompra;
    StatusDoPedido status;

    public OrdemPedido(final Date horaCompra, final StatusDoPedido status) {
        this.horaCompra = horaCompra;
        this.status = status;
    }

    public void addItem(PedidoItem pedidoItem){
        listaPedido.add(pedidoItem);
    }

    public void removeItem(PedidoItem pedidoItem){
        listaPedido.remove(pedidoItem);
    }

    public Double total(){
        double somaProdutos = 0;
        for(int i = 0; i <= listaPedido.size(); i++){
            somaProdutos += listaPedido.get(i).subTotal();
        }
        return somaProdutos;
    }
}
