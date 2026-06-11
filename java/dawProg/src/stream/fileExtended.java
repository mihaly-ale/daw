package stream;

import java.io.File;

public class fileExtended {

	public static void main(String[] args) {
		/// 1: especificar ruta
		String sFichero = "F:\\DAW\\OneDrive - Educacyl\\PROG\\prog-ws\\dawProg\\src\\stream\\resources\\AzulJava.jpg";
		/// 2: crear File
		File fFichero = new File(sFichero);
		/// 3:
		System.out.println("Métodos de FILE:\n");
		System.out.println(fFichero.exists());
		System.out.println(fFichero.getName());
		System.out.println(fFichero.getParent());
		System.out.println(fFichero.getPath());
		System.out.println(fFichero.getAbsolutePath());
		System.out.println(fFichero.isFile());
		System.out.println(fFichero.isDirectory());

		System.out.println("\n**************\nAzulJava.jpg con ruta relativa");
		String relativePath = "..\\resources\\AzulJava.jpg"; // NOTE: relative path doesnt play good with File ???
		File relativePathFile = new File(relativePath);
		System.out.println(relativePathFile.exists());
		System.out.println("**************\n");

		System.out.println("\n**************\nAzulava.jpg - fichero no exsitente");
		String wrongPath = "..\\ImagenesJava\\Azulava.jpg";
		File FileWrongPath = new File(wrongPath);
		System.out.println(FileWrongPath.exists());
		System.out.println("**************\n");

		String dirStreamResources = "F:\\DAW\\OneDrive - Educacyl\\PROG\\prog-ws\\dawProg\\src\\stream\\creados";
		File dir = new File(dirStreamResources);
		String[] elementos = dir.list();

		String nombreDir = "repo";
		File repo = new File(dirStreamResources + File.separator + nombreDir);
		if (repo.exists()) {
			System.err.println("Repo already exists");
		} else {
			System.err.println("Creating repo");
			repo.mkdir();
		}

		System.out.println("contenido de dir (stream.resources)");
		for (String s : elementos) {
			System.out.println(s); // 2 ficheros and la carpeta repo
			// System.out.println(s.length()); //
		}

		System.out.println("\ntamaño de Azulava.jpg");
		String sFicheroRutaPortable = "F:" + File.separator + "DAW" + File.separator + "OneDrive - Educacyl"
				+ File.separator + "PROG" + File.separator + "prog-ws" + File.separator + "dawProg" + File.separator
				+ "src" + File.separator + "stream" + File.separator + "resources" + File.separator + "AzulJava.jpg";

		System.out.println((new File(sFicheroRutaPortable)).length());

	}
}

///
/*
 * https://docs.oracle.com/javase/8/docs/api/java/io/File.html#length-- public
 * long length()
 * 
 * Returns the length of the file denoted by this abstract pathname. The return
 * value is unspecified if this pathname denotes a directory.
 * 
 * Where it is required to distinguish an I/O exception from the case that 0L is
 * returned, or where several attributes of the same file are required at the
 * same time, then the Files.readAttributes method may be used.
 * 
 * Returns: The length, in bytes, of the file denoted by this abstract pathname,
 * or 0L if the file does not exist. Some operating systems may return 0L for
 * pathnames denoting system-dependent entities such as devices or pipes.
 * 
 */