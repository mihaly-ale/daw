package tema4_4;

import java.util.Scanner;

public class UT02_T04_04_E05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        String numero = sc.nextLine();

        if (esCapicua(numero)) {
            System.out.println("Es capicúa.");
        } else {
            System.out.println("No es capicúa.");
        }

        sc.close();
    }

    public static boolean esCapicua(String s) {
        // Caso base
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        // Si los extremos son distintos
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // Paso recursivo: comprobar la subcadena sin extremos
        return esCapicua(s.substring(1, s.length() - 1)); // substring devuelva un String nuevo, pero no acmbia el original
        //1. 123454321
        //2. 234532 ...
    }
}
