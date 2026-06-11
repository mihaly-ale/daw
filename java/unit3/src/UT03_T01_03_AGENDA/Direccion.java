package UT03_T01_03_AGENDA;

public class Direccion {
	private TipoDireccion tipo;
	private String ciudad;
	private String provincia;
	private String codigoPostal;
	private String pais;
	private String etiqueta;
	
	
	public Direccion(String tipo, String ciudad, String provincia, String codigoPostal, String pais,
			String etiqueta) {
		
		
		Validacion.validarCadenaNuloVacio(tipo, "Tipo de dirección");
		try {
			this.tipo = Enum.valueOf(TipoDireccion.class, tipo.replaceFirst(" ", "_").toUpperCase());
		} catch (Exception e) {
			throw new IllegalArgumentException(
					"Tipo de dirección inválido. Debe ser casa, trabajo, segunda residencia o otro.");  
		}
		
		this.ciudad = Validacion.validarCadenaNuloVacio(ciudad, "Ciudad");
		this.provincia = (provincia != null) ? provincia.trim() : " ";
		
		Validacion.validarCadenaNuloVacio(codigoPostal, "Código postal de dirección");
		validarFormatoCodigoPostal(codigoPostal);
		this.codigoPostal = codigoPostal;		
		
		this.pais = Validacion.validarCadenaNuloVacio(pais, "Pais  de dirección");
		this.etiqueta = (etiqueta != null) ? etiqueta.trim() : " ";
	}

	// validar formato
	private void validarFormatoCodigoPostal(String codigoPostal) {
		
		if (!codigoPostal.matches("(0[1-9]|[1-4][0-9]|5[0-2])[0-9]{3}")) {
			throw new IllegalArgumentException("Formato de código postal es inválido. Debe tener 5 digitos, y los dos primeros deben ser entre 01 y 52");
		}
	}
	@Override
	public String toString() {
		return "\n\t\t"
				+ "Direccion [tipo=" + tipo + ", ciudad=" + ciudad + ", provincia=" + provincia + ", codigoPostal="
				+ codigoPostal + ", pais=" + pais + ", etiqueta=" + etiqueta + "]\n\t\t";
	}
	
	// getters y setters
	
	
}


