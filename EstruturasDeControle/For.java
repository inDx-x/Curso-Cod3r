package EstruturasDeControle;

public class For {
    static void main() {

//        int contador = 1;
//
//        while (contador <= 10) {
//            System.out.printf("i = %d\n", + contador);
//            contador++;
//        }

        for (int i = 0; i <= 10; i++) {
            System.out.printf("i = %d\n", + i);
        }

        // Basicamente uma estrutura while.
        int x = 2;
        for (; x < 10; ) {
            System.out.println("x = " + x);
            x++;
        }

        // Laco infinito; isso tambem ocorre caso coloque true como parametro.
        for (;;) {
            System.out.println("Fim!");
        }
    }
}
