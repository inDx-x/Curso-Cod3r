package ClassesMetodos.Data;

public class DataTeste {
    static void main() {

        Data data1 = new Data();
        data1.dia = 10;
        data1.mes = 01;
        data1.ano = 1994;

        Data data2 = new Data();
        data2.dia = 11;
        data2.mes = 07;
        data2.ano = 1997;

        System.out.printf("A primeira data digitada é: %d/%d/%d.\n", data1.dia, data1.mes, data1.ano);
        System.out.printf("A segunda data digitada é: %d/%d/%d.", data2.dia, data2.mes, data2.ano);
    }
}
