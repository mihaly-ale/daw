package pedidos;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.GregorianCalendar;

class PedidoNew {
	private String id;
	private static ArrayList<String> historialCambios = new ArrayList<>();

	public PedidoNew(String id) {

		if (!id.matches("P-\\d{3}")) { // validación y creación de id
			this.id = "P-999";
		} else {
			this.id = id;
		}

		registrarPedidoNew(this.id);
		// registra automáticamente el pedido en el historial compartido de la clase
		// todavía no en la instancia, porque historialCambios es estático, es de clase
	}

	public static ArrayList<String> getHistorialCambios() {
		return historialCambios;
	}

	private void registrarPedidoNew(String id) {
		String log = "PedidoNew " + id + "\t["
				+ new SimpleDateFormat("dd 'de' yyy HH:mm:SS").format(new GregorianCalendar().getTime()) + "]";

		historialCambios.add(log); // utilizar métodos de ArrayList
	}

}

public class PedidoClassLevelNew {

	public static void main(String[] args) {

		PedidoNew[] misPedidos = new PedidoNew[5];

		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd 'de' yy HH:mm:ss"); // Dateformatter !!!

		misPedidos[0] = new PedidoNew("P-876");
		misPedidos[1] = new PedidoNew("P-134");
		misPedidos[2] = new PedidoNew("P-256");
		misPedidos[3] = new PedidoNew("P-478");
		misPedidos[4] = new PedidoNew("P-987");
//		misPedidos[5] = new PedidoNew("P-101"); // ERROR: ArrayIndexOutOfBoundsException

		for (String logs : PedidoNew.getHistorialCambios()) {
			System.out.println(" - " + logs);
		}
		
		PedidoNew new1 = new PedidoNew("a-100");		
		System.out.println(new1.getHistorialCambios());
		// still shared between class and objects (instances)

	} // main

}
