package ArraysCollections.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetBaguncado {
    static void main() {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add("Teste"); // String (vale lembrar que o set não aceita repetição, então altera o tamanho)
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Character

        System.out.println("O tamanho do conjunto é: " + conjunto.size());
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(false));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet(); // Este formato tambem e valido em Java.

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums); // Implementa a exibicao em String automaticamente.
        System.out.println(conjunto);

        // conjunto.addAll(nums); // Uniao entre dois conjuntos
        conjunto.retainAll(nums); // So mantem o que 'seria comum a ambos os conjuntos'.
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);



    }
}
