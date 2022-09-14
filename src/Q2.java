import java.util.Scanner;

public class Q2 {

    /*
     * Fazer um programa para ler um número inteiro e
     * dizer se este número é par ou ímpar
     */

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero % 2 != 0) {
            System.out.println(numero + " -> IMPAR ");
        } else if (numero % 2 == 0) {
            System.out.println(numero + " -> PAR ");
        }
        sc.close();
    }
}
