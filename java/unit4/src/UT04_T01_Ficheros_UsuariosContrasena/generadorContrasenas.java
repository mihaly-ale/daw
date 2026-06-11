package UT04_T01_Ficheros_UsuariosContrasena;

import java.util.ArrayList;
import java.util.Random;

public class generadorContrasenas {

	public static void main(String[] args) {

		Random rnd = new Random();
		int cantidadUsuarios = rnd.nextInt(10, 21);// 1. usuarios entre 10 y 20
		System.out.println("Creamos " + cantidadUsuarios + " contraseñas: ");

		for (int i = 0; i < cantidadUsuarios; i++) {
			String usuario = String.format("user%02d", i + 1);

			System.out.println(i + 1 + " => " +  generarPassword(usuario));
		}

	}

	public static String generarPassword(String usuario) {
		String letras = "ABCDEFGHIJKLMNÑOPQRSTUWXYZ0123456789"; // lon: 36
		Random rndLetras = new Random();

		String parteUltima = "";
		String contrasena = "";

		for (int j = 0; j < 4; j++) {
			parteUltima += letras.charAt(rndLetras.nextInt(letras.length()));
			/*
			public int nextInt(int bound)
			Returns ... int value between 0 (inclusive) and the specified value (exclusive)
			*/

			contrasena = String.format("Pwd_%s_%s", usuario, parteUltima);
			// Pwd_user01_A3F9
			// user01 =  usuario
			// A3F9 = parteUltima
			
		}
		
		return contrasena;
	}

}

/*
1. El sistema generará un número aleatorio de usuarios comprendido entre 10 y 20. 

2. Cada usuario se generará siguiendo un patrón fijo, por ejemplo:
	user01, user02, user03, etc. 

3. Para cada usuario se generará una contraseña automática, siguiendo también un patrón definido, combinando:
	Un prefijo fijo 
	El nombre del usuario 
	Una secuencia aleatoria de caracteres alfanuméricos
*/ 