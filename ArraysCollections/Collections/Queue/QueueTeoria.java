package ArraysCollections.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTeoria {
    static void main() {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); // Aqui, caso você tente adicionar um item à uma fila com limite de tamanho, e eles excederem tal limite, o add lança uma exceção.
        fila.add("Gui");
        fila.offer("Bia"); // Já o offer, retorna false caso tente adicionar um item que extrapola o limite da fila.
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");

        // Mesmo caso de antes, ambos os comandos tem a mesma função (obter o proximo elemento da fila sem remover),
        // mas o peek retorna null quando a fila está vazia, já o element retorna uma exceção.

        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());

        System.out.println(fila.poll()); // retorna o primeiro elemento da fila, já removendo este elemento. (caso a fila esteja vazia, retorna null).
        System.out.println(fila.remove()); // caso você use o remove com a fila vazia, ele lança uma exceção.

        // fila.size(); para saber o tamanho da fila
        // fila.clear(); para limpar a fila
        // fila.isEmpty(); para saber se a fila está ou não vazia
        // fila.contains(); para saber se determinado elemento está contido na fila


    }
}
