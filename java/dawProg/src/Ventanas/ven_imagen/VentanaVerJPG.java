package Ventanas.ven_imagen;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO; // en java.desktop
import javax.swing.JFrame; // en java.desktop

class FrameVerJPG extends JFrame {

	private Image imagen; // superclass of classes that represent graphical images

	public FrameVerJPG(String path) {
		try {
			imagen = ImageIO.read(new File(path)); // load the image
		} catch (IOException e) {
			e.printStackTrace();
		}

		// configure widow
		setTitle("Imagen JPG");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true); // llama automáticamente a paint
	}

	// NOTE: paint llama automáticamente el sistema gráfico de Java (AWT/Swing)
	// se ejecuta automáticamente al llamar a setVisible(true)
	@Override
	public void paint(Graphics g) { // initial paint, sunsequnt repaints
		super.paint(g);
		g.drawImage(imagen, 0, 30, this);
	}
}

public class VentanaVerJPG {
	public static void main(String[] args) {
		String validPath = getValidPath();
		System.out.println(validPath);

		new FrameVerJPG(validPath);
	}

	public static String getValidPath() {

		String rutaImgCole = "C:" + File.separator + "Users" + File.separator + "mihaly.ale" + File.separator
				+ "OneDrive - Educacyl" + File.separator + "PROG" + File.separator + "prog-ws" + File.separator
				+ "unit4" + File.separator + "src" + File.separator + "UT04_Tema01_Ficheros" + File.separator + "resources"
				+ File.separator + "ImagenesJava" + File.separator + "AzulJava.jpg";

		String rutaImgCasa = "F:" + File.separator + "DAW" + File.separator + "OneDrive - Educacyl" + File.separator
				+ "PROG" + File.separator + "prog-ws" + File.separator + "unit4" + File.separator + "src"
				+ File.separator + "UT04_Tema01_Ficheros" + File.separator + "resources" + File.separator + "ImagenesJava"
				+ File.separator + "AzulJava.jpg";

		String validPath;

		if (filechecks.fileValidator.resolveExistingPath(rutaImgCasa)) {
			validPath = rutaImgCasa;
		} else {
			validPath = rutaImgCole;
		}

		return validPath;
	}

}