package Fundamentos.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculoIMC {
    static void main() {


        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso (kg): ");
        double peso = Double.parseDouble(scanner.nextLine().trim());

        System.out.println("Digite a altura (m): ");
        double altura = Double.parseDouble(scanner.nextLine().trim());

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("O IMC da pessoa em questão é: %.2f KG/m².", imc);

        scanner.close();

    }
}
