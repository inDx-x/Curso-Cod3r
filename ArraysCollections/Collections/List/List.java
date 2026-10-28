package ArraysCollections.Collections.List;

import java.util.ArrayList;

public class List {

    static void main() {

        ArrayList<UsuarioList> lista = new ArrayList<>();

        UsuarioList u1 = new UsuarioList("Murilo");
        lista.add(u1);
        lista.add(new UsuarioList("Carlos"));
        lista.add(new UsuarioList("Fernanda"));
        lista.add(new UsuarioList("Gustavo"));
        lista.add(new UsuarioList("Cristiane"));
        lista.add(new UsuarioList("Marco"));

        System.out.println(lista.get(2)); // Aqui o sistema retorna o toString, visto que pedi para imprimir o usuário no índice '2'.
        System.out.println(lista.get(2).name); // Imprime somente o nome, visto que chamei diretamente o atributo.
        System.out.println();

        System.out.println(">>>" + lista.remove(3)); // A remoção através do ID, vai mostrar a mensagem do toString referente ao elemento removido.
        System.out.println(lista.remove(new UsuarioList("Carlos"))); // A remoção "explicita", através do nome e equals/HashCode, retorna um valor booleano.
        System.out.println();

        System.out.println("Tem o elemento? " + lista.contains(new UsuarioList("Murilo")));
        System.out.println();

        for(UsuarioList u : lista) {
            System.out.println(u.name);
        }
    }
}
