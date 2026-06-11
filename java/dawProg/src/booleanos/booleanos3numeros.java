package booleanos;

public class booleanos3numeros {
public static void main(String[] args) {
	
	int x=77, y=111, z=44;
	
	int numMenor;
	int numMayor;
	
	numMenor = (x < y) ? (x < z ? x : z) : (y < z ? y : z);
	numMayor = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
	
	
	System.out.println("numMenor: " + numMenor);
	System.out.println("numMayor: " + numMayor);
	 
	}
}

