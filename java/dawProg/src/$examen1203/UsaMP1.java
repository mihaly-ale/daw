package $examen1203;

public class UsaMP1 {


	public static void main(String[] args) {
		System.out.println("=== Ana ===");
		Usuario ana = new Usuario("Ana", 1000);
		ana.ingresar(200);
		System.out.println("Saldo nuevo de Ana: " + ana.getSaldo());
		
		System.out.println("\n=== Miguel ===");
		Usuario miguel = new Usuario("Miguel", 2000);	
		miguel.descontar(4000);
		System.out.println("Saldo nuevo de Miguel (descontar 4k): " + miguel.getSaldo());
		miguel.descontar(1000);		
		System.out.println("Saldo nuevo de Miguel (descontar 1k): " + miguel.getSaldo());	
		
	}
}
