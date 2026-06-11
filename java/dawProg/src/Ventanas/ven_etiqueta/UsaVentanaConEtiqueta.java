package Ventanas.ven_etiqueta;

import java.util.Random;

public class UsaVentanaConEtiqueta {

	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(101);		
		System.out.println(num);
		
		VentanaConEtiqueta vent = new VentanaConEtiqueta(Integer.toString(num));
		vent.setVisible(true);
	}
}




