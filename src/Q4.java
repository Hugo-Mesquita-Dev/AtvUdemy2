import java.util.Scanner;

public class Q4 {

    /*
     * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
     * jogo, sabendo que o mesmo pode
     * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
     * máxima de 24 horas
     */

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIgite o  horario do inicio do jogo: ");
        int horaInicio = sc.nextInt();

        System.out.println("DIgite o  horario do fim do jogo: ");
        int horaFim = sc.nextInt();

        int duração;
        if (horaInicio < horaFim) {
            duração = horaFim - horaInicio;
        } else {
            duração = 24 - horaInicio + horaFim;
        }

        System.out.println("O JOGO DUROU " + duração + " HORAS");

        sc.close();
    }
}
