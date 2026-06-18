package $examen_1203;

public class UsaMP2 {


	public static void main(String[] args) {	
		
		System.out.println("\n enums");
		System.out.print("Tarjeta: " );
		TipoMetodoPago.TARJETA.calcularTotal(100);
		System.out.print("\nTransferencia: " );
		TipoMetodoPago.TRANSFERENCIA.calcularTotal(100);
		System.out.print("\nPaypal: " );
		TipoMetodoPago.PAYPAL.calcularTotal(100);	
		
	}
}
