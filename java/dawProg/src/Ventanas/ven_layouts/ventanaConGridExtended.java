package Ventanas.ven_layouts;
// 30.04

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventanaConGridExtended extends JFrame {

	public ventanaConGridExtended() {
		setSize(500, 500);
		setTitle("setLayout(new FlowLayout() en el panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// NOTE: con esto na vale, porque tenemos dos paneles para colocar
		// sin administrador
		// setLayout(null);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		// setLayout(new FlowLayout()); // por defecto es CENTER
		
		//*****************************************
		// stretches componentes (como display:flex NOTE: height is defined)
		//setLayout(new GridLayout(2,1));
		//*****************************************

		setResizable(false); // el usuario no se puede cambiar
		iniciarComponentes();

	}

	public void iniciarComponentes() {

		// 1.
		JPanel panelBotones = new JPanel();
		panelBotones
				.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Botones"));

		panelBotones.setLayout(new GridLayout(2, 2));

		JButton b1 = new JButton("Uno");
		JButton b2 = new JButton("Dos");
		JButton b3 = new JButton("Tres");

		panelBotones.add(b1);
		panelBotones.add(b2);
		panelBotones.add(b3);

		// 2.
		JPanel panelEtiquetas = new JPanel();
		panelEtiquetas
				.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Etiquetas"));
		JLabel e1 = new JLabel("Uno");
		JLabel e2 = new JLabel("Dos");
		JLabel e3 = new JLabel("Tres");

		panelEtiquetas.add(e1);
		panelEtiquetas.add(e2);
		panelEtiquetas.add(e3);

		// paneles a JFrame
		add(panelBotones);
		add(panelEtiquetas);
		
		// NOTE: esto es inválido, posicionamiento siempre en el padre
		// GOTO: línea 26
		// add(panelEtiquetas, FlowLayout.RIGHT);
	}

}
