package unary;

public class unary2 {
 public static void main(String[] args) {
	 
	  int n=5, t;	 
	  t = ++n*--n; // ++, --, *
	 
	 System.out.println("Valor de n: " + n);
	 System.out.println("Valor de t: " + t);
	 
	 t = ++n*n--; // ++, *, --
	 
	 System.out.println("Valor de n: " + n);
	 System.out.println("Valor de t: " + t);
 }
}
