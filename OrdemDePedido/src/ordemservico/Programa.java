package ordemservico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat simple = new SimpleDateFormat("DD/MM/YYYY");
        OrdemPedido ordemPedido = new OrdemPedido();

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Data de nascimento: ");
        Date data = simple.parse(scan.next());
        Cliente cliente = new Cliente(nome, email, data);
        ordemPedido.addCliente(cliente);                      //Espaço para cadastro de clientes, para ser ampliado

        System.out.println("Quantos itens deseja cadastrar: ");
        int totalItens = scan.nextInt();
        for(int i = 0; i < totalItens; i++){
            System.out.println("Digite os dados do " + (i + 1) + "° produto:");
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = scan.nextLine();
            System.out.print("Digite a quantidade do produto: ");
            int quantidade = scan.nextInt();
            System.out.print("Digite o preço do produto: ");
            double preco = scan.nextDouble();
            PedidoItem pedidoItem = new PedidoItem(nomeProduto, quantidade, preco);
            ordemPedido.addItem(pedidoItem);
        }

        //falta apenas a impressão dos dados
    }
}
