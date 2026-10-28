package ArraysCollections.Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetOrganized {
    static void main() {

//      Set<String> conjuntoAprovados = new HashSet<>();
//      Set<String> conjuntoAprovados = new TreeSet<>(); respeita a ordem de inclusão dos dados no conjunto.
        SortedSet<String> conjuntoAprovados = new TreeSet<>(); // Ordena os itens do conjunto.
        conjuntoAprovados.add("Fernanda");
        conjuntoAprovados.add("Luca");
        conjuntoAprovados.add("Murilo");
        conjuntoAprovados.add("Pedro");

        for (String candidato : conjuntoAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(36);
        nums.add(47);

        for(int n : nums) {
            System.out.println(n);
        }
    }
}

