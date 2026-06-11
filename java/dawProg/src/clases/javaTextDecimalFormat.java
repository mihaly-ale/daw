package clases;

import java.text.DecimalFormat;

public class javaTextDecimalFormat {

	public static void main(String[] args) {
//para dra formato a la salida
		
		float a = 1234567.45f;
		double b = 1234567.045;
		
		DecimalFormat formato1 = new DecimalFormat("#,###.00 \u20AC"); // \u20AC = €
		DecimalFormat formato2 = new DecimalFormat("#,###.0# \u20AC");
		
		// System.out.println("a: " + a); // 1234567.5
		// System.out.println("b: " + b); // 1234567.45
		System.out.println("a: " + formato1.format(a)); // 1.234.567,50 €
		System.out.println("a: " + formato2.format(a)); // 1.234.567,5 €
		System.out.println("b: " + formato1.format(b)); // 1.234.567,45 €
		System.out.println("b: " + formato2.format(b)); // 1.234.567,45 €
	}

}

//java.lang.Object
//↑
//java.text.Format		SUBCLASSES: DateFormat (-> SimpleDateFormat), MessageFormat, NumberFormat
//↑
//java.text.NumberFormat
//↑
//java.text.DecimalFormat 

//0 – prints a digit if provided, 0 otherwise
//# – prints a digit if provided, nothing otherwise
//. – indicate where to put the decimal separator
//, – indicate where to put the grouping separator
