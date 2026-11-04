package ArraysCollections.EqualsHashode;

import ArraysCollections.Collections.List.Usuario2;

import java.util.HashSet;

public class Hash {
    static void main() {

        HashSet<Usuario2> usuarios = new HashSet<>();

        usuarios.add(new Usuario2("Pedro"));
        usuarios.add(new Usuario2("Ana"));
        usuarios.add(new Usuario2("Guilherme"));

        boolean resultado = usuarios.contains(new Usuario2("Guilherme"));
        System.out.println(resultado);

    }
}
