package UT03_T02_02_MAQUINAEXPENDEDORA;

import java.util.HashMap;

public class UsaMoneda {

	public static void main(String[] args) {

		HashMap<DenominacionMoneda, Integer> cajonEfectivo = new HashMap<>();

		cajonEfectivo.put(new DenominacionMoneda(200, "2€"), 3);
		cajonEfectivo.put(new DenominacionMoneda(100, "1€"), 5);
		cajonEfectivo.put(new DenominacionMoneda(50, "50c"), 10);
		cajonEfectivo.put(new DenominacionMoneda(20, "20c"), 8);
		cajonEfectivo.put(new DenominacionMoneda(10, "10c"), 12);

		System.out.println("=== Contenido del cajón de efectivo ===");
		int totalDeCajonEnCentimos = 0;
		for (DenominacionMoneda denom : cajonEfectivo.keySet()) {

			System.out.println(denom.etiqueta() + " -> " + cajonEfectivo.get(denom) + " unidades");

			totalDeCajonEnCentimos += denom.valorCentimos() * cajonEfectivo.get(denom);
		}

		System.out.println("Importe total del cajón (en centimos): " + totalDeCajonEnCentimos);
		System.out.printf("Importe total del cajón (en euros): %.2f " + "%s", (float) totalDeCajonEnCentimos / 100,
				"€");
	}

}
