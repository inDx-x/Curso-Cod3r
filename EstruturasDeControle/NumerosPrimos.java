package EstruturasDeControle;

import java.util.Scanner;

public class NumerosPrimos {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(scanner.nextLine().trim());

        boolean primo = true;

        if (numero < 2) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
