package Fundamentos.Exercicios;

import java.util.Locale;
import java.util.Scanner;


public class Celsius {
    static void main() {

        double tempFahrenheit, tempCelsius;
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        tempFahrenheit = scanner.nextInt();

        tempCelsius =  (tempFahrenheit - 32) / 1.8;

        System.out.printf("A temperatura convertida para  graus Celsius é: %.2fºC", tempCelsius);

        scanner.close();

    }
}
