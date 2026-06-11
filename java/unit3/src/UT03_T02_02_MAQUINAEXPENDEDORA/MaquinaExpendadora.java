package UT03_T02_02_MAQUINAEXPENDEDORA;

import java.util.ArrayList;
import java.util.HashMap;

public class MaquinaExpendadora {

	HashMap<CodigoProducto, Slot> inventario = new HashMap<CodigoProducto, Slot>();
	private HashMap<DenominacionMoneda, Integer> cajonEfectivo = new HashMap<DenominacionMoneda, Integer>();

	// constuctor
	public MaquinaExpendadora() {
		this.inicializarProductos();
		this.inicializarCajon();
	}

	/// METHODS
	// private
	private void inicializarProductos() {
		Producto agua = new Bebida("Agua", 120, false);
		Producto patatas = new Snack("Patatas", 130, true);
		Producto mixto = new Sandwich("Mixto", 350, null);

		Producto[] productos = { agua, patatas, mixto };

		try {
			this.inventario.put(new CodigoProducto("A1"), new Slot(agua, 3));
			this.inventario.put(new CodigoProducto("B2"), new Slot(patatas, 4));
			this.inventario.put(new CodigoProducto("B3"), new Slot(mixto, 4));
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}

	private void inicializarCajon() {
		// datos de configuración
		Integer[] cantidadesIniciales = { 3, 5, 10, 8, 12 };
		DenominacionMoneda[] denominacionesIniciales = { new DenominacionMoneda(200, "2€"),
				new DenominacionMoneda(100, "1€"), new DenominacionMoneda(50, "50c"), new DenominacionMoneda(20, "20c"),
				new DenominacionMoneda(10, "10c") };
		// final de "datos de configuración"

		for (int i = 0; i < cantidadesIniciales.length; i++) {
			cajonEfectivo.put(denominacionesIniciales[i], cantidadesIniciales[i]);
		}
	}

	// visualización / salida por consola
	public void inventarioMaquina() {
		System.out.println("Contenido del inventario: ");
		for (CodigoProducto c : this.inventario.keySet()) {
			System.out.println(" " + c.codigoProducto() + " - > | stock=" + inventario.get(c).getStock());
		}
		System.out.println("\n");
	}

	public void dineroCajon() {
		int totalDeCajonEnCentimos = 0;
		System.out.println("Contenido del cajón: ");

		for (DenominacionMoneda denom : this.cajonEfectivo.keySet()) {
			System.out.println(" " + denom.etiqueta() + " -> " + cajonEfectivo.get(denom) + " unidades.");

			totalDeCajonEnCentimos += denom.valorCentimos() * cajonEfectivo.get(denom);
		}
		System.out.printf("Importe total de cajón (euros): %.2f %s", (float) totalDeCajonEnCentimos / 100, "€");
		System.out.println("\n");
	}

	public void reponerProducto(CodigoProducto codigo, int cantidad) {
		inventario.get(codigo).reponer(cantidad);
	}

	public void reponerMoneda(DenominacionMoneda denom, int cantidad) {
		if (this.cajonEfectivo.containsKey(denom)) {
			int cantidadNuevo = cajonEfectivo.get(denom).intValue() + cantidad;

			cajonEfectivo.put(denom, cantidadNuevo);
		}
	}

	public void venderProducto(CodigoProducto codigo) {
		if (!inventario.containsKey(codigo)) {
			System.err.println("El producto no existe.");
			return;
		} else {
			inventario.get(codigo).vender();
		}
	}

	public void calcularCambio(int cambioCentimos) throws SinCambioException {
		ArrayList<DenominacionMoneda> ordenadas = new ArrayList<>(cajonEfectivo.keySet());
		ordenadas.sort((a, b) -> b.valorCentimos() - a.valorCentimos());
		HashMap<DenominacionMoneda, Integer> monedasUsadas = new HashMap<>();

		System.out.println("calcular cambios " + cambioCentimos);
		System.out.println("cambio de: ");

		for (DenominacionMoneda d : ordenadas) { // valorCentimos, etiqueta (cajonEffectivo: DenomMon, Ineteger)

			if (this.cajonEfectivo.get(d) > 0) {
				if (cambioCentimos >= d.valorCentimos()) { // 45, 20
					int maxMonedasPosibles = cambioCentimos / d.valorCentimos(); // 45/20 = 2
					int maxMonedas = Math.min(maxMonedasPosibles, cajonEfectivo.get(d));
					cambioCentimos -= maxMonedas* d.valorCentimos();

					monedasUsadas.put(d, monedasUsadas.getOrDefault(d, 0) + maxMonedas);

				}
			}
		}
		
		for (DenominacionMoneda denom : monedasUsadas.keySet()) {
			System.out.print(" \t" + monedasUsadas.get(denom) + " de"
					+ " " + denom.etiqueta() + "\n ");

		}

	}

}

//*****************************

//public void calcularCambio(int cambioCentimos) throws SinCambioException {
//
//Ordenar un HashMap
//
////Ordenar las monedas por valor descendente (200, 100, 50, 20, 10 ... )
//ArrayList<DenominacionMoneda> ordenadas = new ArrayList<>(cajon.keySet());
//
//'/lambda pequeña funcion -- (parametros) -- > resultado
//ordenadas.sort((a, b) -> b.valorCentimos() - a.valorCentimos());
//*****************************

// Producto(String nombre, int precioCentimos)
// public Slot(Producto product, int stock) vender
// inventario HashMap<CodigoProducto, Slot>() .venderProducto(CodigoProducto)

//int precioProducto = inventario.get(codigo).getProduct().precioCentimos();
//int[] valoresCentimos = new int[cajonEfectivo.size()];
//
//for (int i = 0; i < cajonEfectivo.size(); i++) {
//	DenominacionMoneda[] denom = cajonEfectivo.keySet().values();
//	
//	valoresCentimos[i] = cajonEfectivo.keySet().add(DenominacionMoneda).);
//}

// started my way, changed to Monedero
//money start
//int precioProducto = inventario.get(codigo).getProduct().precioCentimos();
//int[] valoresCentimos = {200,100,50,20,10};			
//
//System.out.println("El precio del producto es " + precioProducto + " centimos.");
//System.out.println("Pago: ");
//Scanner sc = new Scanner(System.in);	
//
//for (int i = 0; i < valoresCentimos.length; i++) {
//	System.out.print("Quiere pagar con " + valoresCentimos[i] + "? " );
//	
//	String pagaConCentimos = sc.next().trim();
//	
//	if (pagaConCentimos.equals("si")) {			implement here the while	
//		System.out.println("Cuantas unidades de " + valoresCentimos[i] + " céntimos va a poner? ");
//		int unidadDeCentimos = sc.nextInt();
//		
//		int cantidadRestante = precioProducto - unidadDeCentimos * valoresCentimos[i];
//		
//		if (cantidadRestante < precioProducto) {
//			System.out.println("Ha introducido más dinero del necesario. Su cambio es: calcularcambio aqui");
//			return;
//		} else {
//			
//			System.out.println("Cantidad restante " + precioProducto);
//		}
//	}
//	
//	
//}
//sc.close();
// money end
