package tema2.EmpleadosConMVC.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JButton;

import tema2.EmpleadosConMVC.modelo.Empleado;
import tema2.EmpleadosConMVC.modelo.GestorEmpleados;
import tema2.EmpleadosConMVC.vista.VentanaVisualizarEmpleados;

public class ControladorVisualizer implements ActionListener{	
		
		
		Path ruta = Path.of("F:", "code", "repos", "daw", "java", "unit4", "src", "tema2", "generados", "empleados.txt");		
		VentanaVisualizarEmpleados vista = new VentanaVisualizarEmpleados();
		GestorEmpleados modelo = new GestorEmpleados(ruta);		
		ArrayList<Empleado> listaCompleta = new ArrayList<>();
		ArrayList<Empleado> listaFiltrada = new ArrayList<>();
		int indiceActual;
		DateTimeFormatter formatoFecha;
		
		public ControladorVisualizer(VentanaVisualizarEmpleados vista, GestorEmpleados modelo) {
			this.vista = vista;
			this.modelo = modelo;
		}


	@Override
	public void actionPerformed(ActionEvent e) {	
		if (e.getSource() == vista.getJButton(0)) {
			indiceActual = 0;
		} else if (e.getSource() == vista.getJButton(1)) { 
			indiceActual -= 1;
		} else  if (e.getSource() == vista.getJButton(2)) { 
			
		}
		
		
		
	}		
		
		
		
		
		
		
		

}
