package clases;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class javaUtilCalendar_GregCalendar {

	public static void main(String[] args) {

		// Constantes - constantes enteras arbitrarias definidas por Java
		// https://docs.oracle.com/javase/8/docs/api/constant-values.html#java/util/Calendar.html#ALL_STYLES
		System.out.println("Dia:  " + Calendar.DAY_OF_MONTH); // 5
		System.out.println("Mes:  " + Calendar.MONTH); // 2
		System.out.println("Año:  " + Calendar.YEAR); //1
		
		// GregorianCalendar - especifico
		// Calander una clase abstracte, solo implementa métodos y constantes, pero 
		// Calendar calendar = new Calendar(); ERROR: Cannot instantiate the type Calendar
		GregorianCalendar fechaActual = new GregorianCalendar();
		System.out.println("\n" + fechaActual + "\n"); // representación internal del Objeto
		
		System.out.println(fechaActual.getCalendarType());
		System.out.println(Calendar.getInstance());
		System.out.println(" Dia: " + fechaActual.get(Calendar.DAY_OF_MONTH));
		System.out.println(" Mes: " + fechaActual.get(Calendar.MONTH));
		System.out.println(" Año: " + fechaActual.get(Calendar.YEAR));
		System.out.println();
		
		// fecha de nacimiento
		GregorianCalendar fecha = new GregorianCalendar(1970, 12-1, 9);
		// System.out.println(fecha); - implementación enterna
		
		Date fechaNacimiento = fecha.getTime(); 
		// getTime() : Returns a Date object representing this Calendar's time value (millisecond offset from the Epoch").
		System.out.println(fecha.getTime()); // 29545200000 - milisegundos desde epoch
		System.out.println(fechaNacimiento.getTime()); // 29545200000 - milisegundos desde epoch
		System.out.println(fechaNacimiento); // Wed Dec 09 00:00:00 CET 1970		
		System.out.println();
		
		System.out.println("Fecha nacimiento: " + new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' YYYY").format(fechaNacimiento));
		System.out.println();		
		
		//System.out.println(new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' YYYY").format(fechaActual)); 
		// ERROR fechaActual no es un Date : SimpleDateFormat solo formatea Date
		System.out.println(new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' YYYY").format(fechaActual.getTime())); 
		
	}

}
