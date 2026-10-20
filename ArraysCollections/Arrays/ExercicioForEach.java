package ArraysCollections.Arrays;

import java.util.Arrays;

public class ExercicioForEach {
    static void main() {

        double[] notasAlunoA = new double[3];

        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);
        // System.out.println(notasAlunoA[4]); (Gera um erro, visto que tenta acessar um elemento que está fora dos limites do array.

        double totalAlunoA = 0;

        for (double nota : notasAlunoA) {
            totalAlunoA += nota;
        }

        System.out.println("A média do aluno é: " + totalAlunoA / notasAlunoA.length);

        double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};

        double totalAlunoB = 0;

        for (double nota : notasAlunoB) {
            totalAlunoB += nota;
        }

        System.out.println("A média do aluno é: " + totalAlunoB / notasAlunoB.length);
    }
}

