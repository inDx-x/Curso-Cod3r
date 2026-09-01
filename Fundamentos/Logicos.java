package Fundamentos;

public class Logicos {
    static void main() {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        System.out.println();
        System.out.println("Tabela Verdade E (AND):");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println();
        System.out.println("Tabela Verdade Ou (OR):");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println();
        System.out.println("Tabela Verdade Ou Exclusivo (XOR):");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println();
        System.out.println("Tabela Verdade NOT:");
        System.out.println(!true);
        System.out.println(!false);
    }
}
