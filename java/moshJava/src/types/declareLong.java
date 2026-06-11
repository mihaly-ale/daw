package types;

public class declareLong {
	public static void main(String[] args) {
		
		int integerOne = 123_456_789;
	    System.out.println(integerOne); // 123456789
	    
//	      int integerTwoA = 3_123_456_789; // Error, value is greater what int can have (entre -2 147 483 648 y  2 147 483 647)
//	      long integerTwoB = 3_987_654_321; // Error antes de la asignación, el valor es todavía afuera del rango de int
	      
	      long integerThree = 3_123_456_789L; // tipo espcificado
	      System.out.println(integerThree);
	}
}
