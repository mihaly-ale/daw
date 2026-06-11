package bucles;

public class forConTipoChar {
	public static void main(String[] args) {

		for (char car = 'z'; car >= 'a'; car--) // tipo char is entero, se puede disminuir su valor
			System.out.print(car + " ");
		System.out.println("Final"); // esto es afuera del bucle de for

	}

}
