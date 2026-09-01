package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    static void main() {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor de salário: ");
        String salario1 = scanner.nextLine().trim().replace(",", ".");
        System.out.println("Digite o segundo valor de salário: ");
        String salario2 = scanner.nextLine().trim().replace(",", ".");
        System.out.println("Digite o terceiro valor de salário: ");
        String salario3 = scanner.nextLine().trim().replace(",", ".");

        double numero1 = Double.parseDouble(salario1);
        double numero2 = Double.parseDouble(salario2);
        double numero3 = Double.parseDouble(salario3);

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.printf("A média dos salários dos últimos 3 mesês foi de: R$%.2f.", media);


    }
}
