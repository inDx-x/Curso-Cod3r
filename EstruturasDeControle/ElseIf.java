package EstruturasDeControle;

import java.util.Scanner;

public class ElseIf {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = scanner.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota invalida.");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A.");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B.");
        } else if (nota >= 4.1) {
            System.out.println("Conceito C.");
        } else if (nota >= 3.1) {
            System.out.println("Conceito D.");
        } else {
            System.out.println("Conceito E.");
        }

        scanner.close();
    }
}
