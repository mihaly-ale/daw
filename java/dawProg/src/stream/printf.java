package stream;

public class printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ape = "Fernandez";
		System.out.printf("8 - Sr. %s puede", "pepe");
		System.out.printf("9 - Sr. %s puede %s", ape, "Valladolid"); // %s para texto
		System.out.printf("10 -Sr. %s puede %S", ape, "Valladolid"); // %S para texto en mayúscula
		System.out.printf("11 - Sr. %s %npuede %S%n", ape, "Valladolid"); // %n salto de línea
		System.out.printf("12 - Numero entero: %d%n", 124); // %d for numbers
		System.out.printf("13 - Numero entero: %6d%n", 124);// cubrir espacios (numero) - alinear
		System.out.printf("14 - Numero entero: %4d%n", 124);
		System.out.printf("15 - Numero entero: %-6dsigo%n", 124);// alinear a la izquierda
		System.out.printf("16 - Numero entero: %06dsigo%n", 124);// alinear a la izquierda y rellena el espacio
		System.out.printf("17 - Numero entero: %f%n", Math.random());// f for decimal ????
		System.out.printf("18 - Numero entero: %.2f%n", 3.14165);// 3f, number is for length of decimals
		System.out.printf("19 - Numero entero: %+d %+d%n", -23, -45);// + para mostra el signo
		System.out.printf("20 - Numero entero: %+d %+d%n", -23, 45);//
		System.out.printf("21 - Cantidad: %,.2f€%n", 3456.678);//

		double d = 1.0 / 0;
		System.out.println(d); // java will swallow it
		int i = 1 / 0;
		System.out.println(i);

	}

}
//8 - Sr. pepe puede9 - Sr. Fernandez puede Valladolid10 -Sr. Fernandez puede VALLADOLID11 - Sr. Fernandez 
//puede VALLADOLID
//12 - Numero entero: 124
//13 - Numero entero:    124
//14 - Numero entero:  124
//15 - Numero entero: 124   sigo
//16 - Numero entero: 000124sigo
//17 - Numero entero: 0.985847
//18 - Numero entero: 3.14
//19 - Numero entero: -23 -45
//20 - Numero entero: -23 +45
//21 - Cantidad: 3,456.68€
//Infinity