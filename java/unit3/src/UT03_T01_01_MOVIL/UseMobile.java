package UT03_T01_01_MOVIL;

public class UseMobile {

	public static void main(String[] args) {

		final Mobile miMobile = new Mobile("miMarca", 123456789, "alta");
		final Mobile tuMobile = new Mobile("tuMarca", 987654321, "media");

		System.out.println("mi Mobile:\n" + miMobile.verCaracteristicas());
		miMobile.realizarLalamadas();
		System.out.println("tu Mobile:\n" + tuMobile.verCaracteristicas());
		tuMobile.realizarLalamadas();

	}

}
