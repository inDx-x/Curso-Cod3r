package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class SomaPositivos {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;
            System.out.printf("Soma até o momento: %d\n", soma);
            System.out.println("\nDigite o próximo número: ");
            numero = scanner.nextInt();
        }

        System.out.println("Programa encerrado.");

        scanner.close();
    }
}

