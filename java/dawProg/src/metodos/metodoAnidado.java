package metodos;

public class metodoAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 4;

		System.out.println(sumarDosNumeros(4, numero));
		int suma = sumarDosNumeros(4, numero);
		System.out.println(suma);
		System.out.println(sumarDosNumeros(4, sumarDosNumeros(1, 2))); // sumar tres numeros con ele metdodo que suma 2
																		// numeros
	}

	public static int sumarDosNumeros(int a, int b) {
		return a + b;
	}

}
