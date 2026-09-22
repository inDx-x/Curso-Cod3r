package EstruturasDeControle;

public class BreakRotulado {
    static void main() {

        externo: for (int i = 0; i < 3; i++) {
            interno: for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    break externo;
                    // Este break tira a rotação do for mais interno.
                    // Para que ele saia da rotação do mais externo, é necessário acrescentar um rótulo.
                }
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim.");
    }
}
