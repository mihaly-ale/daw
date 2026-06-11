package tipos;

public class parsearDatos {
	enum UnidadAngulo {
		GRADOS, RADIANES
	}

	public static void main(String[] args) {
		// valores de angulo - with enum 
		String tipoAngulo  = "GRADOS"; // entrada puede ser Graaaaados
		UnidadAngulo uA = UnidadAngulo.valueOf(tipoAngulo); // valueOf transforma		
		
		// Operaciones matemáticas
		String texto = "90";
		double grados = Double.parseDouble(texto);
		double radianes = Math.toRadians(grados); // argumento debe ser double
		System.out.println(Math.sin(radianes));
	}

}
