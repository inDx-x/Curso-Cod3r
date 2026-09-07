package EstruturasDeControle;

public class WhileDeterminado {
    static void main() {

        // E um while determinado porque atraves do contador, sabemos quantas vezes o codigo deve ser executado.

        int contador = 1;

        while (contador <= 10) {
            System.out.printf("i = %d\n", + contador);
            contador++;
        }
    }
}