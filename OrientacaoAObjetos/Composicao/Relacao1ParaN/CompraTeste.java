package OrientacaoAObjetos.Composicao.Relacao1ParaN;

public class CompraTeste {
    static void main() {

        // Aqui, existe uma relação 1 para n, onde cada compra possui diversos produtos.

        Compra compra1 = new Compra();
        compra1.nomeCliente = "Murilo";

        compra1.adicionarProduto("Caneta", 20, 1.99);
        compra1.adicionarProduto(new Produto("Borracha", 5, 3.89));
        compra1.produtos.add(new Produto("Caderno", 2, 30.0));

        System.out.println(compra1.produtos.size());
        System.out.println(compra1.getValorTotal());

        // Somente para relações bidirecionais:

        double total = compra1.produtos.get(0).compra.produtos.get(1).compra.getValorTotal();
        System.out.println("O total é: " + total);
    }
}
