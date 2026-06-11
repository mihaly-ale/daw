package stringbuilder;

public class stringbuilder {

	public static void main(String[] args) {
		// un String pero mutable
		// mantiene un array
		// su longitud es dinamico, pero se inicializa
		
		StringBuilder sb = new StringBuilder();
		System.out.println("sb longitud " + sb.length()); // su longitud es 0 por defecto
		
		System.out.println("\nmetodos de StringBuilder");
		System.out.println("sb.capacity()");
		System.out.println(" capacidad antes append " + sb.capacity()); //16 por defecto
		sb.append("Hola");
		System.out.println(" capacidad despues append \"Hola\": " + sb.capacity()); //16
		sb.append("MundoMundoMundo");
		System.out.println("\n cap despues add \"MundoMundoMundo\": " + sb.capacity()); // 34
		// aumenta automaticamente
		
		System.out.println("\nsb.insert()");
		sb.insert(4,  " querido ");
		System.out.println(" " + sb); // Hola querido MundoMundoMundo
		System.out.println(" longitud: " + sb.length()  + " =/= capacidad: " + sb.capacity());
		
		System.out.println("\nsb.delete()");
		sb.delete(4, 12);
		System.out.println(" " + sb); // Hola MundoMundoMundo
		
		System.out.println("\nsb.toString()");
		String resultado = sb.toString();
		System.out.println(" " + resultado);

	}

}
