package tema2.EmpleadosConMVC.modelo;

import java.nio.file.Path;
import java.util.ArrayList;

public class GestorEmpleados {
	private Path ruta;	
	
	public GestorEmpleados(Path ruta) {
		this.ruta = ruta;
	}
	
	public ArrayList<Empleado> leerEmpleados() {
		CrearFichero cf = new CrearFichero(this.ruta);
		// NOTA: Hay que crear una instancia, porque leerFichero no es estático
		return cf.leerFichero();
	}	
}
