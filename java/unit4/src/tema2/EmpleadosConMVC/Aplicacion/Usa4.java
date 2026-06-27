package tema2.EmpleadosConMVC.Aplicacion;

import java.nio.file.Path;

import tema2.EmpleadosConMVC.controlador.ControladorVisualizer;
import tema2.EmpleadosConMVC.modelo.GestorEmpleados;
import tema2.EmpleadosConMVC.vista.VentanaVisualizarEmpleados;

public class Usa4 {
	public static void main(String[] args) {
		Path ruta = Path.of("F:", "code", "repos", "daw", "java", "unit4", "src", "tema2", "generados",
				"empleados.txt");
		
		VentanaVisualizarEmpleados vista = new VentanaVisualizarEmpleados();	
		GestorEmpleados modelo = new GestorEmpleados(ruta);
		ControladorVisualizer controlador = new ControladorVisualizer(vista, modelo);
		vista.setVisible(true);
		
	
		
		
		
	}

}
