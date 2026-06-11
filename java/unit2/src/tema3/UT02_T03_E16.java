package tema3;

import java.util.Scanner;

public class UT02_T03_E16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir número entero al usuario
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        // Convertir el número a diferentes sistemas de numeración
        String binario = Integer.toBinaryString(numero);
        String octal = Integer.toOctalString(numero);
        String hexadecimal = Integer.toHexString(numero).toUpperCase();

        // Mostrar resultados
        System.out.println("\nRepresentaciones del número " + numero + ":");
        System.out.println("Binario: " + binario);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }
}

