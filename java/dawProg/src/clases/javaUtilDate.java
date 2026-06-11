package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class javaUtilDate {

	public static void main(String[] args) {

		Date epoch = new Date(0); // en sistemas de UNIX es siempre Thu Jan 01 01:00:00 CET 1970
		System.out.println("epoch " + epoch);

		Date hoy = new Date();
		System.out.println(" hoy: " + hoy); // dia de hoy con el mismo formato
		System.out.println(" " + "hoy en ms desde epoch: " + hoy.getTime());

		// una clase de formatear de Date, admite patrones
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); // crear instancia con el patrón
		// patrones

		System.out.println("\n-- SimpleDateFormat -- ");
		String formateoHoy = sdf.format(hoy); // utilizar método
		System.out.println("Fecha actual (Eu/Madrid): " + formateoHoy);

		// otro formato
		SimpleDateFormat sdf2 = new SimpleDateFormat("E, dd 'de' MM 'del' yyyy kk:mm:ss");
		// E - nombre del día
		// d - dia del mes
		// M - mes del año de 3 caracteres
		// febrero
		// M -> 2
		// MM -> 02
		// MMM -> feb
		// MMMM -> febrero
		// L - solo el mes, no como parte de un fecha
		// hora kk:mm:sss
		// h - hora(1-24
		String formateoHoy2 = sdf2.format(hoy);
		System.out.println("Fecha actual con patrón de \"sdf2\" (Eu/Madrid): " + formateoHoy2);

		// metodos de clase Date
		// https://docs.oracle.com/javase/8/docs/api/java/util/Date.html

		// before, after
		System.out.println("\n-- métodos de Date --");
		System.out.println("before: " + hoy.before(epoch)); // false
		System.out.println("after: " + hoy.after(epoch)); // false

		// toString, toLocaleString
		System.out.println("toLocaleString; " + hoy.toLocaleString()); // 7 feb 2026, 10:36:33
		System.out.println("toString: " + hoy.toString()); // Sat Feb 07 10:37:19 CET 2026
		System.out.println("\n");
		
		// crear Fecha nueva - DEPRECATED
		Date march151848 = new Date(1848 - 1900, 2, 15);
		System.out.println(march151848);
		System.out.println("*************");
		System.out.println(new Date(Date.parse("15 Mar 1848"))); // tipo Date
		System.out.println(Date.parse("15 Mar 1848")); // milisegundos desde el epoch

	}

}
