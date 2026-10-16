package ArraysCollections.Arrays;

public class ArraysTheory {
    static void main() {

        // Arrays são estáticos: tem tamanho fixo, mas isso não significa que você não pode "transportar" um array para um novo array maior;
        // São homogêneos: todos os dados do array são do mesmo tipo);
        // Estrutura indexada: o acesso a cada um dos elementos é feito através de um número inteiro (posição), um array de 6 posições vai do índice 0 ao 5.
        // Array também é um objeto, ou seja, tem comportamentos e atributos associados a ele.

        // Como criar um array:

        double[] a = new double[6];

        // Adicionando elementos individualmente ao array:

        a[2] = 10;
        a[0] = 9.2;

        System.out.println(a[2]);

        // Neste caso, a notação a. não funcionaria, porque o elemento dentro de determinada posição é um elemento de tipo primitivo double,
        // mas caso os elementos contidos no array fossem do tipo Objeto, a notação funcionaria normalmente.

        // Um array multidimensional em Java (equivalente a uma matriz):

        double[][] b = new double[2][2];


    }
}
