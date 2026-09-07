package Fundamentos;

import java.util.Scanner;

public class DesafioModulo {
    static void main() {

        // O dessafio consiste em criar uma calculadora sem utilizar estruturas de controle.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora:");
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite a operação desejada (+, -, *, /, %): ");
        String operacao = scanner.next();

        System.out.println();
        double resultado = "+".equals(operacao) ? numero1 + numero2 : 0;
        resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
        resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;
        resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
        resultado = "%".equals(operacao) ? numero1 % numero2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", numero1, operacao, numero2, resultado);

    scanner.close();
    }
}
