package ClassesMetodos.ValorNulo;

import ClassesMetodos.Data.Data;

public class ValorNulo {
    static void main() {

        String s1 = ""; // String vazia é diferente de string "null", este objeto foi criado em memória, então pode ser acessado/usar suas funcionalidades/metodos.
        System.out.println(s1.concat("!!!!"));

//      String s2; Essa string, ao contrário, não foi criado em memória ou inicializada, portanto, não pode ser acessada.
//      System.out.println(s2.concat("!!!"));

        String s3 = null; // Essa string foi inicializada, porém é nula, então não pode ser acessada, ou seja, não pode acessar nem atributos, nem metodos.

        if(s3 != null) {
            System.out.println(s3.concat("???"));
        }

        Data d1 = Math.random() > 0.5 ? new Data() : null;
        if(d1 != null) {
            d1.mes = 3;
            System.out.println(d1.obterData());
        }
    }
}
