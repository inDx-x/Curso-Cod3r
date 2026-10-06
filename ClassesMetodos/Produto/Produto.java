package ClassesMetodos.Produto;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    // Caso você adicione "void" na frente de um construtor, ele passa a ser um metodo como qualquer outro.

    Produto() {
    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double DescontoDoGerente) {
        return preco * (1 - (desconto + DescontoDoGerente));
    }
}
