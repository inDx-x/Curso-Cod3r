package Fundamentos;

import java.util.Scanner;

import static java.lang.System.*;

public class StringEquals {
    static void main() {
        out.println("2" == "2");

        String s = new String("2");
        out.println("2" == s);
        out.println("2".equals(s));

        Scanner scanner = new Scanner(in);

        String s2 = scanner.next();
        out.println("2" == s2);
        out.println("2".equals(s2.trim()));

        scanner.close();
    }
}
