package Ventanas.ven_layouts;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaConGrid extends JFrame {

	public VentanaConGrid() {
		setSize(500, 500);
		setTitle("setLayout(null)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		// => se utiliza setBounds() para ver el panel GOTO: línea 30

		// NOTE: con BorderLayout (layout por defecto del JFrame)
		// el panel se expande y ocupa todo el espacio disponible con el constraint CENTRO
		// poner POR DEFECTO es no poner la decalaración 📢📢📢
		iniciarComponentes();
	}

	public void iniciarComponentes() {

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 300, 300);
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK),
				"Botones con GridLayout"));

		panel.setLayout(new GridLayout(2, 2));

		JButton b1 = new JButton("Uno");
		JButton b2 = new JButton("Dos");
		JButton b3 = new JButton("Tres");

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);

		add(panel);
	}

}
