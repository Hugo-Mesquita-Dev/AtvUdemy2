import java.util.Scanner;

public class Q1 {
    /*
     * Fazer um programa para ler um número inteiro,
     * e depois dizer se este número é negativo ou não
     */

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero Positivo ou Negativo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println(numero + " -> Este numero é negativo ");
        } else if (numero >= 0) {
            System.out.println(numero + " -> Este numero é positvo ");
        }

        sc.close();
    }
}
