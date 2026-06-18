package $examen_1203_redo;

public class UsuarioX {
	String nombre;
	double saldo;

	public UsuarioX(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public boolean tieneSaldosuficiente(double cantidad) {
		if (cantidad >= saldo) {			
			System.out.println("no tiene saldo suficiente");
			return false;
		} else {
			System.out.println("tiene saldo suficiente");
			return true;
		}
		
	}

	public void ingresar(double ingreso) {
		this.saldo += ingreso;
		System.out.println("Saldo nuevo: " + saldo);
	}

	public boolean descontar(double cantidad) {
		if (tieneSaldosuficiente(cantidad)) {
			this.saldo -= cantidad;
			System.out.println("Saldo nuevo: " + saldo);
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}

	}

}
