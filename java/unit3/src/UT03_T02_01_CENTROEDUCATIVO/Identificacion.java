package UT03_T02_01_CENTROEDUCATIVO;

public record Identificacion(String id) {

	public Identificacion {
		if (id == null || id.isBlank())
			throw new IdInvalidoExcepcion("El ID no puede ser nulo o vacío.", id);

		id = id.toUpperCase().replaceAll("[\\s-]", ""); // norm

		validarId(id);

	} // contructor compacto

	// metodos de validaciones
	public void validarId(String idNorm) throws IdInvalidoExcepcion {
		String strValidacion = "TRWAGMYFPDXBNJZSQVHLCKE";

		if (!idNorm.matches("^[XYZ\\d]{1}\\d{7}[A-Z]{1}$")) {
			throw new IdInvalidoExcepcion("El formato de ID no es válido.", id);
		} else {
			String idConvertido = idNorm.substring(0, 1).matches("[XYZ]") == true ? convertirNie(idNorm) : idNorm;
			
			String digitosId = idConvertido.substring(0, idConvertido.length() - 1);
			String letraId = idConvertido.substring(idConvertido.length() - 1);
			int indice = Integer.parseInt(digitosId) % 23;		
			
			System.out.println("letra " + letraId + "\n " + strValidacion.charAt(indice)); // helper log

			if (indice != strValidacion.indexOf(letraId)) {
				throw new IdInvalidoExcepcion("El formato de ID no es válido.", id);
			}
		}

	} // validarDNi

	public String convertirNie(String idNorm) {
		String primLetra = idNorm.substring(0, 1);

		switch (primLetra) {
		case "X":
			primLetra = "0";
			break;
		case "Y":
			primLetra = "1";
			break;
		case "Z":
			primLetra = "2";
			break;
		}

		return primLetra +  idNorm.substring(1);
	} // convertirNie

}
