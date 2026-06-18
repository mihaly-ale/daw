package $examen_1203;

import java.time.LocalDate;

public class UsaMP3 {

	public static void main(String[] args) {

		Usuario pedro = new Usuario("Pedro", 1000);

		MetodoPago pago1 = new PagoTransferencia(pedro, "1234-5678");

//		System.out.println(pago1.pagar(400));
	
		pago1.pagar(1400);
	}

}
