package UT03_T02_02_MAQUINAEXPENDEDORA;

import java.text.DecimalFormat;

public class UsaMonederoCompra {

	public static void main(String[] args) {

		DenominacionMoneda doseuros = new DenominacionMoneda(200, "2€");
		DenominacionMoneda uneuro = new DenominacionMoneda(100, "1€");
		DenominacionMoneda cincuenta = new DenominacionMoneda(50, "50c");
		DenominacionMoneda veinte = new DenominacionMoneda(20, "20c");
		DenominacionMoneda diez = new DenominacionMoneda(10, "10c");

		MonederoCompra monedero1 = new MonederoCompra();
		monedero1.agregarMoneda(uneuro);
		monedero1.agregarMoneda(cincuenta);
		monedero1.agregarMoneda(diez);
		monedero1.mostrar();
		
		int totalCentimos = monedero1.getTotalCentimos();
		// visualización
		System.out.println("Importe total del cajón (en centimos): " + totalCentimos);
		// visualización en euros (aqui porque el método devuelva un double)
		DecimalFormat formato = new DecimalFormat("#,###.00");
		double totalEuros = monedero1.getTotalEuros();		
		System.out.println("Importe total del cajón (en euros): " +  formato.format(totalEuros));

	}

}
