package UT03_T02_01_CENTROEDUCATIVO;

import java.time.LocalDate;

public class UsaCentroEducativo {

	public static void main(String[] args) {

		double[][] notas = { { 7, 8, 4 }, { 9.2, 4, 5, 7 }, { 8, 5, 6 }, { 7, 8, 4, 2 }, { 9.2 }, { 8, 5, 6 }, { 6 } };

		int[] faltas = { 12, 3, 25, 0, 2, 1, 45 };

		Persona[] escuela = {
				new PersonalLaboral(new Identificacion("7564162-M"), "María Pérez", LocalDate.of(1985, 5, 10), 1200.00,
						12, 14.50),
				new ProfesorNormal(new Identificacion("00000000T"), "Juan Lopez", LocalDate.of(1978, 3, 22), 1800.00,
						CargoJefatura.NINGUNO),

				new ProfesorNormal(new Identificacion("34567891H"), "Isabel García", LocalDate.of(1975, 11, 2), 1900.00,
						CargoJefatura.JEFE_DE_ESTUDIOS),

				new ProfesorNormal(new Identificacion("71167415X"), "Carlos Martín", LocalDate.of(1972, 1, 15), 2000.00,
						CargoJefatura.DIRECTOR),
				new Estudiante(new Identificacion("45454545j"), "Ana Perez", LocalDate.of(2004, 01, 14), notas,
						faltas) };

		for (Persona s : escuela) {
			s.descripcionDetalladaMensual();
			System.out.println("\n");
		}

	}

}
