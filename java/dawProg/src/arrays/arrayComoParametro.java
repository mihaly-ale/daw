package arrays;

public class arrayComoParametro {

	public static void main(String[] args) {
		int[] iVector;
		iVector = new int[4];
		inicializarVector(iVector);
		visualizarVector(iVector);

	} // main

	public static void inicializarVector(int[] v) {
		v[0] = 1;
		v[1] = 2;
		v[2] = 3;
		v[3] = 4;
	} // ini

	static void visualizarVector(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("v["+ i +"] "+ v[i]);
		}
	} // visu

} // class
