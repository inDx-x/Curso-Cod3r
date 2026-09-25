package EstruturasDeControle;

import java.util.Scanner;

public class AnoBissexto {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano desejado: ");
        int ano = Integer.parseInt(scanner.nextLine().trim());

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

            // Forma de resolver o exercício usando a própria API.
            //    int ano = Year.now().getValue();
            //
            //    if (Year.isLeap(ano)) {
            //        System.out.println(ano + " é um ano bissexto.");
            //    } else {
            //        System.out.println(ano + " não é um ano bissexto.");

        }
    }


