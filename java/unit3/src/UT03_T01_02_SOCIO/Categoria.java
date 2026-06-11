package UT03_T01_02_SOCIO;

public enum Categoria {
	BASICA("Incluye acceso al gimnaio en horario estánder.", 25.0),
	PREMIUM("Incluye acceso completo + clases dirigidas.", 40.0),
	PLATINO("Incluye todo el anterior+ entrenador personal.", 60.0);

	private final String beneficios;
	private final double precioCuota;


	private Categoria(String beneficios, double precioCuota) {
		this.beneficios = beneficios;
		this.precioCuota = precioCuota;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public double getPrecioCuota() {
		return precioCuota;
	}

}
