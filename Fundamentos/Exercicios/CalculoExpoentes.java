package Fundamentos.Exercicios;

import java.util.Scanner;

public class CalculoExpoentes {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor númerico: ");
        double valor = Double.parseDouble(scanner.nextLine().trim().replace(",", "."));

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.printf("O valor digitado, elevado ao quadrado, é: %.2f.\n", quadrado);
        System.out.printf("O valor digitado, elevado ao cubo, é: %.2f.", cubo);


    }
}
