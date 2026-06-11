package tema3;

public class UT02_T03_E04 {
	public static void main(String[] args) {
		// 2

		byte bDato = (byte) 0;
		short sDato = (short) 0;
		int iDato = 0;
		long lDato = 0L;
		float fDato = 0.0F;
		double dDato = 2.0;

		fDato = (float) dDato; // 2.0f
		lDato = (long)fDato;   // 2l  
		iDato = (int)lDato;    // 2, int 
		sDato = (short)iDato;  // 2, short
        var bDatoTemp = sDato + iDato - lDato * fDato / dDato;
				        // 2s + 2i - 2l * 2.0f / 2.0d
        				// 2s + 2i - int no se puede encajar en short => 4i
						// 2l * 2.0f = 4.0f
						// 4.0f / 2.0d - double no se puede encajar en un float => 2.0d
						// 4i - 2.0d - double no se puede encajar en int => 2.0d
        System.out.println("tipo de bDatoTemp:" + ((Object)(bDatoTemp)).getClass().getSimpleName());
        System.out.println("bDatoTemp: " + bDatoTemp);
        				// bDato es tipo byte y no se puede tener un double => casting
        				// cast el resultado de tipo double a tipo byte
        
        bDato = (byte)bDatoTemp;

        System.out.println("Resultado: " + bDato);
	}
}