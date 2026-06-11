package UT03_T01_03_AGENDA;

import java.util.ArrayList;

public class UsaAgenda {

	public static void main(String[] args) {
		
// Menu start			
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Introduzca el nombre: ");
//		String nombre = scan.next();
//		System.out.print("Introduzca el apellido: ");
//		String apellido = scan.next();
//		System.out.print("Introduzca el numero de telefono: ");
//		String telefono = scan.next();
//		System.out.print("Introduzca una etiqueta por el telefono: ");
//		String etiqueta = scan.next();
//		
//		ArrayList<Contacto> agenda = new ArrayList<>();
//		
//		Contacto ana = null;
//		Contacto miguel = null;
//		
//		try {
//			ana = new Contacto(nombre, apellido, new Telefono(TipoTelefono.CASA, telefono, etiqueta));
//			miguel = new Contacto("Miguel", "Garcia", new Telefono(TipoTelefono.TRABAJO, "987-654-321", "movil trabajo"));
//		} catch (Exception e) {
//			throw new IllegalArgumentException(
//					"Tipo de telefono inválido. Debes ser uno de \"Personal, Casa, Trabajo, Emergencia, Otro\"");
//		}
//		
//		agenda.add(ana);
//		agenda.add(miguel);
//		
//		ana.addTelefono(new Telefono(TipoTelefono.TRABAJO, "333666999", "movil trabajo"));
//		miguel.addTelefono(new Telefono(TipoTelefono.EMERGENCIA, "123456789", "movil EMERGENCIA"));
//		
//		System.out.println(buscarTelefono("600", agenda));
// Menu stop
		
//***************************************************************************************
		ArrayList<Contacto> agenda = new ArrayList<>();
		
		Contacto ana = null;
		Contacto miguel = null;
		
		try {
			ana = new Contacto("Ana", "Perez", new Telefono("trabajo", "987-000-000", "xcv           "), new Evento("SA", "2012-8-1", "   mi cunmple     "), new Direccion("segunda residencia", "Madrid", null, "52678", "Espana", null));
			miguel = new Contacto("Miguel", "Garcia", new Telefono("casa", "987-000-001", "movil trabajo"), new Evento("cumple", "2012-8-2", " mi cunmple"));
		} catch (IllegalArgumentException e) {
			System.out.println(e.toString());
		}
		
		agenda.add(ana);
		agenda.add(miguel);
		
		ana.addTelefono(new Telefono("personal", "933666999", "movil trabajo"));
		ana.addTelefono(new Telefono("otro", "999-664-331", "movil trabajo"));
//		miguel.addTelefono(new Telefono("casa", "911111111", "movil EMERGENCIA"));		
		
		// mostrar agenda
		for (Contacto o : agenda) {
			System.out.println(o.toString());
		}		

		System.out.println(buscarTelefono("987", agenda));
		System.out.println(buscarEvento("SA", agenda));
	} //main
	
	
	// metodos de main
	static String buscarTelefono(String tel, ArrayList<Contacto> agenda) {
	
		String usuario = "";
		for (Contacto contacto: agenda) {			
			for (Object o: contacto.getListaTelefonos()) {				
				if(o.toString().contains(tel)) {
					usuario = contacto.getNombre();
				} 
			}			
		}
		
		return usuario;
	} // buscarTelefono
	
	static String buscarEvento(String evento, ArrayList<Contacto> agenda) {
		
		String usuario = "";
		for (Contacto contacto: agenda) {			
			for (Object o: contacto.getListaEventos()) {				
				if(o.toString().contains(evento)) {
					usuario = contacto.getNombre();
				} 
			}			
		}
		
		return usuario;
		
	}
	static String buscarDireccion() {
		return "eventos";
	}

}
