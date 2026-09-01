package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    static void main() {

        double a = 1; // conversão implicita
        System.out.println(a);

        float b = (float) 1.12345; // conversão explicita (casting)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);
    }
}
