import java.util.Scanner;

public class Q3 {

    /*
     * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
     * "Sao Multiplos" ou "Nao sao
     * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
     * números devem poder ser digitados em
     * ordem crescente ou decrescente
     */

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = sc.nextInt();

        System.out.println("Digite um numero novamente: ");
        int b = sc.nextInt();

        int valor1 = a % b;
        int valor2 = b % a;

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
            if (a % b == 0) {
                System.out.println("o resto é: " + valor1);
            } else if (b % a == 0) {
                System.out.println("O resto é: " + valor2);
            }

        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();

    }
}
