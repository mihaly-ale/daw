package tema2.EmpleadosConMVC.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import tema2.EmpleadosConMVC.modelo.Empleado;
import tema2.EmpleadosConMVC.modelo.GestorEmpleados;
import tema2.EmpleadosConMVC.modelo.Jefe;
import tema2.EmpleadosConMVC.vista.VentanaVisualizarEmpleados;

public class ControladorVisualizer implements ActionListener {

	ArrayList<Empleado> listaCompleta;
	ArrayList<Empleado> listaFiltrada = new ArrayList<>();
	int indiceActual;
	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy");;

	private VentanaVisualizarEmpleados vista;
	private GestorEmpleados modelo;

	public ControladorVisualizer(VentanaVisualizarEmpleados vista, GestorEmpleados modelo) {
		this.vista = vista;
		this.modelo = modelo;

		listaCompleta = getModelo().leerEmpleados();

		this.vista.conectarControlador(this);
	}

	private void refrescarVista() {
		Empleado emp = listaCompleta.get(indiceActual - 1);
		String incentivo;
		boolean esJefe = emp instanceof Jefe;

		incentivo = esJefe ? String.valueOf(((Jefe) emp).getIncentivo()) : "0";

		vista.mostrarEmpleado(emp.getNombre(), String.valueOf(emp.getSueldo()),
				emp.getFechaContrato().format(formatoFecha), emp.getDepartamento(), esJefe, incentivo, indiceActual,
				listaCompleta.size());

		actualizarBotones();
	}

	private void actualizarBotones() {
		// FIXME: REFACTOR
		if (indiceActual <= 1) {
			vista.getBotonNavegacion(0).setEnabled(false);
			vista.getBotonNavegacion(1).setEnabled(false);
			vista.getBotonNavegacion(2).setEnabled(true);
			vista.getBotonNavegacion(3).setEnabled(true);
		} else {
			vista.getBotonNavegacion(0).setEnabled(true);
			vista.getBotonNavegacion(1).setEnabled(true);

		}

		if (indiceActual >= listaCompleta.size()) {
			vista.getBotonNavegacion(0).setEnabled(true);
			vista.getBotonNavegacion(1).setEnabled(true);
			vista.getBotonNavegacion(2).setEnabled(false);
			vista.getBotonNavegacion(3).setEnabled(false);
		} else {
			vista.getBotonNavegacion(2).setEnabled(true);
			vista.getBotonNavegacion(3).setEnabled(true);

		}
	}

	// GETTERS AND SETTERS
	public VentanaVisualizarEmpleados getVista() {
		return vista;
	}

	public void setVista(VentanaVisualizarEmpleados vista) {
		this.vista = vista;
	}

	public GestorEmpleados getModelo() {
		return modelo;
	}

	public void setModelo(GestorEmpleados modelo) {
		this.modelo = modelo;
	}

	// ACTIONLISTENER
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.getBotonNavegacion(0)) {
			indiceActual = 1;
		} else if (e.getSource() == vista.getBotonNavegacion(1)) {
			indiceActual = Math.max(1, indiceActual - 1);
		} else if (e.getSource() == vista.getBotonNavegacion(2)) {
			indiceActual = Math.min(listaCompleta.size(), indiceActual + 1);
		} else {
			indiceActual = listaCompleta.size();
		}

		refrescarVista();

	}

}
