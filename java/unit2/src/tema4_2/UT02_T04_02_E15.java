package tema4_2;

class UT02_T04_02_E15 {	
	public static void main (String[ ] args) {
		int i=0; 
	          
		externo: 
	          while (true)  { 
	             System.out.println ("Bucle while externo"); 
	             while(true) { 
	                i++; 
	                System.out.println ("i = " + i); 
	                if (i == 1) { 
	                   System.out.println ("Continuar"); 
	                   continue; 
	                } 
	                if (i == 3) { 
	                   System.out.println ("Continuar externo"); 
	                   continue externo; 
	                } 
	                if (i == 5) { 
	                   System.out.println ("Salir"); 
	                   break; 
	                } 
	                if (i == 7) { 
	                   System.out.println ("Break externo"); 
	                   break externo; 
	                } 
	             } 
	          } 
	       } 
	    }  
