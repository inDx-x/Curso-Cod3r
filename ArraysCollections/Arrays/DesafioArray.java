package ArraysCollections.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas você quer informar? ");
        int numeroNotas = scanner.nextInt();

        double[] notas = new double[numeroNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota.");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0.0;

        for(double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.printf("A média do aluno é: %.2f.", media);

    scanner.close();
    }
}
