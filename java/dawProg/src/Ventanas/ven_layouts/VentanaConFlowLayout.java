package Ventanas.ven_layouts;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaConFlowLayout extends JFrame {

	public VentanaConFlowLayout() {
		// setPreferredSize(new Dimension(500, 500));
		setSize(500, 500);
		setTitle("setLayout(new FlowLayout)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER));

		inciarComponentes();
	}

	public void inciarComponentes() {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

		int numBotones = 4;
		Color[] colors = { Color.ORANGE, Color.YELLOW, Color.CYAN, Color.LIGHT_GRAY, Color.PINK };

		for (int i = 0; i < numBotones; i++) {
			Random rnd = new Random();

			JButton btn = new JButton("Button " + i);
			btn.setBackground(colors[rnd.nextInt(colors.length)]);
			panel.add(btn);
		}

		JButton bigBtn = new JButton("Big Button");
		bigBtn.setPreferredSize(new Dimension(200,50));
		add(bigBtn);
		
		add(panel);
	}

}