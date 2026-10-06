package ClassesMetodos.AreaCircunferencia;

public class AreaCircunferencia {

    double raio;
    static final double PI = 3.1415;

    // Os modificadores devem ficar sempre à esquerda do tipo. O tipo fica sempre ao lado do nome da variável/constante.

    // Por convenção, os nomes de variaveis são descritos em letras maiusculas.

    AreaCircunferencia(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}

