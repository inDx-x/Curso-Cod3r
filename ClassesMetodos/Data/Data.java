package ClassesMetodos.Data;

public class Data {

    public int dia;
    public int mes;
    public int ano;

    public Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
        // this(1, 1, 1970); esta forma também funciona, você utiliza o this para chamar o segundo construtor dentro do primeiro.
    }

    public Data(int  dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String obterData() {
        final String formato = "%d/%d/%d"; // Variável local, seu escopo de visibilidade é interno ao metodo, especificamente a partir da linha de criação, até o final do metodo.
        return String.format(formato, dia, mes, ano);

        // Esse metodo é o preferencial, portanto buscar sempre utilizar o metodo com o return.
        // Visto que ele ira funcionar em qualquer ambiente/aplicação que seja necessário, não só em um ambiente em terminal.
    }

    void imprimirDataFormatada() {
        System.out.printf("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada2() {
        System.out.println(obterData());
    }

    void imprimirDataFormatada3() {
        System.out.println(this.obterData());
    }


}
