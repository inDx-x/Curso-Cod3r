package ClassesMetodos.Produto;

public class Produto {

    String nome;
    double preco;
    double desconto;

    // Caso você adicione "void" na frente de um construtor, ele passa a ser um metodo como qualquer outro.

    Produto() {
    }

    Produto(String nomeInicial, double precoInicial, double descontInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double DescontoDoGerente) {
        return preco * (1 - (desconto + DescontoDoGerente));
    }
}
