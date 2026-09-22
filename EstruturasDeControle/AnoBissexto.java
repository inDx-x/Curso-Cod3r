package EstruturasDeControle;

import java.util.Scanner;

public class AnoBissexto {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano desejado: ");
        int anoAtual = Integer.parseInt(scanner.nextLine().trim());

        boolean bissexto = (anoAtual % 4 == 0 && anoAtual % 100 != 0) || (anoAtual % 400 == 0);

        if (bissexto) {
            System.out.println(anoAtual + " é um ano bissexto.");
        } else {
            System.out.println(anoAtual + " não é um ano bissexto.");
        }

            // Forma de resolver o exercício usando a própria API.
            //    int anoAtual = Year.now().getValue();
            //
            //    if (Year.isLeap(anoAtual)) {
            //        System.out.println(anoAtual + " é um ano bissexto.");
            //    } else {
            //        System.out.println(anoAtual + " não é um ano bissexto.");

        }
    }


