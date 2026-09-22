package EstruturasDeControle;

public class Continue {
    static void main() {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
                // Ao contrário do break, o continue não sai do laço totalmente.
                // Ele simplesmente interrompe a iteração atual.
            }
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5) continue;
            System.out.println(i);
        }
    }
}
