package $examen_1203_redo;

public class UsaMP2 {

	public static void main(String[] args) {
	
		
		
		System.out.print("Tarjeta: " );
		TipoMetodoPagoX.TARJETA.calcularTotal(100);
		
		System.out.print("Paypal: " );
		TipoMetodoPagoX.PAYPAL.calcularTotal(100);
		
		System.out.print("Transferencia: " );
		TipoMetodoPagoX.TRANSFERENCIA.calcularTotal(100);


	}

}
