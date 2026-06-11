package movil;

public class Movil {

	private String marca;
	private String gama;
	private String color;

	public Movil() {
		this.marca = "Nokia 3210";
	}

	public Movil(String marca) {
		this.marca = marca;
	}

	public Movil(String marca, String gama, String color) {
		this.marca = marca;
		this.color = gama;
		this.gama = color;
	}

	public String verCaracteristicas() {
		return " Marca: " + marca + "\n Color: " + color + "\n Gama: " + gama;
	}
}
