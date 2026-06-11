package $examen1203_redo;

public class UsaMP1 {

	public static void main(String[] args) {

		UsuarioX john = new UsuarioX("John", 2000);

		john.descontar(TipoMetodoPagoX.PAYPAL.calcularTotal(100));
		
		// john.tieneSaldosuficiente(4000);
		// john.descontar(4000);
		// john.descontar(1000);
		// john.ingresar(10);
	}

}
