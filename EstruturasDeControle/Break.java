package EstruturasDeControle;

public class Break {
    static void main() {

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
                // O break basicamente interrompe o fluxo atual, ou seja, sai do laço de repetição.
            }
            System.out.println(i);
        }
        System.out.println("Fim!");
    }
}
