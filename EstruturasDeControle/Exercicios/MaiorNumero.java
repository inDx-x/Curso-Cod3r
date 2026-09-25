package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class MaiorNumero {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        double maiorNumero = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um número: ");
            double numero = scanner.nextDouble();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.printf("O maior número digitado é: %.2f\n", maiorNumero);

        scanner.close();
    }
}
