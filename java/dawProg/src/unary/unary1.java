package unary;

public class unary1 {

	public static void main(String[] args) {
		int i = 16;
		System.out.println(++i + " " + i++ + " " + i); // 17 17 18 
		
		// ++i - incrementa i y usa el nuevo valor inmediatamente
        // i++ - usa el valor actual primero, luego incrementa i
        // en ese momento, el valor usado no cambia; se incrementa después
	}

}
