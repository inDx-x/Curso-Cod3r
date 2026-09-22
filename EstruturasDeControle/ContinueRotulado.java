package EstruturasDeControle;

public class ContinueRotulado {
    static void main() {

        externo: for (int i = 0; i < 3; i++) {
            interno: for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    continue externo;
                    // Funciona da mesma forma do break, mas remove somente daquela iteração.
                }
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim.");
    }
}
