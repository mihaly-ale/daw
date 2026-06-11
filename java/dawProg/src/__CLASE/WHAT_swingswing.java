package __CLASE;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class WHAT_swingswing {
	public static void main(String[] args) {
		
		// -- 1
		/*
		JOptionPane.showMessageDialog(
				null, // componentePadre
				"Operacion completada", // mensaje
				"Ejemplo: ShowMessagDialog", // titulo				
				JOptionPane.QUESTION_MESSAGE); // tipoMensaje - icono
		*/
		
		// -- 2
		/*
		int valor = JOptionPane.showConfirmDialog(null,
				"¿Seguro?",
				"Ejemplo: Confirmación",
				JOptionPane.YES_NO_CANCEL_OPTION);
		
		System.out.println(valor); // what are the valores returned
		*/
		
		// -- 3
		/*
		String nombre = JOptionPane.showInputDialog(null,
				"Nombre?",
				"Datos personales",
				JOptionPane.QUESTION_MESSAGE);
		
		System.out.println(nombre);
		*/
		
		// -- 4
		/*
		JFrame miVentana = new JFrame("Ejemplo: JFrame");
		
		miVentana.setSize(300, 200);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLocationRelativeTo(null);
		miVentana.setVisible(true);
		*/
		
	}
}