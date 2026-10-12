package ClassesMetodos.ValorVsReferencia;

public class Desafio {

    int a = 3;
    static int b = 4;

    static void main() {

        Desafio d = new Desafio(); // A variável a pertence à instância, portanto, para que possa ser acessada, deve-se primeiro "criar" uma instância.
        System.out.println(d.a);

        System.out.println(b); // Transformar a variável de instancia em static também possibilita seu acesso, mesmo sem a criação de uma instância.
    }

}

