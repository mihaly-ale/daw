package UT03_T02_02_MAQUINAEXPENDEDORA;

import java.text.DecimalFormat;
import java.util.HashMap;

public class MonederoCompra {
	HashMap<DenominacionMoneda, Integer> monedasCompra = new HashMap<DenominacionMoneda, Integer>();

	// const - se puede quitar, Java hace por defecto
	public MonederoCompra() {

	}

	// methods
	public void agregarMoneda(DenominacionMoneda denom) {
		monedasCompra.put(denom, monedasCompra.getOrDefault(denom, 0) + 1);

	}

	public void mostrar() {
		for (DenominacionMoneda denom : this.monedasCompra.keySet()) {
			System.out.println(" " + denom.etiqueta() + " -> " + monedasCompra.get(denom) + " unidades.");
		}
	}

	public int getTotalCentimos() {
		int totalDeMonederoEnCentimos = 0;
		for (DenominacionMoneda denom : monedasCompra.keySet()) {
			totalDeMonederoEnCentimos += denom.valorCentimos() * monedasCompra.get(denom);
		}

		return totalDeMonederoEnCentimos;
	}

	public double getTotalEuros() {
		return (double) getTotalCentimos() / 100;
	}

}

// CASERO
//public void agregarMoneda(DenominacionMoneda denom) {
//	if (!this.monedasCompra.containsKey(denom)) {
//		System.out.println("no key");
//		this.monedasCompra.put(denom, 1);
//	} else {
//		System.out.println("yes key");
//		int cantidad = this.monedasCompra.get(denom).intValue() + 1;
//		this.monedasCompra.put(denom, cantidad);
//	}
//}