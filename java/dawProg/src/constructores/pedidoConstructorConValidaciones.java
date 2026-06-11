package constructores;

import java.util.ArrayList;
import java.util.Objects;

class Pedido { // changename

	private String id;
	private String nombreProducto;
	private String descripcionProducto;
	private int cantidadProducto;

//	just filling up the constructor con methods that it creates a valid object
	public Pedido(String id, String nombreProducto, String descripcionProducto,
			int cantidadProducto) throws IllegalArgumentException {

		/// 1 - id
		pedidoValido(id);
		this.id = id;

		/// 2 - nombreProducto
		// if(nombreProducto == null) throw new NullPointerException();
		// "shorthand" ↓↓↓

		String nombre = Objects.requireNonNull(nombreProducto, "el producto no debe ser sin nombre").trim(); // NOTE: *
		if (nombre.trim().isEmpty())
			throw new IllegalArgumentException("El producto no debe ser vacío");
		this.nombreProducto = nombre;

		/// 3 - descripcionProducto
		this.descripcionProducto = Objects.requireNonNull(descripcionProducto,
				"Descripción del producto es obligatorio.");

		/// 4 - cantidadProducto
		if (cantidadProducto < 1) {
			throw new IllegalArgumentException("La cantidad debe ser mayor que zero.");
		}
		this.cantidadProducto = cantidadProducto;
	}

	private void pedidoValido(String id) throws IllegalArgumentException {
		if (!id.matches("P-\\d{3}"))
			throw new IllegalArgumentException("[" + id + "] Formato debe ser: P-000");
	}

	@Override
	public String toString() {
		return "pedido -> [\n\tid = " + id + ",\n\tnombreProducto = " + nombreProducto + ",\n\tdescripcionProducto = "
				+ descripcionProducto + ",\n\tcantidadProducto = " + cantidadProducto + "]";
	}

}

public class pedidoConstructorConValidaciones {

	public static void main(String[] args) {

		ArrayList<Pedido> pedidos = new ArrayList<>();

		Object[][] productos = {
				{ "P-888", "Peras  ", "Calidad ...", 20 },
				{ "P-x12", "Naranjas", "Calidad ...", 20 },
				{ "P-777", "Kiwis", "Calidad ...", 20 } };

		for (Object[] p : productos) {
			try {
				pedidos.add(new Pedido((String) p[0], (String) p[1], (String) p[2],
						(Integer) p[3]));
			} catch (IllegalArgumentException e) {
				System.out.println(e.toString());
			}
		}

		for (Pedido p : pedidos) {
			System.out.println(p.toString());
		}

	}
}

// *