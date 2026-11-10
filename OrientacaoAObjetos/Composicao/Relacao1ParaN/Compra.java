package OrientacaoAObjetos.Composicao.Relacao1ParaN;

import java.util.ArrayList;

public class Compra {

    String nomeCliente; // Em um projeto real, aqui se usaria um novo objeto ao invés de uma string.
    ArrayList<Produto> produtos = new ArrayList<>();

    // Este metodo se cria uma relacao bidirecional, relacionando produto com compra em ambas as direções.

    void adicionarProduto(String nome, int quantidade, double preco) {
        this.adicionarProduto(new Produto(nome, quantidade, preco));
    }

    void adicionarProduto(Produto produto) {
        produtos.add(produto);
        produto.compra = this;
    }

    double getValorTotal() {
        double total = 0;

        for(Produto item : produtos) {
           total =+ item.quantidade * item.preco;
        }

        return total;
    }
}
