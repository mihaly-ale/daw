package UT03_T02_01_CENTROEDUCATIVO;

public enum ModuloDAW1 {

	LMSGI("0373", "Lenguajes de marcas sistemas de gestión información", 102, 3, "obligatorio"),
	SINF("0483", "Sistemas informáticos", 170, 5, "obligatorio"), BDD("0484", "Base de datos", 170, 5, "obligatorio"),
	PROG("0485", "Programación", 272, 8, "obligatorio"), EDES("0487", "Entornos de desarrollo", 68, 2, "obligatorio"),
	INGLES("0179", "Inglés profesional", 68, 2, "obligatorio"), IPE("1709", "Itinerario personal para la empleabilidad I", 102, 3, "obligatorio"),
	OPT_1("0999", "Módulo Optativo I", 34, 2, "opcional");

	private String codigo;
	private String nombre;
	private int horas_totales;
	private int horas_semanales;
	private String tipo;

	private ModuloDAW1(String codigo, String nombre, int horas_totales, int horas_semanales, String tipo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horas_totales = horas_totales;
		this.horas_semanales = horas_semanales;
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getHoras_totales() {
		return horas_totales;
	}

	public int getHoras_semanales() {
		return horas_semanales;
	}
	
	public String getTipo() {
		return tipo;
	}

}
