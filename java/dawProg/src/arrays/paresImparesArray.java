package arrays;

public class paresImparesArray {
	static int imparConTernario = 0, parConTernario = 0;

	public static void main(String[] args) {

		int iNumeros[] = { 3, -5, 6, 8, -2 };

		int par = 0, impar = 0;
		
		for (Integer num : iNumeros) {
			if (num % 2 == 0) {
				par++;
			} else
				impar++;			
		}
		System.out.println("par: " + par + "\nimpar: " + impar);
		
		System.out.println("\nCon ternario");		
		parImparConTernario(iNumeros);
		System.out.println("pares con ternario: " + parConTernario + "\nimpares con ternario: " + imparConTernario);
		
	} //final main

	public static void parImparConTernario (int numeros[]) {
		
		for (Integer num : numeros) {
		int result = (num % 2) == 0 ? parConTernario++ : imparConTernario++;
		System.out.println(num  + " " + result); // log los valores the variables en cada iteración
		// !!! post-increment: devolver el valor antes de aumentar
		
		}}
}
