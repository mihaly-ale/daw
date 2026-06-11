package UT03_T01_02_FECHA;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		long fecha1 = 25056000000l;
		long fecha2 = 983318400000l;

		Date date1 = new Date(fecha1);
		Date date2 = new Date(fecha2);

		// domingo, 23 de noviembre 1988.

		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd 'de' MMMM 'del' yyyy");

		if (date1.before(date2)) {
			// date1 < date2
			System.out.println(sdf.format(date1));
		} else {
			// date1 > date2
			System.out.println(sdf.format(date2));
		}

	}

}
