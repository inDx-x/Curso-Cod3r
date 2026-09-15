package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {
    static void main() {

        // Unica estrutura de controle que termina com ;
        // do {...}
        //      while();

        Scanner scanner = new Scanner(System.in);
        String resposta = "";
        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.println("Quer sair? ");
            resposta = scanner.nextLine();
        } while(!resposta.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");
        scanner.close();
;    }
}
