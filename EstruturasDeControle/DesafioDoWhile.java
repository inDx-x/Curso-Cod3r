package EstruturasDeControle;

import java.util.Scanner;

public class DesafioDoWhile {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        double nota;
        double somaNotas = 0.0;
        int numeroDeNotas = 0;

        System.out.println("Digite uma nota (ou '-1' para encerrar o programa): ");
        nota = scanner.nextDouble();

        do {
            if (nota < 0 || nota > 10) {
                System.out.println("A nota digitada é inválida, tente novamente: ");
                nota = scanner.nextDouble();
            } else {
                somaNotas += nota;
                numeroDeNotas++;
                System.out.println("Digite uma nota (ou '-1' para encerrar o programa): ");
                nota = scanner.nextDouble();
            }
        } while (nota != -1);

        double media = somaNotas / numeroDeNotas;
        System.out.println("A média dos alunos é: " + media);
        System.out.println("O número de notas digitadas é: " + numeroDeNotas);

        scanner.close();
    }
}