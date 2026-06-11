package examen_recup_2o;

abstract public class Paquete {

	private String codigo;
	private double costeBase;
	private double pesoKg;

	public Paquete(String codigo, double pesoKg, double costeBase) {
		this.codigo = codigo;
		
		if (pesoKg == 0.0d) {
			throw new PesoNegativoException("Peso no puede ser 0 o menos.");
		}
		this.pesoKg = pesoKg;
		this.costeBase = costeBase;
	}

	abstract double calcularCosteEnvio();

	abstract String generarEtiqueta();

	// getters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getCosteBase() {
		return costeBase;
	}

	public void setCosteBase(double costeBase) {
		this.costeBase = costeBase;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

}
