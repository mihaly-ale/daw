package UT03_T01_01_MOVIL;

public class Mobile {

	private String marca;
	private final int imei;
	private int id;
	
	//
//	private String gama;
	private Gama gama;
	//

	private static int identSgte = 1; // estática pertenece a la clase


	public Mobile(String marca, int imei, String gama) {
		this.marca = marca;
		this.imei = imei;		
		this.id = identSgte++;
	
//		Gama mobileGama = Enum.valueOf(Gama.class, gama.toUpperCase());
//		this.gama = mobileGama.toString();
		
		this.gama = Gama.valueOf(gama.toUpperCase());
	}
	
	

	// métodos personalizados
	public void realizarLalamadas() {
		System.out.println(" Realizando una llamada ...");
	}


	public String verCaracteristicas() {
		return " Marca: " + marca + "\n IMEI: " + imei + "\n ID: " + id + "\n Gama: " + gama;
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

	
	//23.01
//	@Override
//	public String toString() {
//		return "Mobile [marca=" + marca + ", imei=" + imei + ", id=" + id + "]";
//	}
	

}