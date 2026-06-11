package string;

public class regexp_StringMatches {

	public static void main(String[] args) {
		// matches -- expresiones regulares - metalenguaje
		// comprobamos si una cadena ajusta un patron
		
		String str1 = "a";
		String str2 = "aaa";
		// METACARACTERES:
		// . --> cualquier caracter
		System.out.println("--patron: \".\" ");
		System.out.println(str1.matches(".")); //true
		System.out.println(str2.matches(".")); //false 
		System.out.println("?".matches(".")); //true
		System.out.println(str2.matches("...")); //true
		
		// METACARACTERES:
		// [] --> conjuntos, verdaderos si solo un valor está en la lista
		System.out.println("\n--patron: \"[]\" ");
		System.out.println("1a_".matches("[123abc?]")); // false
		System.out.println("1a?".matches("[123abc?]")); // false	
		System.out.println("?".matches("[123abc?]")); // true
		System.out.println("3".matches("[a-z]")); // false - rango (ASCII)
		System.out.println("A".matches("[a-z]")); // false - distingue entre mayúsculas y minúsculas (ASCII)
		System.out.println("A".matches("[a-zA-Z]")); // true
		
		// METACARACTERES:
		// repeticiones (+, *, ?, {n}, {n,m})
		System.out.println("\nREPTECIONES");
		System.out.println("--patron: \"+\" ");
		// + --> 1 a n -- al menos una vez de conjunto, y se puede repetir		
		System.out.println("21333".matches("[123]+"));
		
		// * --> 0 a n -- el cuantificador más permisivo
		System.out.println("\n--patron: \"*\" ");
		System.out.println("".matches("[123]*")); // true
		
		String str3 = "ha";
		System.out.println(str3.matches("h.*a")); // true
		
		// {n} --> exactamente n veces -- cualquier caracter 
		System.out.println("\n--patron: \"{n}\" ");
		System.out.println("".matches("[123]{3}")); // false
		System.out.println("333".matches("[123]{3}")); // true
		System.out.println("323".matches("[123]{3}")); // true
		
		// {n,m} -- rango
		System.out.println("\n--patron: \"{n,m}\" ");
		System.out.println("333".matches("[123]{1,3}")); // true
		System.out.println("123123".matches("[123]{2,5}")); // falso
		System.out.println("111".matches("[123]{2,5}")); // true		
		
		// (|) --> alternativas 
		System.out.println("\n--patron: \"(|)\" ");
		System.out.println("H?a".matches("(H|h)*(A|a)")); // false
		System.out.println("H?a".matches("(H|h|P|p)*(A|a)")); // false
		System.out.println("A".matches("(H|h|P|p)*(A|a)")); // true		
		
		// clases de caracteres - escape con chars
		// \d -  digit, \D - no digit
		// \s - línea blanco, \S - no línea blanco
		// \w - caracter de cadena de texto[A-Za-z0-9_], \W - no cadena de texto
		System.out.println("\n--patron: clases de caracteres ");
		System.out.println("hola12".matches("(hola|adios)[0-9]+"));// true
		System.out.println("adios88".matches("(hola|adios)\\d+")); //true
		System.out.println("adios88".matches("(hola|adios)\\D+")); //false
		
		System.out.println("\n--patron: '\\b' "); // word boundary
		System.out.println("sol".matches("\\bsol\\b")); // true 
		System.out.println("sol, lo ideal".matches(".*\\bsol\\b.*")); // true -- pero false en el caso de: "Sol, lo ideal."
		System.out.println("El sol es ama".matches(".*\\bsol\\b.*")); // true
		
		
		
		
		
		
		
		
		

	}

}

////ejercicios de apuntes
//		String str3 = "ha";
//		System.out.println(str3.matches("h.*a")); // h____a