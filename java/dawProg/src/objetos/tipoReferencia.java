package objetos;

class coche {
	int numero;
}

public class tipoReferencia {
	public static void main(String[] args) {

		coche miCoche = new coche();
		miCoche.numero = 3;

		coche cocheDePedro = new coche();
		cocheDePedro.numero = 5;

		System.out.println("mio: " + miCoche.numero);
		System.out.println("pedro: " + cocheDePedro.numero);

		miCoche = cocheDePedro; // cambia la referncia

	}

}
