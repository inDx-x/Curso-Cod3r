package ArraysCollections.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    static void main() {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo");
        usuarios.put(2, "Rafaela");
        usuarios.put(3, "Fernanda");
        System.out.println("-----");

        // O comando put, além de adicionar, substitui o valor caso ele já exista.

        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(3, "Gui"));
        System.out.println("-----");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println("-----");

        System.out.println(usuarios.keySet()); // mostra as "keys" cadastradas no mapa.
        System.out.println("-----");

        System.out.println(usuarios.values()); // mostra os valores armazenados no mapa.
        System.out.println("-----");

        System.out.println(usuarios.entrySet()); // mostra as keys e os respectivos valores atrelados à elas.
        System.out.println("-----");

        System.out.println(usuarios.containsKey(2)); // verifica se determianda key está presente no mapa.
        System.out.println("-----");

        System.out.println(usuarios.containsValue("Fernanda"));  // verifica se o valor encontra-se no mapa.
        System.out.println("-----");

        System.out.println(usuarios.get(2)); // busca o elemento determinado no mapa, através da key.
        System.out.println("-----");

        // Primeiro modo de percorrer o mapa, através das chaves.

        for(int chave : usuarios.keySet()) {
            System.out.println(chave);
        }
        System.out.println("-----");

        // Segunda forma de percorrer a chave, agora através dos valores.

        for(String valor : usuarios.values()) {
            System.out.println(valor);
        }
        System.out.println("-----");

        // Terceira forma, utilizando o Entry

        for(Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + " -> ");
            System.out.println(registro.getValue());
        }



    }
}
