package Fundamentos;

public class TiposPrimitivos {
    static void main() {
        // Informações do funcionário

        // Tipos numéricos inteiros = por padrão é considerado int, então para números maiores, deve-se utilizar a letra L no final.
        byte yearsOnBusiness = 23;
        short numberOfFlights = 542;
        int id = 56789;
        long pointsAmmount = 3_134_845_223L;

        // Tipos numéricos reais
        float salary = 11_445.44F;
        double totalSales = 2_991_797_103.01;

        // Tipo booleano
        boolean onVacation = false;

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de empresa
        System.out.println(yearsOnBusiness * 365);

        // Numero de viagens
        System.out.println(numberOfFlights / 2);

        // Pontos por real
        System.out.println(pointsAmmount / totalSales);

        // Salario
        System.out.println(id + ": earns -> "+ salary);
        System.out.println("Vacation? " + onVacation);
    }
}
