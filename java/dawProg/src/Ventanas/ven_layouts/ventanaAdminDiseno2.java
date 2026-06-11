package Ventanas.ven_layouts;
// 30.04

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class ventanaAdminDiseno2 extends JFrame {

	public ventanaAdminDiseno2(boolean sinLayout, String title) {
		setSize(500, 500);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		// con esto no enseña los componentes
		// SOLUTION: => hay que especificar el tamaño del los componen - setBounds()

		if (sinLayout) {
			// setLocationRelativeTo(null); // ◰
			iniciarCompSinLayout();
		} else {
			setLocationRelativeTo(null); // ▣
			iniciarCompConDefaultLayout();
		}
	} // ventanasAdminDiseno

	public void iniciarCompSinLayout() {

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 300, 320); // ⇐ ventanaAdminDiseno.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Botones con setLayout(null)"));

		panel.setLayout(null);
		// todos los componentes tiene que tener setBounds() para aparecer en la
		// pantalla, además los elementos se superponen
		// NOTE: absolute positioning

		JButton b1 = new JButton("Uno");
		b1.setBounds(20, 20, 70, 30);
		// con esto coloca el boton => panel.setLayout(null);
		JButton b2 = new JButton("Dos");
		b2.setBounds(40, 40, 70, 30);
		JButton b3 = new JButton("Tres");
		// primero hijos a Panel - establecer jerarquía
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);

		// *** - only for show text
		JTextPane label = new JTextPane();
		label.setBounds(10, 100, 280, 200);
		String b1pos = obtenerCords(b1);
		String b2pos = obtenerCords(b2);
		String b3pos = obtenerCords(b3);
		String text = "Button \"Tres\" es debajo del primero.\n\n\"setLayout(null)\" significa que los elemntos tienen que tener posición (bounds) en la pantalla.";
		label.setFont(new Font("Arial", Font.BOLD, 16));
		label.setText(text + "\n\n" + b1pos + "\n" + b2pos + "\n" + b3pos);
		panel.add(label);
		// ***

		// panel a JFrame ventanaAdminDiseno
		add(panel);
	}

	public void iniciarCompConDefaultLayout() {

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 400, 320); // ⇐ ventanaAdminDiseno.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Botones SIN setLayout => FlowLayout "));

		// panel.setLayout(null); // fallback es FlowLayout

		JButton b1 = new JButton("Uno");		
		JButton b2 = new JButton("Dos");		
		JButton b3 = new JButton("Tres");		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);

		// *** - only for show text
		JTextPane label = new JTextPane();
label.setBounds(10, 100, 280, 200);
		String b1pos = obtenerCords(b1);
		String b2pos = obtenerCords(b2);
		String b3pos = obtenerCords(b3);
		String text = "JPanel sin Administrador de Diseño \n\n" + panel.getLayout() + "\n";
		
		label.setFont(new Font("Arial", Font.BOLD, 16));
		label.setText(text + "\n" + b1pos + "\n" + b2pos + "\n" + b3pos);
		panel.add(label);
		// ***

		// panel a JFrame ventanaAdminDiseno
		add(panel);
	}

	public static String obtenerCords(JButton b) {
		return b.getText() + " - x: " + b.getX() + ", y: " + b.getY() + ", w: " + b.getWidth() + ", h: "
				+ b.getHeight();
	}
}
