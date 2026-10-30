package ArraysCollections.Arrays.Matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdDeAlunos = scanner.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdDeNotas = scanner.nextInt();

        double[][] notasDaTurma = new double[qtdDeAlunos][qtdDeNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = scanner.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        System.out.println();
        for(double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        System.out.println();
        double media = total / (qtdDeAlunos * qtdDeNotas);
        System.out.println("A média da turma é " + media);

        scanner.close();
        }

    }

