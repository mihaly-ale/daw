package arrays;

import java.util.Arrays;

public class _SystemArraycopy {

	public static void main(String[] args) {
		int[] numerosOrigen = {1,1,1,1,1};
		int[] numerosDestino = {2,2,2,2,2,2,2,2,2};
		
		System.arraycopy(numerosOrigen,  0, numerosDestino, 1, numerosOrigen.length);
		
		System.out.println("numerosOrigen " + Arrays.toString(numerosOrigen));
		System.out.println("numerosDestino " + Arrays.toString(numerosDestino));
		System.out.println("\narraycopy(Object src,\r\n"
				+ "\t  int srcPos,\r\n"
				+ "\t  Object dest,\r\n"
				+ "\t  int destPos,\r\n"
				+ "\t  int length)");
	}
}
