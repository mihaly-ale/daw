package Ventanas.ven_layoutBasico;

public class UsaVentanaAdminstradorDeDiseno {

	public static void main(String[] args) {

		// Adminstrador de diseño - Layout manager
		VentanaAdminstradorDeDiseno ventanaAbs = new VentanaAdminstradorDeDiseno(true,
				"setLayout(null) - Absolute positioning");
		ventanaAbs.setVisible(true);
		System.out.println("ventanaAbs con setLayout(null):\nLayout por defecto de JFrame: " + ventanaAbs.getLayout());

		VentanaAdminstradorDeDiseno ventanaDefault = new VentanaAdminstradorDeDiseno(false,
				"no setLayout() - BorderLayout por defecto");
		ventanaDefault.setVisible(true);
	}

}
