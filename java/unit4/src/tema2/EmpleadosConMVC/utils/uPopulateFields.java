package tema2.EmpleadosConMVC.utils;

import javax.swing.JTextField;

public class uPopulateFields {

	public static void populate(JTextField[] inputs, String string) {
		for (JTextField f : inputs) {

			// NOTE:porque Tipo no crea JTextField, sino botones de radio
			if (f != null) {
				f.setText(string);
			}
		}
	}
	
}
