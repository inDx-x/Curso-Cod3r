package ArraysCollections.Arrays;

public class ForEach {
    static void main() {

        // Forma de percorrer um array sem ser necessário a utilização de uma variável "i", por exemplo.

        double[] notas = {9.9, 8.7, 7.2, 9.5};

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        System.out.println();

        for(double nota: notas) {
            System.out.print(nota + " ");
        }
    }

}
