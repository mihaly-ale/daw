package tema2.EmpleadosConMVC.Aplicacion;

import java.nio.file.Path;
import java.util.ArrayList;

import tema2.EmpleadosConMVC.modelo.CrearFichero;
import tema2.EmpleadosConMVC.modelo.DatosIniciales;
import tema2.EmpleadosConMVC.modelo.Empleado;

public class Usa2 {

	public static void main(String[] args) {

		Path rutaCarpeta = Path.of("F:", "code", "repos", "daw", "java", "unit4", "src", "tema2", "generados");		
		String nombreFichero = "empleados.txt";		
		Path ficheroEmpleados = Path.of(rutaCarpeta.toString(), nombreFichero);
		ArrayList<Empleado> listaInicial = DatosIniciales.crearLista();

		System.out.println("***************************");
		System.out.println("\"CreaFichero.escribirDatos()\": ");
		System.out.println("***************************\n");
		CrearFichero fichero = new CrearFichero(ficheroEmpleados);
		
		fichero.crearFichero(listaInicial);
		// NOTE: Empleado necesita implementar la interfaz Serializable
		// NOTE: public class Empleado implements Serializable
		// Serializable es una interfaz marcadora que permite convertir
		// objetos Empleado en una secuencia de bytes para guardarlos
		// en un fichero (o enviarlos por red) mediante ObjectOutputStream.
		
		
		System.out.println("\n\n***************************");
		System.out.println("\"CreaFichero.leerDatos()\": ");
		System.out.println("***************************\n");
		
		ArrayList<Empleado> listaDeFicheroCreado = fichero.leerFichero();
		
		
		System.out.println("\nRegistros del fichero creado:");
		for (Empleado e: listaDeFicheroCreado) {
			System.out.println("\t" + e.toString());
		}
}
}