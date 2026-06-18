package $examen_0422;

public class PaqueteInternacional extends Paquete {

	String pais;
	double tasaAduana;
	double costeAddicional;

	public PaqueteInternacional(String codigo, double pesoKg, double costeBase, String pais, double tasaAduana,
			double costeAddicional) {
		super(codigo, pesoKg, costeBase);
		this.pais = pais;
		this.tasaAduana = tasaAduana;
		this.costeAddicional = costeAddicional;
	}

	@Override
	double calcularCosteEnvio() {
		double importe = super.getCosteBase() + super.getPesoKg() * this.costeAddicional
				+ super.getCosteBase() * this.getTasaAduana();
		return importe;
	}

	@Override
	String generarEtiqueta() {
		String etiqueta = "[Internacional] Codigo: " + super.getCodigo() + " - " + "Pais: " + this.getPais() + " - "
				+ "Peso: " + super.getPesoKg();

		return etiqueta + " - Coste envío: " + Double.toString(calcularCosteEnvio()) + " €";
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getTasaAduana() {
		return tasaAduana;
	}

	public void setTasaAduana(double tasaAduana) {
		this.tasaAduana = tasaAduana;
	}

	public double getCosteAddicional() {
		return costeAddicional;
	}

	public void setCosteAddicional(double costeAddicional) {
		this.costeAddicional = costeAddicional;
	}

	// getters, setters

}
