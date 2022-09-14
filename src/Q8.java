import java.util.Locale;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua Renda mensal: ");
        double renda = sc.nextDouble();

        double impostoRenda;

        if (renda <= 2000.0) {
            impostoRenda = 0.0;
        } else if (renda <= 3000.0) {
            impostoRenda = (renda - 2000.0) * 0.08;
        } else if (renda <= 4500.0) {
            impostoRenda = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            impostoRenda = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (impostoRenda == 0.0) {
            System.out.println(" Isento");
        } else {
            System.out.printf("O valor do imposto é R$ %.2f%n", impostoRenda);
        }

        sc.close();
    }
}
