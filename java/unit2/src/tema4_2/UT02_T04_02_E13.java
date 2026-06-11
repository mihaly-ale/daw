package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
       
        System.out.print("Teclea altura de pyramida ");       
        altura = sc.nextInt();    
        
     // hace altura
        for (int fila = 1; fila <= altura; fila++) {            
            
            int primNumDeCadaFila = (2 * fila) - 1;
            // fila uno: 2*1-1 =1, fila dos:2*2-1=3, fila tres:2*3-1 =5

            // disminuir numeros
            for (int n = primNumDeCadaFila; n >= 1; n -= 2) {
                System.out.print(n + " ");
            }

            System.out.println();
        }
    }
}
