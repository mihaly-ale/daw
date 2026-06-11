package Ventanas.ven_listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// tiene que implementar la interface ActionListener para darle funcionalidad al boton

public class VentanaSumarRestar extends JFrame implements ActionListener {

	int nVeces = 0;
	JLabel etiqueta;
	JButton bSumar;
	JButton bRestar;

	// ****
	int pressCount = 0;
	JButton ultimoBtn = null;
	// ****

	// CONSTRUCTOR
	public VentanaSumarRestar() {

		setSize(400, 400);
		setTitle("Ventana con listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // centra la ventana
		setLayout(null); // Necesario para usar setBounds(x, y, width, height)

		iniciarComponentes();
	}

	public void iniciarComponentes() {

		// JLabel etiqueta = new JLabel("0"); //Aqui variable de metodo, mejor de clase
		// para otros metodos.

		etiqueta = new JLabel("0");
		etiqueta.setBounds(50, 10, 30, 40);

		add(etiqueta);

		// Ahora necesitan ser instanciados como variables de clase, no de método
		// NOTE: el ámbito tiene que ser de clase, para qué TODOS los métodos pueden
		// verlos
		// JButton bSumar = new JButton("Sumar");
		// JButton bRestar = new JButton("Restar");
		bSumar = new JButton("Sumar");
		bRestar = new JButton("Restar");

		bSumar.setBounds(50, 50, 300, 100);
		bRestar.setBounds(50, 200, 300, 100);

		bSumar.addActionListener(this);
		bRestar.addActionListener(this);
		// NOTE:
		/// Pone este objeto (this) a la escucha para poder recibir un evento,
		/// y cuando lo recibe ejecuta el metodo actioinPerformed

		add(bSumar);
		add(bRestar);

	}

	// sin implementar el método ERROR: => solo da error cuándo ejecuta el evento
	/// Unresolved compilation problem:
	/// The type VentanaSumarRestar must implement the inherited abstract method
	// ActionListener.actionPerformed(ActionEvent)
	@Override // Metodo de interface ActionListener
	public void actionPerformed(ActionEvent e) {

		// etiqueta.setText(String.valueOf(nVeces)); // por defecto 0, asi que esto no
		// es necesario

		JButton boton = (JButton) e.getSource();
		if (boton == ultimoBtn) { // al inciar el programa esto nunca es true => pressCount = 1
			pressCount++; // ultimoBtn has to be variable de class, para mantener valor en cada instancia
		} else {
			pressCount = 1;
			ultimoBtn = boton;
		}

		if (e.getSource() == bSumar) {
			etiqueta.setText(String.valueOf(++nVeces)); // incrementa
		} else if ((e.getSource() == bRestar)) {
			etiqueta.setText(String.valueOf(--nVeces)); // decrementa
		}

		System.out.println("He pulsado el boton " + ((JButton) e.getSource()).getText() + " " + pressCount + " veces.");
		// e.getSource() - Object => cast para ver métodos de JButton
	}
}

// EventObject
/*
 * public class EventObject extends Object ❕❕❕ implements Serializable
 * 
 * The root class from which all event state objects shall be derived.
 * 
 * All Events are constructed with a reference to the object, the "source", that
 * is logically deemed to be the object upon which the Event in question
 * initially occurred upon.
 * 
 * public Object getSource() The object on which the Event initially occurred.
 * 
 * Returns: the **object** on which the Event initially occurred
 */
