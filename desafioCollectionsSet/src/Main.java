import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Integer> listaIdade = new TreeSet<>();

        System.out.println("How many students for course A?");
        int courseA = scan.nextInt();
        for (int i = 0; i < courseA; i++){
            System.out.print("Age: ");
            listaIdade.add(scan.nextInt());
        }

        System.out.println("How many students for course B?");
        int courseB = scan.nextInt();
        for (int i = 0; i < courseB; i++){
            System.out.print("Age: ");
            listaIdade.add(scan.nextInt());
        }

        System.out.println("How many students for course C?");
        int courseC = scan.nextInt();
        for (int i = 0; i < courseC; i++){
            System.out.print("Age: ");
            listaIdade.add(scan.nextInt());
        }

        System.out.println("Total students: " + listaIdade.size());

    }
}