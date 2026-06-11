package tema3;

public class UT02_T03_E01_B {
	public static void main(String[] args) {
		byte ba = 8;
		short sa = 8, sb = 7000; // rango -2^15 => (2^15)-1, 1bit para el signo 16 => 15
		int ia = 1, ib = -3, ic = 0xF001;
		long la = -113L, lb = 113, lc = 0x1facd23fl;
		float fa = -3.14159f, fb = 3.2e+32f, fc = 2 / 3f;
//		 float fd = -3.14159;
		double da = -3.14159, db = 3.2e+32, dc = 2 / 3d;
		char ca = 'a', cb = 97, cc = 0x0061, cd = '\u0061';
		boolean boa = true;

		System.out.println("byte ba: " + ba); // => byte ba: 8
		System.out.println("short sa: " + sa + " short sb: " + sb); // short sa: 8, short sb: 7000
		System.out.println("int ia: " + ia + " int ib: " + ib + " int ic: " + ic);
							// 0x es hexadecimal => conversión: 1111 0000 0000 0001 = 61441
							// int es de -2^31 a 2^31-1
							// => int ia: a, int ib: -3, int ic: 61441 
		System.out.println("long la: " + la + " long lb: " + lb + " long lc: " + lc);
							// lc conversión a decimal: 1facd23f => 531419711, long es -2^63 a 2^63-1
							// => long la: -113, long lb: 113, long lc: 531419711
		System.out.println("float fa: " + fa + " float fb: " + fb + " float fc: " + fc);
							// fb: 3.2*10^32 = dentro del rango de IEEE754
							// fc: 2 a int, 2.0/3.0 = 0.66666667
							// => float fa: -3.14159, fb: 3.2e+32, fc:0.66666667		
//		 System.out.println(" float fd: " + fd);
							// => el valor es double por defecto, no cabe en un float
		System.out.println("double da: " + da + " double db: " + db + " double dc: " + dc);
							// db - el mismo numero que fb, 
							// double da: -3.14159, double db: 3.2e+32, double dc: 0.666666666 ....... 
		System.out.println("char ca: " + ca + " char cb: " + cb + " char cc: " + cc + " char cd: " + cd);
							// char ca: a, char cb: a, char cc:  Q, char cd: Q 
							// cb ANSII 97 es a
							// cc es hexadecimal: 0000 0000 0110 0001 = 1+32+64 = 97 en ANSII es a
							// \\u es escape 0061 es hexadecimal => a
		System.out.println("boolean boa: " + boa);
							// boolean boa = true
	}
}
