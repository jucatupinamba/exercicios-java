package programa;

import ordemservico.Cliente;
import ordemservico.OrdemPedido;
import ordemservico.PedidoItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {                 //debugar e corrigir
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat simple = new SimpleDateFormat("DD/MM/YYYY");
        OrdemPedido ordemPedido = new OrdemPedido();

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Data de nascimento: (dd/mm/AAAA)");
        try { Date data = simple.parse(scan.next());
        Cliente cliente = new Cliente(nome, email, data); }

        catch(ParseException e) {
            System.out.println("Os dados inseridos são divergentes do solicitado");
            scan.close();
        }

        System.out.println("Quantos itens deseja cadastrar: ");
        int totalItens = scan.nextInt();
        for(int i = 0; i < totalItens; i++){
            System.out.println("Digite os dados do " + (i + 1) + "° produto:");
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = scan.nextLine();
            scan.nextLine();
            System.out.print("Digite a quantidade do produto: ");
            int quantidade = scan.nextInt();
            System.out.print("Digite o preço do produto: ");
            double preco = scan.nextDouble();
            PedidoItem pedidoItem = new PedidoItem(nomeProduto, quantidade, preco);
            ordemPedido.addItem(pedidoItem);
        }

        System.out.println(ordemPedido.toString());  //investigando erro, saida do cliente null
                                                    //correção no método subtotal e total

    }
}
