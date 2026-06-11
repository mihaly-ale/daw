package metodos;

public class sobrecargaDeMetodos {

	public static void main(String[] args) {

		// Parametros son argumentos
		System.out.println(
				"Parametros en Java:\nparametro formal es el variable, que va a estar substituendo con el valor actual (del parametro actual).\n");

		int suma2más8 = suma(2, 8); // parametro actual
		System.out.println("sum28: " + suma2más8);
		System.out.println("Suma ponderada: " + suma(2, 0.25, 3, 0.75) + "\n"); // sobrecarga de metodos

		int a = 2, b = 4, c = 3, d = 4;
		System.out.println("Conversión implicita a double de tipo int. ");
		System.out.println("a y c son enteros, pero no se puede \"int*double\". a y c a double y conversion explicita (float) en el return.");
		double resultado = suma(a, b, c, d);
		System.out.println("Suma ponderada: " + resultado);
		System.out.println("Suma ponderada: " + resultado);
	}

	public static int suma(int a, int b) { // parametro formal
		return a + b;
	}

	public static float suma(int a, double b, int c, double d) {
		// sobrecarga de los metodos - aunque tiene el mismo nombre
		// pero la cantidad y el tipo de los parametros son diferentes
		System.out.print("a - " + ((Object) (a)).getClass().getSimpleName() + "  ");
		System.out.print("b - " + ((Object) (b)).getClass().getSimpleName() + "  ");
		System.out.print("c - " + ((Object) (c)).getClass().getSimpleName() + "  ");
		System.out.print("d - " + ((Object) (d)).getClass().getSimpleName() + "  \n");
		return (float) (a * b + c * d);
	}
}
