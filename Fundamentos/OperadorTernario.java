package Fundamentos;

public class OperadorTernario {
    static void main() {
        double media = 3.6;

        String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado"; // O primeiro caso é o verdadeiro, o segundo é o caso falso.
        String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;

        System.out.println("O aluno está " + resultadoFinal);
    }
}
