package EstruturasDeControle;

import javax.swing.*;

public class IfElse {
    static void main() {

        String valor = JOptionPane.showInputDialog("Informe o número: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("O número informado é par.");
        } else {
            System.out.println("O número informado é impar.");
        }
    }
}
