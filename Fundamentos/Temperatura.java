package Fundamentos;

public class Temperatura {
   static void main() {
       final double FATOR = 5.0 / 9.0;
       final int AJUSTE = 32;
       double fahrenheit = 86;
       double celsius = (fahrenheit - AJUSTE) * FATOR;

       System.out.println("O resultado é " + celsius + "°C.");

    }
}
