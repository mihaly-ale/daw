package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E21 {

	public static void main(String[] args) {
		// Clases
		Scanner sc = new Scanner(System.in);
		// constantes
		int TARIFA_BASE = 15;
		float MOD_EXTRA_PAGO = 1.5f;
		float IMPUESTO_BAJO = 0.25f;
		float IMPUESTO_ALTO = 0.45f;
		// entradas
		int horasTrabajadas;
		// variables a calcular
		float modTarifaBase;
		int horasExtras = 0;
		int horasNormales = 0;
		float sueldoBruto;
		float sueldoNeto;
		float impuestosAplicados = 0;

		// Entrada
		System.out.printf("Teclea las horas trabajadas en la semana: ");
		horasTrabajadas = sc.nextInt();

		// Calculaciones
			//pago extra
		modTarifaBase = TARIFA_BASE * MOD_EXTRA_PAGO;
			// horas
		horasNormales = (horasTrabajadas > 40) ? 40 : horasTrabajadas;
		horasExtras = (horasTrabajadas > 40) ? (horasTrabajadas - 40) : horasExtras;

			// sueldo bruto
		sueldoBruto = horasNormales * TARIFA_BASE + horasExtras * modTarifaBase;

			//impuestos
		if (sueldoBruto > 500)
			impuestosAplicados = (Math.min(900, sueldoBruto) - 500) * IMPUESTO_BAJO;
		
		if (sueldoBruto > 900)
			impuestosAplicados += (sueldoBruto - 900) * IMPUESTO_ALTO;		
			
			//sueldo neto
		sueldoNeto = sueldoBruto - impuestosAplicados;

		System.out.printf("Salario bruto: %.2f € %n", sueldoBruto);
		System.out.printf("Impuestos aplicados: %.2f € %n", impuestosAplicados);
		System.out.printf("Salario neto: %.2f € %n", sueldoNeto);

	}

}
