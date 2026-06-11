package booleanos;

public class shortCircuit {

	public static void main(String[] args) {

		System.out.println("true || false");
		if (returnAndLog(true) || returnAndLog(false)) {
		}
		System.out.println("------");

		System.out.println("false || true");
		if (returnAndLog(false) || returnAndLog(true)) {
		}
		System.out.println("------");
		
		boolean result1 = returnAndLog(true);
		boolean result2 = returnAndLog(false);

		if (result1 || result2) {
		}
	} // main

	public static boolean returnAndLog(boolean value) {
		System.out.println("Returning " + value);
		return value;
	} //returnAndLog

}
