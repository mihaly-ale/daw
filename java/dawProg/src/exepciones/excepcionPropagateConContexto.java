package exepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class excepcionPropagateConContexto {

    // Method C: origin of the exception
    static void c() throws FileNotFoundException {
        System.out.println("Entering C");

        try {
            FileInputStream fis = new FileInputStream("file_c.txt");
        } catch (FileNotFoundException e) {
            // Add context and rethrow
            throw new FileNotFoundException("Error in C: file_c.txt not found");
        }

        System.out.println("Leaving C");
    }

    // Method B: adds context and rethrows
    static void b() throws FileNotFoundException {
        System.out.println("Entering B");

        try {
            c();
        } catch (FileNotFoundException e) {
            // Add context and rethrow
            throw new FileNotFoundException("Error in B: while calling C → " + e.getMessage());
        }

        System.out.println("Leaving B");
    }

    // Method A: adds context and rethrows
    static void a() throws FileNotFoundException {
        System.out.println("Entering A");

        try {
            b();
        } catch (FileNotFoundException e) {
            // Add context and rethrow
            throw new FileNotFoundException("Error in A: while calling B → " + e.getMessage());
        }

        System.out.println("Leaving A");
    }

    // MAIN: final handler
    public static void main(String[] args) {
        try {
            a();
        } catch (FileNotFoundException e) {
            System.out.println("MAIN caught the exception!");
            e.printStackTrace();
        }
    }
}