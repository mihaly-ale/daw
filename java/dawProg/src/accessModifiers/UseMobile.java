package accessModifiers;

public class UseMobile {

	public static void main(String[] args) {

		final Mobile miMobile = new Mobile("miMarca", 123456789);

		// esto a pesar de todo es posible
		// se crea un nuveo Objeto, y el antiguo será recolectado por la JVM
		// Hacer miMobilee final impide el "cambio",
		// porque miMobilee, al estar declarado final, no se puede reasignar.
//		miMobilee = new Mobile(22222);

		System.out.println("mi Mobilee:\n" + miMobile.verCaracteristicas());
		miMobile.realizarLalamadas();

		Mobile tuMobile = new Mobile("Alcatal", 456789123);
		Mobile pedroMobile = new Mobile("HTC", 999999);
		System.out.println("tuMobile:\n" + tuMobile.verCaracteristicasconID());
		System.out.println("pedroMobile:\n" + pedroMobile.verCaracteristicasconID());
		System.out.println("miMobile:\n" + miMobile.verCaracteristicasconID());

		Mobile noIdMobile = new Mobile(444444444);
		// no va a tener id, porque su constructor ni iniciliza id
		System.out.println("noIdmobile:\n" + noIdMobile.verCaracteristicasconID());

// 23.01
		System.out.println("toString()");
		System.out.println(tuMobile.toString());

	}

}
