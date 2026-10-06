package ClassesMetodos.Data;

public class Data {

    int dia, mes, ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaBase, int mesBase, int anoBase) {
        dia = diaBase;
        mes = mesBase;
        ano = anoBase;
    }

    String obterData() {
        return String.format("%d/%d/%d", dia, mes, ano);

        // Esse metodo é o preferencial, portanto buscar sempre utilizar o metodo com o return.
        // Visto que ele ira funcionar em qualquer ambiente/aplicação que seja necessário, não só em um ambiente em terminal.
    }

    void imprimirDataFormatada() {
        System.out.printf("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada2() {
        System.out.println(obterData());
    }


}
