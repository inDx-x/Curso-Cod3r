package ClassesMetodos.Data;

public class DataTeste {
    static void main() {

        Data data1 = new Data();

        Data data2 = new Data(10, 1, 1994);

        String dataFormatada1 = data1.obterData();

        System.out.printf("A primeira data digitada é: %s.\n", dataFormatada1);
        System.out.printf("A segunda data digitada é: %s.", data2.obterData());

        System.out.println();
        data1.imprimirDataFormatada();
        System.out.println();
        data2.imprimirDataFormatada2();
    }
}
