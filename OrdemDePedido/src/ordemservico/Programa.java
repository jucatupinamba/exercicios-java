package ordemservico;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Data de nascimento: ");
        String data = scan.nextLine();
        // Cliente cliente = new Cliente(nome, email, data);  //captar dados Data
    }
}
