package tema2.EmpleadosConMVC.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;

public class CrearFichero {

	private Path ruta;

	public CrearFichero(Path ruta) {
		this.ruta = ruta;
	}
	


	public void crearFichero(ArrayList<Empleado> lista) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta.toFile()))) {
			// NOTE: FileOutStream crea el fichero si la ruta es correcta

			oos.writeObject(lista);
			// escribir el arraylist al fichero
			System.out.println("Fichero creado correctamente.");

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.out.println("Error al leer el fichero.");
			e.printStackTrace();
		}
	}

	public ArrayList<Empleado> leerFichero() {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta.toFile()))) {
			// leer desde el fichero
			// NOTE: FileOutStream crea el fichero si la ruta es correcta
			
			empleados = (ArrayList<Empleado>) ois.readObject();
			// WARNING: Type safety: Unchecked cast from Object to ArrayList <Empleado>
			// GOTO: linea 75
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return empleados;
	}
}

// https://docs.oracle.com/javase/8/docs/api/java/io/FileOutputStream.html#FileOutputStream-java.io.File
/*
 * new FileOutputStream(file)
 * 
 * ✔ Creates the file if it does not exist ✔ Opens it for writing if it exists ❌
 * Does NOT create missing folders in the path
 * 
 * Path path = ruta;
 * 
 * Files.createDirectories(path.getParent());
 * https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html
 * 
 * try (ObjectOutputStream oos = new ObjectOutputStream(new
 * FileOutputStream(path.toFile()))) { // write objects }
 */

/*
 * Diferencia entre fichero interno (controlado) y externo (no confiable):
 * 
 * - Entorno controlado (misma aplicación, red interna):
 *   Serializable ya garantiza el tipo en escritura.
 *   Basta con @SuppressWarnings("unchecked") al leer.
 * 
 * - Fichero externo o no confiable:
 *   Usar instanceof ArrayList<?> y verificar cada elemento
 *   con instanceof para evitar ClassCastException.
 */

