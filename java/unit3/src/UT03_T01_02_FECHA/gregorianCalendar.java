package UT03_T01_02_FECHA;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class gregorianCalendar {

	public static void main(String[] args) {

		int dia, mes, año, edad = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu día de nacimiento: ");
		dia = sc.nextInt();
		System.out.print("Introduce tu mes de nacimiento: ");
		mes = sc.nextInt();
		System.out.print("Introduce tu año de nacimiento: ");
		año = sc.nextInt();

		GregorianCalendar fechaNacimiento = new GregorianCalendar(año, mes - 1, dia);
		fechaNacimiento.setLenient(false);

		try {
			fechaNacimiento.getTime();
		} catch (Exception e) {
			System.out.println("Entrada inválida. El programa saldrá.");
			return;
		}

		GregorianCalendar fechaHoy = new GregorianCalendar();

		if (fechaHoy.before(fechaNacimiento)) {
			System.out.println("La persona aún no había nacido.");
		} else {
			System.out.println("calcular edad");
			edad = calcularEdad(fechaNacimiento, fechaHoy);
		}

		System.out.printf("Fecha nacimiento: %02d/%02d/%04d%n", dia, mes, año);
		System.out.println("Edad: " + edad + " años");

	} // main

	public static int calcularEdad(GregorianCalendar nacimiento, GregorianCalendar hoy) {
		int años = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

		int mesHoy = hoy.get(Calendar.MONTH);
		int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
		int mesNac = nacimiento.get(Calendar.MONTH);
		int diaNac = nacimiento.get(Calendar.MONTH);

		if (mesHoy < mesNac || (mesHoy == mesNac && diaHoy < diaNac)) {
			años = años - 1;
		}

		return años;
	}// calcularEdad

}// clase
