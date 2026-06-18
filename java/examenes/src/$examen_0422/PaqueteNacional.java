package $examen_0422;

public class PaqueteNacional extends Paquete {

	String provincia;
	double costeAddicional;

	public PaqueteNacional(String codigo, double pesoKg, double costeBase, String provincia, double costeAddicional) {
		super(codigo, pesoKg, costeBase);
		this.provincia = provincia;
		this.costeAddicional = costeAddicional;
	}

	@Override
	double calcularCosteEnvio() {
		double importe = super.getCosteBase() + super.getPesoKg() * this.costeAddicional;
		return importe;
	}

	@Override
	String generarEtiqueta() {
		String etiqueta = "[Nacional] Codigo: " + super.getCodigo() + " - " + "Provincia: " + this.getProvincia()
				+ " - " + "Peso: " + super.getPesoKg();

		return etiqueta + " - Coste envío:  " + Double.toString(calcularCosteEnvio()) + " €";
	}

	// getters, setters
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public double getCosteAddicional() {
		return costeAddicional;
	}

	public void setCosteAddicional(double costeAddicional) {
		this.costeAddicional = costeAddicional;
	}

}
