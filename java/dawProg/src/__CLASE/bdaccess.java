package __CLASE;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class bdaccess {
	public static void main(String[] args) {
		String rutaBD = "C:" + File.separator + "Users" + File.separator + "mihaly.ale.EDUCA" + File.separator
				+ "Downloads" + File.separator + "BBDD_Ejemplo" + File.separator + "Libros.mdb";
		
		String url = "jdbc:ucanaccess://" + rutaBD;
		
		try (Connection conexion = DriverManager.getConnection(url)){
			DatabaseMetaData meta = conexion.getMetaData();
			
			System.out.println("Conexión exitosa ...");
			ResultSet tablas = meta.getTables(url, rutaBD, url, args);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
