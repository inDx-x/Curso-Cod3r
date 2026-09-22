package EstruturasDeControle;

import java.util.Scanner;

public class NumeroPar {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero  = scanner.nextInt();

        if (numero > 0 && numero < 10) {
            if (numero % 2 == 0) {
                System.out.println("O número está dentro do intervalo e é par.");
            } else {
                System.out.println("O número está dentro do intervalo desejado, mas não é par.");
            }
        } else {
            System.out.println("O número está fora do intervalo desejado.");
        }

        scanner.close();
    }
}
