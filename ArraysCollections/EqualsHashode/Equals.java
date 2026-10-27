package ArraysCollections.EqualsHashode;

public class Equals {
    static void main() {

        Usuario u1 = new Usuario();
        u1.nome = "Murilo Freitas";
        u1.email = "murilo@abc.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Murilo Freitas";
        u2.email = "murilo@abc.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

    }
}
