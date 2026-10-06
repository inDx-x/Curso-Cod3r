package ClassesMetodos.AreaCircunferencia;


public class AreaCircunferenciaTeste {
    static void main() {

        AreaCircunferencia a1 = new AreaCircunferencia(10);
        // a1.PI = 10;
        System.out.println(a1.area());

        System.out.println(AreaCircunferencia.area(5));
    }
}
