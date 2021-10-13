package exerciciocinco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        ContaCorrente p1 = new ContaCorrente();
        System.out.println("Insira o número da conta: ");
        p1.setNumConta(input.nextInt());
        input.nextLine();
        System.out.println("Insira o nome do proprietário: ");
        p1.setDono(input.nextLine());
        System.out.println("tupaosd conta");
        p1.abrirConta(input.nextLine());

        ContaCorrente p2 = new ContaCorrente();
        System.out.println("Insira o número da conta: ");
        p2.setNumConta(input.nextInt());
        input.nextLine();
        System.out.println("Insira o nome do proprietário: ");
        p2.setDono(input.nextLine());
        System.out.println("Digite o tipo da conta: ");
        p2.abrirConta(input.nextLine());

        System.out.println("Insira o quanto quer depositar na conta de " + p1.getDono());
        p1.depositar(input.nextInt());
        input.nextLine();
        p1.estadoConta();

        System.out.println("Insira o quanto quer depositar na conta de " + p2.getDono());
        p2.depositar(input.nextInt());
        input.nextLine();
        p2.estadoConta();
    }
}
