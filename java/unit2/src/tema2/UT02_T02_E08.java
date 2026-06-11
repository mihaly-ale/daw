package tema2;

import java.util.Scanner;

public class UT02_T02_E08 {
  public static void main(String[] args)
  {
    // instanciación
    Scanner sc = new Scanner(System.in);

    // declarar variables
    double x1, x2, y1, y2;
    double distancia;

    // leer entradas
    System.out.print("Introduce la coordenada x1: ");
    x1 = sc.nextInt();
    System.out.print("Introduce la coordenada y1: ");
    y1 = sc.nextInt();
    System.out.print("Introduce la coordenada x2: ");
    x2 = sc.nextInt();
    System.out.print("Introduce la coordenada y2: ");
    y2 = sc.nextInt();

    // computación
    distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    // mostrar resultado
    System.out.println("La distancia entre los dos puntos es: " +distancia);
  }
}
