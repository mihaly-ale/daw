package tipos;

public class chars1 {

	public static void main(String[] args) {
		char car = 'a';
		int numCar = 65;
		int numCarMay = ((int)(car) + 32);
		
		System.out.println("Valor de car: " + (int)car);
		System.out.println("Valor de numCar: " + (char)numCar);
		System.out.println("Valor de numCarMay: " + numCarMay);
		
		char entradaMay = 'K';
		char entradaMin = 'r';
	
		System.out.println(entradaMay + " en minuscula: " + (char)(entradaMay + 32));
		System.out.println(entradaMin + " en mayuscula: " + (char)(entradaMin - 32));

	}

}
