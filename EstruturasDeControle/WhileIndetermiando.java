package EstruturasDeControle;

import java.util.Scanner;

public class WhileIndetermiando {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase (ou 'sair' para encerrar): ");
        String frase = scanner.nextLine();

        while(!frase.equalsIgnoreCase("sair")) {
            System.out.println("Você digitou: " + frase);

            System.out.println("Digite uma frase (ou 'sair' para encerrar): ");
            frase = scanner.nextLine();
        }
        System.out.println("O programa foi encerrado!");
        scanner.close();
    }
}
