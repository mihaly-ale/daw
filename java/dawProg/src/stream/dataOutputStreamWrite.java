package stream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class dataOutputStreamWrite {

	public static void main(String[] args) {

		String dirPathSchool = "C:" + File.separator + "Users" + File.separator + "mihaly.ale" + File.separator
				+ "OneDrive - Educacyl" + File.separator + "PROG" + File.separator + "prog-ws" + File.separator
				+ "dawProg" + File.separator + "src" + File.separator + "stream" + File.separator + "creados";

		String dirPathHome = "F:" + File.separator + "DAW" + File.separator + "OneDrive - Educacyl" + File.separator
				+ "PROG" + File.separator + "prog-ws" + File.separator + "dawProg" + File.separator + "src"
				+ File.separator + "stream" + File.separator + "creados";

		String fichero = "misDatosDOS.dat";

		// NOTE: checking if at home or school, and setting correct path
		String validPath;

		if (filechecks.fileValidator.resolveExistingPath(dirPathHome)) {
			validPath = dirPathHome + File.separator + fichero;
		} else {
			validPath = dirPathSchool + File.separator + fichero;
		}

		metodosDeDataOutputStream(validPath);
	} // main

	private static void metodosDeDataOutputStream(String dirPathHome) {
		// DataOutputStream tine un constructor con OutputSream (abstracto) =>
		// FileOutputStream
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(dirPathHome, true));) {
			// true para append
			System.out.println("Tamaño de \"misDatosDOS.dat\" antes de escribir " + dos.size() + ".\n");
			System.out.println("Guardar en " + dirPathHome + ".\n");

			// escribir
			// methods
			dos.writeBoolean(true); // boolean -> 1 byte
			dos.writeByte(127); // byte -> 1 byte
			dos.writeShort(32000); // short -> 2 bytes
			dos.writeChar('A'); // char -> 2 bytes
			/// NOTE: UTF -> 2 bytes (longitud) + 1byte por carácter
			dos.writeUTF("Hola Mundo"); // 12 bytes

			System.out.println("bytes escritos " + dos.size()); // bytes escritos 18
			/*
			 * => contenido } A Hola Mundo
			 */

			// **************** añadir, no sobreescibir
			// new DataOutputStream(new FileOutputStream(filePath) =>
			// DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath,
			// true))
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}

/*
 * /// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/
 * DataOutputStream.html
 * 
 * => constructor: DataOutputStream(OutputStream out) => public abstract class
 * OutputStream extends Object ⬇️⬇️⬇️⬇️ NOTE: DataOutputStream dos = new
 * DataOutputStream(new FileOutputStream());
 * 
 */