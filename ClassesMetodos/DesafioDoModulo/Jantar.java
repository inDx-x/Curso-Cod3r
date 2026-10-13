package ClassesMetodos.DesafioDoModulo;

import java.util.Locale;

public class Jantar {
    static void main() {

        Locale.setDefault(Locale.US);

        Pessoa p1 = new Pessoa("Murilo", 100.0);

        Comida c1 = new Comida("Arroz", 0.300);
        Comida c2 = new Comida("Feijão", 0.200);

        System.out.println(p1.apresentar());

        p1.comer(c1);
        p1.comer(c2);

        System.out.println(p1.apresentar());
    }
}
