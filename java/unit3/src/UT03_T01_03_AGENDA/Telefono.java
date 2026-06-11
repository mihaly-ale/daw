package UT03_T01_03_AGENDA;

import java.util.Objects;

public class Telefono {
	private TipoTelefono tipo;
	private String numero;
	private String etiqueta;

	public Telefono(String tipo, String numero, String etiqueta) {

		Validacion.validarCadenaNuloVacio(tipo, "Tipo de teléfono");

		try {
			this.tipo = Enum.valueOf(TipoTelefono.class,tipo.toUpperCase());
		} catch (Exception e) {
			throw new IllegalArgumentException(
					"Tipo de teléfono inválido. Debe ser personal, casa, trabajo, emergencia o otro.");
		}

		Validacion.validarCadenaNuloVacio(numero, "Número de teléfono");
		validarFormatoTelefono(numero);
		this.numero = numero.replaceAll("[\s-]", "");

		this.etiqueta = (etiqueta != null) ? etiqueta.trim() : "";
	}

	// validar formato
	private void validarFormatoTelefono(String numTelefono) {

		if (!numTelefono.matches("[976][0-9]{2}[\s-]*[0-9]{3}[\s-]*[0-9]{3}")) {
			throw new IllegalArgumentException("Formato de teléfono es inválido. Debe tener el formato 'nnn-nnn-nnn'"
					+ " y empezar con 9, 7 o 6.");
		}
	}

	@Override
	public String toString() {
		return "Telefono [tipo=" + tipo + ", numero=" + numero + ", etiqueta=" + etiqueta + "]\n\t\t";
	}

	public TipoTelefono getTipo() {
		return tipo;
	}

	public String getNumero() {
		return numero;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

}
