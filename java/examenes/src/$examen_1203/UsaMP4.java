package $examen_1203;

public class UsaMP4 {

	public static void main(String[] args) {
		
		
		Usuario pedrito = new Usuario("Pedro", 1000);

		MetodoPago pago2 = new PagoTransferencia(pedrito, "1234-5678");

//		System.out.println(pago1.pagar(400));
	
		try {
			pago2.pagar(100);
		} catch (ValidarSaldoCuenta e) {
			System.out.println(e.toString());		
		}
	}
}
