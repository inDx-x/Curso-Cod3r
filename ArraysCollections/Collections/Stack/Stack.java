package ArraysCollections.Collections.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    static void main() {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Principe");
        livros.push("Dom Casmurro"); // retorna uma exceção caso não consiga adicionar o item por problemas de capacidade.
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println();

        for(String livro : livros) {
            System.out.println(livro);
        }
        System.out.println();

        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.pop()); // também lança exceção, assim como o remove.

//        livros.size();
//        livros.clear();
//        livros.contains("O Hobbit");
//        livros.isEmpty();

    }
}
