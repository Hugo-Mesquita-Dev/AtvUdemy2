import java.util.Scanner;

public class Q5 {

    /*
     * Com base na tabela abaixo, escreva um programa que leia o código de um item e
     * a quantidade deste item. A
     * seguir, calcule e mostre o valor da conta a pagar.
     */

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIgite o código do produto: ");
        int codigo = sc.nextInt();

        System.out.println("DIgite a quantidade: ");
        int quantidade = sc.nextInt();

        double total;

        if (codigo == 1) {
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else {
            total = quantidade * 1.50;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}
