package EstruturasDeControle;

import java.sql.SQLOutput;

public class DesafioIf {
    static void main() {

        double nota = 1.3;

       // Neste caso, não usar ; em estruturas de controle, a estrutura condicional executa o ;, então o resto do código ainda é executado.
        if (nota >= 9.0); {
            System.out.println("Quadro de honra!");
            System.out.println("Você é fera!");
        }
    }
}
