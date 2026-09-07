package EstruturasDeControle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class If {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informa e media: ");
        double media = scanner.nextDouble();

        if(media <= 10 && media >= 7.0) {
            System.out.println("Aluno aprovado!");
        }

        if(media < 7 && media >= 5) {
            System.out.println("Aluno em recuperação.");
        }

        if (media < 4.5 && media >= 0) {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}
