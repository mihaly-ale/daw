package pedidos;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.GregorianCalendar;

class PedidoOld {
	private String id;
	private static ArrayList<String> historialCambios = new ArrayList<>();
	// PROBLEM 1: This list is static. All PedidoOld instances share it.
	// Ideally, it should be non-static if each PedidoOld should have its own log.

	public PedidoOld(String id) {
		this.id = id;
	}

	public static void setHistorialCambios(String log) {
		historialCambios.add(log);
	}

	public static ArrayList<String> getHistorialCambios() {
		return historialCambios;
	}

	@Override
	public String toString() {
		return "PedidoOld [id=" + id + "]";
	}

}

public class PedidoClassLevelOld {

	public static void main(String[] args) {

		PedidoOld[] misPedidosOld = new PedidoOld[2];

		for (int i = 0; i < misPedidosOld.length; i++) {
			misPedidosOld[i] = new PedidoOld(String.valueOf(i * 100));

			String log = "Pedido " + (String.valueOf(100 + i)) + "\t - ["
					+ new SimpleDateFormat("dd 'de' yyy HH:mm:SS").format(new GregorianCalendar().getTime()) + "]";

			PedidoOld.setHistorialCambios(log);
		}

		for (String p : PedidoOld.getHistorialCambios()) {
			System.out.println(p);
			// stronig in class level
		}

		// Creating instances, that will store the history on the class, not per object
		PedidoOld old1 = new PedidoOld("123");
		PedidoOld old2 = new PedidoOld("456");

		// add logs apart from the basic logs
		old1.setHistorialCambios("Pedido 123 created");
		old2.setHistorialCambios("Pedido 456 created");

		// check histories - logs 123 and 456 on old1 and also old2 - class level
		// strorage
		System.out.println("old1:");
		System.out.println("\t" + old1.toString() + "\n\t " + old1.getHistorialCambios());
		System.out.println("old2:");
		System.out.println("\t" + old2.toString() + "\n\t " + old2.getHistorialCambios());
		System.out.println("PedidoOld:");
		System.out.println("\t" + PedidoOld.getHistorialCambios());
		//logs are shared across instances and class
	}
}
