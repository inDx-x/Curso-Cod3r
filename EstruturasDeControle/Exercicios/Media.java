package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Media {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double soma = nota1 + nota2;
        double media = soma / 2;

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media < 7 && media > 4) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

    scanner.close();
    }
}
