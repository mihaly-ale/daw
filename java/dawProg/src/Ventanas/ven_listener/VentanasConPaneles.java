package Ventanas.ven_listener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanasConPaneles extends JFrame implements ActionListener {

	JButton btnOcultarRojo;
	JButton btnOcultarAzul;
	JPanel panelRojo;
	JPanel panelAzul;

	public VentanasConPaneles() {
		setSize(500, 500);
		// se usa sin Layout Manager, es decir GOTO: línea 26
		setTitle("Ventanas con panales");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);

		iniciarComponentes();
	}

	public void iniciarComponentes() {
		panelRojo = new JPanel(); // actionPerformed utiliza => variable de clase
		panelRojo.setBackground(Color.RED);
		panelRojo.setBounds(0, 0, 200, 300); // (x, y, ancho, alto)
		add(panelRojo);

		panelAzul = new JPanel(); // actionPerformed utiliza => variable de clase
		panelAzul.setBackground(Color.BLUE);
		panelAzul.setBounds(200, 0, 200, 300); // (x, y, ancho, alto)
		add(panelAzul);

		JPanel panelGreen = new JPanel();
		panelGreen.setBackground(Color.GREEN);
		panelGreen.setBounds(0, 300, 400, 100); // (x, y, ancho, alto)

		btnOcultarRojo = new JButton("Oculta panel rojo.");
		btnOcultarAzul = new JButton("Oculta panel azul.");

		panelGreen.add(btnOcultarRojo); // btn => panel => frame (containment hierarchy)
		panelGreen.add(btnOcultarAzul); // btn => panel => frame (parent-child relation)
		// NOTE: el hijo tiene que existir antes de añadir al padre
		/// imperative - how(JAVA) <=> what(HTML) declarative
		/// En java se escribe explícitamente

		btnOcultarAzul.addActionListener(this);
		btnOcultarRojo.addActionListener(this);

		add(panelGreen);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOcultarAzul) {

			if (panelAzul.isVisible()) {
				panelAzul.setVisible(false);
				btnOcultarAzul.setText("Revela panel azul.");
			} else {
				panelAzul.setVisible(true);
				btnOcultarAzul.setText("Oculta panel azul.");
			}

		} else {
			if (panelRojo.isVisible()) {
				panelRojo.setVisible(false);
				btnOcultarRojo.setText("Revela panel rojo.");
			} else {
				panelRojo.setVisible(true);
				btnOcultarRojo.setText("Oculta panel rojo.");
			}
		}

	}

}
