package $examen_1203;

public class Usuario {
	
	private String nombre;
	private double saldo;
	
	// const
	public Usuario(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}	
	
	public void ingresar(double amount) {
		this.saldo += amount;
	}
	
	public boolean descontar(double amount) {
		if (tieneSaldoSuficiente(amount)) {
			this.saldo -= amount;
			System.out.println("Saldo de " + getNombre() + ": "+ getSaldo());
			return true;
		} else {
			System.out.println("Saldo insuficiente. " + getNombre() + " solo tiene " + getSaldo() + ".");		
			
			return false;
		}
		
	}
	
	public boolean tieneSaldoSuficiente(double amount) {
		return getSaldo() > amount ? true : false;
	}

	// getters, setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	}



