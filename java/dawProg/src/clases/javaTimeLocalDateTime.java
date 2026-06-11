package clases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class javaTimeLocalDateTime {

	public static void main(String[] args) {

		System.out.println(LocalDateTime.now());
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd 'de' yy HH:mm:ss");
//		System.out.println(LocalDateTime.now().format(f));
		System.out.println(LocalDate.of(8, 2, 3));
		String.format("dd 'de' yy HH:mm:ss", LocalDateTime.now().toString());
	}

}

// -- CALENDAR - GREGORIANCALENDAR
// java.lang.Object
// ↑
// java.util.Calendar   (abstract class)
// ↑
// java.util.GregorianCalendar  (concrete class)

// -- DATE
// java.lang.Object
// ↑
// java.util.Date 

// -- LOCALDATETIME
// java.lang.Object
// ↑
// java.time.LocalDateTime ALSO: LocalTime - only time, LocalDate - only date

//**************************

// -- SIMPLEDATEFORMAT
// java.lang.Object
// ↑
// java.text.Format
// ↑
// java.text.DateFormat		(abstract class) ALSO: MessageFormat, NumberFormat
// ↑
// java.text.SimpleDateFormat		(concrete class)

// -- DATETIMEFORMATTER
// java.lang.Object
// ↑
// java.time.format.DateTimeFormatter 

// FORMATTING
// GregorianCalendar object -> Date -> SimpleDateFormat.format(GregorianCalender object to Date with the getTime() method)
// LocalDateFormat object -> object.format(DateTimeFormatter.ofPattern)
