package accessModifiers;

public class Mobile {

	private String marca;
	private final int imei;
	private int id;

	private static int identSgte = 1; // estática pertenece a la clase

	// constructores
	// Al establecer imei como final, todos los constructores deben inicializarlo.
	// Por lo tanto, no puede exisitir un constructor vacío
	public Mobile(int imei) {
		this.imei = imei;
		// este constructor debería tener this.id = identSgte++;
		// => noIdMobile
	}

	public Mobile(String marca, int imei) {
		this.marca = marca;
		this.imei = imei;
		this.id = identSgte++; // add a getter here to expose the data #TODO
		// the getter should be also static
	}

	// métodos personalizados
	public void realizarLalamadas() {
		System.out.println(" Realizando una llamada ...");
	}

	public String verCaracteristicas() {
		return " Marca: " + marca + "\n IMEI: " + imei;
	}

	public String verCaracteristicasconID() {
		return " Marca: " + marca + "\n IMEI: " + imei + "\n ID: " + id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getImei() {
		return imei;
	}

	

	// final no permite cambiar el valor después asignarlo
	// un setter implica que el valor se puede cambair
	// IMEI
//	public void setImei(int imei) {
//		this.imei = imei;
//	}
	
	//23.01
	@Override
	public String toString() {
		return "Mobile [marca=" + marca + ", imei=" + imei + ", id=" + id + "]";
	}
	

}