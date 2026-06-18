package $examen_1203_redo;

import java.time.LocalDate;

public class UsaMP3 {

	public static void main(String[] args) {

		UsuarioX james = new UsuarioX("james", 1000);

		PagoTarjeta pagoTar1 = new PagoTarjeta(TipoMetodoPagoX.TARJETA, james, "123456789", LocalDate.of(2020, 05, 01));
		comprobarInstancias(pagoTar1);

		// pagoTar1.comprobarSaldo(2000);
		// pagoTar1.pagar(100);

		// b, con transferencia comprobando la fecha de caducidad de la tarjeta

		MetodoPago pagoTrans1 = new PagoTransferencia(TipoMetodoPagoX.TRANSFERENCIA, james);
		comprobarInstancias(pagoTrans1);

		MetodoPago[] pagos = { pagoTar1, pagoTrans1 };

//		for (MetodoPago p : pagos) {
//			if (p instanceof PagoTarjeta) {
//				PagoTarjeta pt = (PagoTarjeta) p;
//				pt.getFechaCaducidad();
//				System.out.println("pago con trajeta");
//			} else {
//				System.out.println("no spuede comprobar fecha cad de tarjets" + p.getClass());
//			}
//		} // old
		
		for (MetodoPago p : pagos) {
			comprobarInstancias(p);
		}

	}

	private static void comprobarInstancias(MetodoPago p) {
		if (p instanceof PagoTarjeta pt) {
			System.out.println("pago con trajeta" + pt.getFechaCaducidad());
		} else {
			System.out.println("no se puede comprobar fecha caducidad de pago, porque es un pago de " + p.getClass());
		}
	}
}
