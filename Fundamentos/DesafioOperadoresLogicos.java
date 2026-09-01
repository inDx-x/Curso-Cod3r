package Fundamentos;

public class DesafioOperadoresLogicos {
    static void main() {
        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean tvMaior = trabalho1 && trabalho2;
        boolean tvMenor = trabalho1 ^trabalho2;
        boolean sorvete = trabalho1 || trabalho2;
        boolean saudavel = !sorvete;

        System.out.println("Comprou tv 50\"?" + tvMaior);
        System.out.println("Comprou tv 32\"?" + tvMenor);
        System.out.println("Comprou sorvete?" + sorvete);
        System.out.println("Mais saudavel?" + saudavel);

    }
}
