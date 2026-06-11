package $tarea_0512;

import java.util.Random;
import java.util.Scanner;

public class tarea_Javi {
    
    public static Scanner sc = new Scanner(System.in);

    public static void baja(String nombre, String apellido) {
        Random valor1 = new Random();
        final int MIN_LENGTH = 3;
        
        String prefijoNombre = nombre.substring(0, MIN_LENGTH);
        String prefijoApellido = apellido.substring(0, MIN_LENGTH);
        
        System.out.print(prefijoNombre + prefijoApellido);
        
        // System.out.print(nombre.charAt(0));System.out.print(nombre.charAt(1));System.out.print(nombre.charAt(2));
        // System.out.print(apellido.charAt(0));System.out.print(apellido.charAt(1));System.out.print(apellido.charAt(2));
        System.out.print(valor1.nextInt(10, 99));
    } // baja
    
    public static void media(String nombre, String apellido) {
        String caracteres = "!@#$%^&";
        Random aleatorio = new Random();
        
        System.out.print(caracteres.charAt(aleatorio.nextInt(0, caracteres.length())));
        System.out.print("");
    } // media
    
    public static void alta(String nombre, String apellido) {
        String caracteres = "!@#$%^&";
        Random aleatorio = new Random();
        String mayusculas = "QWERTYUIOPASDFGHJKLÑZXCVBNM!@#$%^&";
        
        System.out.print("Longitud de la contraseña entre 10 y 20");
        int longitud = sc.nextInt();
        int longitud1 = longitud - 10;
        
        System.out.print("Su contraseña generada es: ");
        baja(nombre, apellido);
        media(nombre, apellido);
        
        for (int m = 0; m < longitud1; m++) {
        	System.out.println("\nhere?");
            System.out.print(mayusculas.charAt(aleatorio.nextInt(0, caracteres.length()))); // esto solo las mayusculas
            // cojo la mayuscula que esta en la posición entre 0 y la longitud de caracteeres(!@#$%^&), ergo entre 0 y 7 => solo vas hasta la posición 6 (porque no hay <=)
            // necesitas comprobar si longitud1 es par => mayuscula, o impar => un caracter de caracteres
        } // for m
        
        // Aqui falta la concatenación de la contraseña + guion bajo + (random caracter + mayuscula) veces como longitud-10 (longitud1)
    } // alta
    
    public static void main(String[] args) {
        String nombre = (""), apellido = ("");
        int contraseña = 0;
        
        System.out.print("Nombre: " + nombre);
        nombre = sc.next();
        System.out.print("Apellido: " + apellido);
        apellido = sc.next();
        System.out.println("Seleccione el nivel de dificultad de la contraseña: \n1. Baja\n2. Media \n3. Alta");
        contraseña = sc.nextInt();
        
        switch (contraseña) {
            case 1:
                System.out.print("Su contraseña generada es: ");
                baja(nombre, apellido);
                break;
            case 2:
                System.out.print("Su contraseña generada es: ");
                baja(nombre, apellido);
                media(nombre, apellido);
                break;
            case 3:
                alta(nombre, apellido);
                break;
        } // Switch
        
        sc.close();
    } // Main
} // E15