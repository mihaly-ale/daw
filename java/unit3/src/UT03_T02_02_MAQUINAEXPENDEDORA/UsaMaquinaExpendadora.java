package UT03_T02_02_MAQUINAEXPENDEDORA;

import java.util.Scanner;

public class UsaMaquinaExpendadora {

	public static void main(String[] args) {

		MaquinaExpendadora iesGalileo = new MaquinaExpendadora();

		iesGalileo.inventarioMaquina();
		iesGalileo.dineroCajon();

		CodigoProducto a1 = new CodigoProducto("b2");
		int precioProducto = iesGalileo.inventario.get(a1).getProduct().precioCentimos();

		System.out.println("vender a1 (" + precioProducto + " centimos)");
		
		System.out.println("insertar dinero ...");
		MonederoCompra monedero = new MonederoCompra();
		DenominacionMoneda doseuros = new DenominacionMoneda(200, "2€");
		DenominacionMoneda uneuro = new DenominacionMoneda(100, "1€");
		DenominacionMoneda cincuenta = new DenominacionMoneda(50, "50c");
		DenominacionMoneda veinte = new DenominacionMoneda(20, "20c");
		DenominacionMoneda diez = new DenominacionMoneda(10, "10c");		
		monedero.agregarMoneda(uneuro);
		monedero.agregarMoneda(cincuenta);
		monedero.agregarMoneda(diez);		
		System.out.println("Total de monedas agregadas (céntimos): " + monedero.getTotalCentimos());
		
		if (monedero.getTotalCentimos() >= precioProducto) {
			int cambio = monedero.getTotalCentimos() - precioProducto;
			iesGalileo.venderProducto(a1);			
			iesGalileo.calcularCambio(cambio);
		}
		
		iesGalileo.inventarioMaquina();

		// reponer productos
//		iesGalileo.reponerProducto(a1, 10);
//		System.out.println("reponer 10 uds de a1");
//		System.out.print("Nuevo ");
//		iesGalileo.inventarioMaquina();

		// reponer moneda
//		reponerMonedas(iesGalileo);
//		iesGalileo.dineroCajon();
	}

	private static void reponerMonedas(MaquinaExpendadora iesGalileo) {
		String[] etiquetas = { "2€", "1€", "50c", "20c", "10c" };
		int[] valoresCentimos = { 200, 100, 50, 20, 10 };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < etiquetas.length; i++) {
			String reponeMoneda = "";

			do {
				System.out.print("Quiere reponer " + etiquetas[i] + " ?");
				reponeMoneda = sc.next();
				
				if (!reponeMoneda.equalsIgnoreCase("si") && !reponeMoneda.equalsIgnoreCase("no")) {
					System.out.println("Entrada inválido, solo puede ser \"si\" o \"no\".");
				}
			} while (!reponeMoneda.equalsIgnoreCase("si") && !reponeMoneda.equalsIgnoreCase("no"));

			Integer cantidad = 0;

			if (reponeMoneda.equalsIgnoreCase("si")) {
				System.out.print("Cuantas unidades quire reponer (" + etiquetas[i] + ") ?");
				cantidad = sc.nextInt();
			}

			iesGalileo.reponerMoneda((new DenominacionMoneda(valoresCentimos[i], etiquetas[i])), cantidad);

		}
	}

}

// DenominacionMoneda denom, int cantidad