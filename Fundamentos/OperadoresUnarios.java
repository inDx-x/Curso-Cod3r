package Fundamentos;

public class OperadoresUnarios {
   static void main() {

       int a = 1;
       int b = 2;

       //Formas pós fixada: tem menor precedência, ou seja, só altera depois da operação.
       a++; // a = a + 1;
       a--; // a = a - 1;

       //Formas pré fixadas: os incrimentos tem maior precedência, ou seja, altera antes da operação.
       ++b; // b = b + 1;
       --b; // b = b - 1;

       System.out.println(a);
       System.out.println(b);

       System.out.println("Mini Desafio:");
       System.out.println(++a == b--);
       System.out.println(a == b);
       System.out.println(a);
       System.out.println(b);
   }
}
