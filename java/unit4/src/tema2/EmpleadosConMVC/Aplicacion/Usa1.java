package tema2.EmpleadosConMVC.Aplicacion;

import java.util.ArrayList;

import tema2.EmpleadosConMVC.modelo.DatosIniciales;
import tema2.EmpleadosConMVC.modelo.Empleado;

public class Usa1 {

	public static void main(String[] args) {

		ArrayList<Empleado> empleadosIniciales = DatosIniciales.crearLista();

		// log
		for (int i = 0; i < empleadosIniciales.size(); i++) {
			System.out.println(i + " - " + empleadosIniciales.get(i).toString());
		}
	}

}
