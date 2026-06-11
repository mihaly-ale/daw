package tipos;

public class wideningIntToFloat {
	public static void main(String[] args) {

		float y = 10f;
		int b = 3;
		y = b; // una conversión automatica por Java
		
		System.out.println("y: " + y);
		
	}
}
// implicit casting = widening
// Se puede hacer de forma segura, ya que no hay pérdida de datos.
