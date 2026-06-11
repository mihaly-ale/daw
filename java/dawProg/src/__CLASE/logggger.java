package __CLASE;

import java.util.ArrayList;
import java.util.logging.Logger;

class CuentaBancaria {

	private int saldo;
	private final ArrayList<String> logs = new ArrayList<>();

// porque sus constructor es protected
	private Logger logger = Logger.getLogger("CuentaBancaria");

	public CuentaBancaria(int saldoInicial) {
		this.saldo = saldoInicial;

		 logger.info("Cuenta creada");
		 logger.warning("Warning: mensaje");
		 logger.severe("Severe: mensaje");
		 logger.info("Cuenta creada con saldo inicial de " + saldoInicial);	
		 
		 registrar("cuenta creada", "INFO");
	}

	public void depositar(int cantidad) {
		saldo += cantidad;
	}

	public void retirar(int cantidad) {
		if (cantidad > saldo) {
			// logger.severe("Saldo insuficiente para retirar " + cantidad);
			return;
		}
		saldo -= cantidad;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + "]";
	}
	
	 private void registrar(String mensaje, String nivel) {
	        switch (nivel) {
	            case "INFO":
	                logger.info(mensaje);
	                break;
	            case "WARNING":
	                logger.warning(mensaje);
	                break;
	            case "SEVERE":
	                logger.severe(mensaje);
	                break;
	        }
	        logs.add(nivel + ": " + mensaje); // ← SE GUARDA EN EL ARRAYLIST
	    }
	 
	 public ArrayList<String> getLogs() {
	        return logs;
	    }
	

}

public class logggger {
	public static void main(String[] args) {

		CuentaBancaria cuenta = new CuentaBancaria(100);

		cuenta.depositar(50);
		cuenta.retirar(20);
		cuenta.retirar(200); // produce error en el logger
		

		System.out.println(cuenta);
		
		System.out.println("---- LOGS GUARDADOS ----");
        for (String log : cuenta.getLogs()) {
            System.out.println(log);
        }
	}
}
