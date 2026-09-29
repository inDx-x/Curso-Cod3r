package Fundamentos.Exercicios;

import java.util.Scanner;

public class Fahrenheit {
    static void main() {

        double tempFahrenheit, tempCelsius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        tempCelsius = scanner.nextInt();

        tempFahrenheit = (tempCelsius * 1.8) + 32;

        System.out.printf("A temperatura convertida para  graus Farenheit é: %.2fºF", tempFahrenheit);

        scanner.close();
    }
}
