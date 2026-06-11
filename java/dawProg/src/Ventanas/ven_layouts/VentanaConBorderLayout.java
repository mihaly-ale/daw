package Ventanas.ven_layouts;
// 30.04

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaConBorderLayout extends JFrame {

	public VentanaConBorderLayout() {
		setSize(500, 500);
		setTitle("setLAyout(new BorderLayout()) en el panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLocationRelativeTo(null);
		setLayout(null); // => absolute positioning, no adminstrador del diseño

		iniciarComponentes();
	}

	public void iniciarComponentes() {

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 300, 300); 
		// NOTE:no admin de diseño en el padre exige el setBounds()
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK),
				"Botones con BorderLayout"));

		panel.setLayout(new BorderLayout());
		// https://docs.oracle.com/javase/8/docs/api/java/awt/BorderLayout.html

		JButton b1 = new JButton("Uno");
		JButton b2 = new JButton("Dos");
		JButton b3 = new JButton("Tres");
		JButton b4 = new JButton("Cuatro");
		b4.setBounds(60, 60, 40, 40); 
		// se ignora, porque el Adminstrador de Diseño gestiona el posicionamiento

		panel.add(b1, BorderLayout.NORTH);
		panel.add(b2, BorderLayout.SOUTH);
		panel.add(b3, BorderLayout.WEST);
		panel.add(b4); // En ausencia, se utiliza por defecto el CENTRO

		System.out.println("\tb4: " + b4.getWidth()); //40
		// No es el valor final;
		// en este punto, el Layout Manager todavía no se ha ejecutado.                                    

		add(panel);
	}

}

// https://docs.oracle.com/javase/8/docs/api/java/awt/Container.html
/*
 * public class Container extends Component
 * 
 * A generic Abstract Window Toolkit(AWT) container object is a component that
 * can contain other AWT components.
 * 
 * public void add(Component comp, Object constraints) 
 * NOTE:SOBRECARGADO (..., int index) ▼▼▼
 * 
 * Adds the specified component to the end of this container. Also notifies the
 * layout manager to add the component to this container's layout using the
 * specified constraints object
 * 
 *  - ▶▶▶ index - the position in the container's list at which to insert the
 * component; -1 means insert at the end component
 * 
 */
