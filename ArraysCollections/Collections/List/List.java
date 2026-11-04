package ArraysCollections.Collections.List;

import java.util.ArrayList;

public class List {

    static void main() {

        ArrayList<Usuario2> lista = new ArrayList<>();

        Usuario2 u1 = new Usuario2("Murilo");
        lista.add(u1);
        lista.add(new Usuario2("Carlos"));
        lista.add(new Usuario2("Fernanda"));
        lista.add(new Usuario2("Gustavo"));
        lista.add(new Usuario2("Cristiane"));
        lista.add(new Usuario2("Marco"));

        System.out.println(lista.get(2)); // Aqui o sistema retorna o toString, visto que pedi para imprimir o usuário no índice '2'.
        System.out.println(lista.get(2).name); // Imprime somente o nome, visto que chamei diretamente o atributo.
        System.out.println();

        System.out.println(">>>" + lista.remove(3)); // A remoção através do ID, vai mostrar a mensagem do toString referente ao elemento removido.
        System.out.println(lista.remove(new Usuario2("Carlos"))); // A remoção "explicita", através do nome e equals/HashCode, retorna um valor booleano.
        System.out.println();

        System.out.println("Tem o elemento? " + lista.contains(new Usuario2("Murilo")));
        System.out.println();

        for(Usuario2 u : lista) {
            System.out.println(u.name);
        }
    }
}
