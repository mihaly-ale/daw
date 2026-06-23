package tema2.EmpleadosConMVC.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Ventanas.uBorders;

public class VentanaVisualizarEmpleados extends JFrame {
	// seed
	private String[] labels = { "Nombre", "Sueldo", "Fecha contrato", "Departamento", "Tipo", "Incentivo" };
	private String[] iconos = { "◀◀", "◀", "▶", "▶▶" };
	private String[] tipoTrabajadores = { "empleado", "jefe" };

	// componentes
	private JTextField[] JTextFields = new JTextField[labels.length];
	// posición 4 es null - Tipo no crea JTextField, sino botones del grupo
	private JLabel[] JLabels = new JLabel[labels.length];
	private JButton[] JButtons = new JButton[iconos.length];
	private JRadioButton[] JRadioButtons = new JRadioButton[tipoTrabajadores.length];
	private JLabel labelPagination = new JLabel("");

	public VentanaVisualizarEmpleados() {
		setTitle("Visualizar Empleados");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// wrapper
		JPanel contenido = new JPanel();
		contenido.setLayout(new BoxLayout(contenido, BoxLayout.Y_AXIS));
		// panel superior
		JPanel datosPanel = crearPanelDatos();
		// panel inferior
		JPanel navegacionPanel = crearPanelNavegacion();

		// a JFrame
		contenido.add(datosPanel);
		contenido.add(Box.createVerticalStrut(10));
		contenido.add(navegacionPanel, BorderLayout.SOUTH);
		// System.out.println(this.getLayout()); // por defecto es BorderLayout
		add(contenido);
		pack();

		this.mostrarSinEmpleados();

		// FIXME: delete !!!
		// ******* TEST *******
//		populateFields.populate(JTextFields, "abcdefg");
		// *******************

	}

	// CREADOR DE PANELES
	// I. Panel de datos
	private JPanel crearPanelDatos() {
		JPanel panel = new JPanel();
		LayoutManager gridColumn = new GridLayout(labels.length, 2);
		int anchoTextField = 12;

		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "Datos"));
		panel.setLayout(gridColumn);

		// fila
		for (int i = 0; i < labels.length; i++) {
			JPanel fila = new JPanel(new BorderLayout());
			// NOTE: JPanel por defecto es FlowLayout

			if (labels[i].equals("Tipo")) {
				JLabels[i] = new JLabel(labels[i] + ":");
				fila.add(JLabels[i], BorderLayout.WEST);

				ButtonGroup btnGrupoLogical = new ButtonGroup();
				JPanel btnGrupoFisical = new JPanel();
				for (int j = 0; j < tipoTrabajadores.length; j++) {
					// agrupamiento lógica (seleccioner vs deseleccioanr)
					JRadioButtons[j] = new JRadioButton(tipoTrabajadores[j]);
					btnGrupoLogical.add(JRadioButtons[j]);

					// agrupamiento fisíco
					btnGrupoFisical.add(JRadioButtons[j]);
				}
				fila.add(btnGrupoFisical, BorderLayout.EAST);

			} else {
				JLabels[i] = new JLabel(labels[i] + ":");
				fila.add(JLabels[i], BorderLayout.WEST);

				JTextFields[i] = new JTextField();
				JTextFields[i].setColumns(anchoTextField);
				fila.add(JTextFields[i], BorderLayout.EAST);
			}

			fila.add(Box.createHorizontalStrut(50), BorderLayout.CENTER, 1);
			panel.add(fila);
		}

		return panel;
	}

	// II. Panel de navegacion
	private JPanel crearPanelNavegacion() {
		JPanel panel = new JPanel();

		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "Navegación"));

		for (int i = 0; i < iconos.length; i++) {
			JButtons[i] = new JButton(iconos[i]);
			panel.add(JButtons[i]);
		}

		panel.add(labelPagination, 2);
		// GOTO: linea 170
		return panel;
	}

	public void mostrarSinEmpleados() {

		for (JTextField f : JTextFields) {
			if (f != null) {
				f.setText("");
			}
		}

		for (JRadioButton rb : JRadioButtons) {
			rb.setSelected(false);
		}

		getLabelPagination().setText("0/0");
	}

	public void mostrarEmpleado(String nombre, String sueldo, String fechaContrato, String departamento, boolean esJefe,
			String incentivo, int indiceActual, int cantidadEmpleados) {

		getJTextField(0).setText(nombre);
		getJTextField(1).setText(sueldo);
		getJTextField(2).setText(fechaContrato);
		getJTextField(3).setText(departamento);
		getJRadioButton(esJefe ? 1 : 0).setSelected(true);
		getJTextField(5).setText(esJefe ? incentivo : "0");
		getLabelPagination().setText(String.valueOf(indiceActual) + "/" + String.valueOf(cantidadEmpleados));
	}

	// *****************************************
	// GETTERS AND SETTERS
	public JButton[] getJButtons() {
		return JButtons;
	}

	public JButton getJButton(int indice) {
		return JButtons[indice];
	}

	public JTextField getJTextField(int indice) {
		if (indice == 4) {

			System.err.println(
					"Indice 4 es el de \"Tipo\": no es un JTextField. Para \"Incentivo\" solicita el indice 5");
		}
		return JTextFields[indice];
	}

	public JRadioButton getJRadioButton(int indice) {
		return JRadioButtons[indice];
	}

	public JLabel getLabelPagination() {
		return labelPagination;
	}

	// ACTIONLISTENER
	public void conectarControlador(ActionListener al) {
		for (JButton b : this.getJButtons()) {
			b.addActionListener(al);
		}
	}

}

// https://docs.oracle.com/javase/8/docs/api/java/awt/Container.html#add-java.awt.Component-int-
/*
 * public Component add(Component comp, int index)
 * 
 * Adds the specified component to this container at the given position. This is
 * a convenience method for addImpl(java.awt.Component, java.lang.Object, int).
 * 
 * This method changes layout-related information, and therefore, invalidates
 * the component hierarchy. If the container has already been displayed, the
 * hierarchy must be validated thereafter in order to display the added
 * component.
 * 
 * Parameters: comp - the component to be added index - the position at which to
 * insert the component, or -1 to append the component to the end Returns: the
 * component comp
 * 
 */
