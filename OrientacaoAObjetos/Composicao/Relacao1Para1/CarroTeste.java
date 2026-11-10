package OrientacaoAObjetos.Composicao.Relacao1Para1;

public class CarroTeste {
    static void main() {

        // Relação unidirecional, de um para um, um carro tem um motor e o motor tem um carro.
        Carro carro1 = new Carro();
        System.out.println(carro1.estaLigado());

        carro1.ligar();
        System.out.println(carro1.estaLigado());

        System.out.println(carro1.motor.giros());

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        System.out.println(carro1.motor.giros());

        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();

        System.out.println(carro1.motor.giros());

        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();

        System.out.println(carro1.motor.giros());

        // Faltou encapsulamento
        // carro1.motor.fatorInjecao = -30;
    }
}
