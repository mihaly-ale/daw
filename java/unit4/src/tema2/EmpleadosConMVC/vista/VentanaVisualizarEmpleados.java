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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VentanaVisualizarEmpleados extends JFrame {
	// seed
	private String[] labels = { "Nombre", "Sueldo", "Fecha contrato", "Departamento", "Tipo", "Incentivo" };
	private String[] iconosNavegacion = { "◀◀", "◀", "▶", "▶▶" };
	private String[] tipoTrabajadores = { "empleado", "jefe" };
	private String[] filtroButtonLabels = { "Aplicar", "Limpiar" };
	private String[] departamentoCheckboxLabels = { "Contabilidad", "Informática", "RRHH", "Ventas" };

	// componentes
	// => filtro
	private JCheckBox[] checkboxesDepartamento = new JCheckBox[departamentoCheckboxLabels.length];
	private JCheckBox[] checkboxesTipo = new JCheckBox[tipoTrabajadores.length];
	private JButton[] botonesFiltro = new JButton[filtroButtonLabels.length];
	// => datos
	private JTextField[] camposTexto = new JTextField[labels.length];
	// posición 4 es null - Tipo no crea JTextField, sino botones del grupo
	private JLabel[] etiquetasCampo = new JLabel[labels.length];
	// => navegación
	private JButton[] botonesNavegacion = new JButton[iconosNavegacion.length];
	private JRadioButton[] botonesRadio= new JRadioButton[tipoTrabajadores.length];
	private JLabel etiquetaPaginacion = new JLabel("");

	public VentanaVisualizarEmpleados() {
		setTitle("Visualizar Empleados");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// wrapper
		JPanel contenido = new JPanel();
		contenido.setLayout(new BoxLayout(contenido, BoxLayout.Y_AXIS));
		JPanel filtroPanel = crearPanelFiltros();
		JPanel datosPanel = crearPanelDatos();
		JPanel navegacionPanel = crearPanelNavegacion();

		// agregar paneles
		contenido.add(filtroPanel);
		contenido.add(Box.createVerticalStrut(10));
		contenido.add(datosPanel);
		contenido.add(Box.createVerticalStrut(10));
		contenido.add(navegacionPanel);
		// System.out.println(this.getLayout()); // por defecto es BorderLayout
		add(contenido);
		pack();

		this.mostrarSinEmpleados();
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
				etiquetasCampo[i] = new JLabel(labels[i] + ":");
				fila.add(etiquetasCampo[i], BorderLayout.WEST);

				ButtonGroup btnGrupoLogical = new ButtonGroup();
				JPanel btnGrupoFisical = new JPanel();
				for (int j = 0; j < tipoTrabajadores.length; j++) {
					// agrupamiento lógica (seleccioner vs deseleccioanr)
					botonesRadio[j] = new JRadioButton(tipoTrabajadores[j]);
					btnGrupoLogical.add(botonesRadio[j]);

					// agrupamiento fisíco
					btnGrupoFisical.add(botonesRadio[j]);
				}
				fila.add(btnGrupoFisical, BorderLayout.EAST);

			} else {
				etiquetasCampo[i] = new JLabel(labels[i] + ":");
				fila.add(etiquetasCampo[i], BorderLayout.WEST);

				camposTexto[i] = new JTextField();
				camposTexto[i].setColumns(anchoTextField);
				fila.add(camposTexto[i], BorderLayout.EAST);
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

		for (int i = 0; i < iconosNavegacion.length; i++) {
			botonesNavegacion[i] = new JButton(iconosNavegacion[i]);
			panel.add(botonesNavegacion[i]);
		}

		panel.add(etiquetaPaginacion, 2);
		// GOTO: linea 170
		return panel;
	}

	// III. Panel de filtros
	private JPanel crearPanelFiltros() {
		String[] subPaneles = { "Departemento", "Tipo"};
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "Filtros"));

		for (int i = 0; i < subPaneles.length; i++) {
			JPanel subPanel = new JPanel();
			
			subPanel.setLayout(new GridLayout( 2, 2));
			
			subPanel.setBorder(
					BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), subPaneles[i]));
			crearCheckboxes(i, subPanel);
			panel.add(subPanel);
			subPanel.setAlignmentY(TOP_ALIGNMENT);
		}
		
		// botones
		JPanel botonesPanel = new JPanel();
		for (int i = 0; i < filtroButtonLabels.length; i++) {
			botonesFiltro[i] = new JButton(filtroButtonLabels[i]);				
			botonesPanel.add(botonesFiltro[i]);
		}
		panel.add(botonesPanel);
		botonesPanel.setAlignmentY(TOP_ALIGNMENT);
		

		return panel;
	}

	// III.a - crear botones
	public void crearCheckboxes(int indice, JPanel subPanel) {

		// crear botones de departamento
		if (indice == 0) {
			for (int j = 0; j < departamentoCheckboxLabels.length; j++) {
				checkboxesDepartamento[j] = new JCheckBox(departamentoCheckboxLabels[j]);
				subPanel.add(checkboxesDepartamento[j]);
			}

		} else if (indice == 1){
			// crear botonos de tipo
			for (int j = 0; j < tipoTrabajadores.length; j++) {
				String s = tipoTrabajadores[j].substring(0, 1).toUpperCase()
						+ tipoTrabajadores[j].substring(1).concat("s");

				checkboxesTipo[j] = new JCheckBox(s);
				subPanel.add(checkboxesTipo[j]);
			}
		} 
	}

	public void mostrarSinEmpleados() {

		for (JTextField f : camposTexto) {
			if (f != null) {
				f.setText("");
			}
		}

		for (JRadioButton rb : botonesRadio) {
			rb.setSelected(false);
		}

		getEtiquetaPaginacion().setText("0/0");
	}

	public void mostrarEmpleado(String nombre, String sueldo, String fechaContrato, String departamento, boolean esJefe,
			String incentivo, int indiceActual, int cantidadEmpleados) {

		getCampoTexto(0).setText(nombre);
		getCampoTexto(1).setText(sueldo);
		getCampoTexto(2).setText(fechaContrato);
		getCampoTexto(3).setText(departamento);
		getBotonesRadio(esJefe ? 1 : 0).setSelected(true);
		getCampoTexto(5).setText(incentivo);
		getEtiquetaPaginacion().setText(String.valueOf(indiceActual) + "/" + String.valueOf(cantidadEmpleados));
	}

	// *****************************************
	// GETTERS AND SETTERS
	public JButton[] getBotonesNavegacion() {
		return botonesNavegacion;
	}

	public JButton getBotonNavegacion(int indice) {
		return botonesNavegacion[indice];
	}

	public JTextField getCampoTexto(int indice) {
		if (indice == 4) {

			System.err.println(
					"Indice 4 es el de \"Tipo\": no es un JTextField. Para \"Incentivo\" solicita el indice 5");
		}
		return camposTexto[indice];
	}

	public JRadioButton getBotonesRadio(int indice) {
		return botonesRadio[indice];
	}

	public JLabel getEtiquetaPaginacion() {
		return etiquetaPaginacion;
	}	

	public JCheckBox getCheckboxDepartamento(int indice) {
		return checkboxesDepartamento[indice];
	}

	public JCheckBox getCheckboxTipo(int indice) {
		return checkboxesTipo[indice];
	}
	
	public JButton[] getBotonesFiltro() {
		return botonesFiltro;
	}

	public JButton getBotonFiltro(int indice) {
		return botonesFiltro[indice];
	}

	// ACTIONLISTENER
	public void conectarControlador(ActionListener al) {
		for (JButton b : this.getBotonesNavegacion()) {
			b.addActionListener(al);
		}
		
		for (JButton b : this.getBotonesFiltro()) {
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
