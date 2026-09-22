package EstruturasDeControle;

public class SwitchSemBreak {
    static void main() {
        String faixa = "Amarela";

        switch(faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom:":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Não sei nada, acabei de começar.");
        }
        System.out.println("Fim!");

        // Neste caso, o modelo sem o break não faria sentido, visto que o faixa branca não "saberia nada"
        // e saberia tudo ao mesmo tempo. O caso a seguir faz mais sentido para ser usado sem o break.

        int idade = 2;

        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Sabe respirar.");
        }
    }
}