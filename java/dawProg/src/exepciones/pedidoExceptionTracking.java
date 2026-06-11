package exepciones;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Pedido {

	private String id;

	private static ArrayList<String> historialCambios = new ArrayList<>();

	public Pedido(String id) throws Exception { // propagate up with another level
		pedidoValido(id);
		this.id = id;
		registrarPedido(this.id);
	}

	public static void pedidoValido(String id) throws Exception { // propagate up with one level
		if (!id.matches("P-\\d{3}"))
			throw new Exception("[" + id + "] Formato debe se: P-000");
	};

	public static ArrayList<String> getHistorialCambios() {
		return historialCambios;
	}

	private void registrarPedido(String id) { // Registrar log
		String log = "Pedido " + id + "\t["
				+ new SimpleDateFormat("dd 'de' MMMM 'de' yyyy HH:mm:ss").format(new GregorianCalendar().getTime())
				+ "]";
		historialCambios.add(log);
	}
}

public class pedidoExceptionTracking {
	public static void main(String[] args) {
		Pedido[] misPedidos = new Pedido[5];

		try {
			misPedidos[0] = new Pedido("P-876");
			misPedidos[1] = new Pedido("P-34");
			misPedidos[2] = new Pedido("P-444");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Visualizar el historialCambios
		for (String logs : Pedido.getHistorialCambios())
			System.out.println(" - " + logs);
	}
}

// RASTREAR EL ERRROR
//java.lang.Exception: [P-34] Formato debe se: P-000
//at dawProg/__CLASE.Pedido.pedidoValido(ON503.java:25)
//at dawProg/__CLASE.Pedido.<init>(ON503.java:18)
//at dawProg/__CLASE.ON503.main(ON503.java:46)
