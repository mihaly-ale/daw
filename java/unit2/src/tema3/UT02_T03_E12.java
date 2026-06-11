package tema3;

public class UT02_T03_E12 {
	public static void main(String[] args) {

		int x = 30;
		int y = 60;

		System.out.println("x=" + x + " y=" + y); // x = 30, y = 60

		// Asignación
		x = y; // x = 60
		System.out.println("x=" + x + " y=" + y); // x = 60, y = 60

		x = 90; // x = 90
		System.out.println("x=" + x + " y=" + y); // x = 90, y = 60 
	}
}
