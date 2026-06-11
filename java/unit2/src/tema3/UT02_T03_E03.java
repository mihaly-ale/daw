package tema3;

public class UT02_T03_E03 {
	public static void main(String[] args) {

		byte bDato = (byte) 1;    // 1byte,  2^8
		short sDato = (short) 0;  // 2bytes, 2^16
		int iDato = 0;			  // 4bytes, 2^32	
		long lDato = 0L;		  // 8bytes, 2^64
		float fDato = 0.0F;		  // 4bytes, 2^32
		double dDato = 0.0;		  // 8bytes, 2^64

		sDato = bDato; // sDato = 1, short
		iDato = sDato; // iDato = 1, integer
		lDato = iDato; // lDato = 1, long
		fDato = lDato; // fDato = 1.0, float
		dDato = fDato + lDato - iDato * sDato / bDato;
			 // 1.0f + 1l - 1i * 1s / 1b => 1.0f + (long => float) 1.0f  - 1s => 2.0f - (short => float) 1.0f => 1.0f
			 // 1i * 1s / 1b - todo a int
			 // 1.0f a double - encaja? si

		System.out.println("Resultado: " + dDato); // 1.0 double 
		System.out.println(1 * (short)1); // 1.0 double 
		System.out.println(((Object)(1 * (short)1)).getClass().getSimpleName());
		System.out.println(((Object)(dDato)).getClass().getSimpleName());
	}
}