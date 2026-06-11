package UT03_T02_01_CENTROEDUCATIVO;

import java.time.LocalDate;

public class Estudiante extends Persona {

	private double[][] notas;
	private int[] faltas;

	private static String[] modulos = { "LMSGI", "SINF", "BDD", "PROG", "EDES", "INGLES", "IPE" };
	

	public Estudiante(Identificacion id, String nombre, LocalDate fechanac, double[][] notas, int[] faltas) {
		super(id, nombre, fechanac);

		this.notas = notas;
		this.faltas = faltas;
	}

	@Override
	public String rol() {
		return "Estudiante";
	}

	@Override
	public void descripcionDetalladaMensual() {
		System.out.println("==========" + " BOLETÍN DE NOTAS ========= \n" + mostrarEncabezado() + "\n---------" + "--"
				+ "--------------------------" + getModuloData() + "---------------------\nHoras totales del curso: "
				+ getHorasTotales() + "\nFaltas totales: " + getFaltasTotales() + "\nMedia General (sin ponderar): "
				+ getMediaGeneral() + "\nBeca? " + tieneBeca());
	}

	// METODOS DE BOLETÍN - CADA MODULO
	public String getModuloData() {
		String str = "";

		for (int i = 0; i < modulos.length; i++) {
			String mod = modulos[i];

			str += "\nMódulo: " + ModuloDAW1.valueOf(ModuloDAW1.class, mod).getNombre() + " ["
					+ ModuloDAW1.valueOf(ModuloDAW1.class, mod).getCodigo() + "]" + "\nHoras totales: "
					+ ModuloDAW1.valueOf(ModuloDAW1.class, mod).getHoras_totales() + "\nNotas: " + mostrarNotasModulo(i)
					+ "\nFaltas totales: " + getFaltasDeModulo(i) + "\nNota final aplicada: "
					+ getNotaFinalDeModulo(i, mod) + "\n";
		}

		return str;
	} // getModuloData

	public String mostrarNotasModulo(int indice) {

		String s = "";

		for (double nota : notas[indice]) {
			s += nota + " ";
		}

		return s;
	} // mostrarNotasModulo

	public int getFaltasDeModulo(int indice) {
		return faltas[indice];
	} // getFaltasDeModulo

	public double getNotaFinalDeModulo(int indice, String mod) {
		double sumNotas = 0;

		for (int i = 0; i < notas[indice].length; i++) {
			sumNotas += notas[indice][i];
		}

		return sumNotas / notas[indice].length - calcularPenalizacionNotas(indice, mod);
	} // getNotaFinalDeModulo

	public double calcularPenalizacionNotas(int indice, String mod) {
		double faltaPor;
		int faltasMod = getFaltasDeModulo(indice);
		int horasTotMod = ModuloDAW1.valueOf(ModuloDAW1.class, mod).getHoras_totales();

		faltaPor = (double) faltasMod / horasTotMod * 100;

		if (faltaPor < 5) {
			return 0.0;
		} else if (faltaPor >= 5 && faltaPor < 10) {
			return 0.5;
		} else if (faltaPor >= 10 && faltaPor < 20) {
			return 1.0;
		} else if (faltaPor >= 20 && faltaPor < 30) {
			return 2.0;
		} else
			return 3.0;
	} // calcularPenalizacionNotas

	// METODOS DE BOLETÍN - TODO MODULOS
	public int getHorasTotales() {
		int horasTotales = 0;

		for (String mod : modulos) {
			horasTotales += ModuloDAW1.valueOf(ModuloDAW1.class, mod).getHoras_totales();
		}

		return horasTotales;
	} // getHorasTotales

	public int getFaltasTotales() {
		int faltasTotales = 0;

		for (int i = 0; i < faltas.length; i++) {
			faltasTotales += getFaltasDeModulo(i);
		}

		return faltasTotales;
	} // getFaltasTotales

	public double getMediaGeneral() {
		double totalNotas = 0.0;
		int contador = 0;

		for (int i = 0; i < modulos.length; i++) {
			if (getNotaFinalDeModulo(i, modulos[i]) >= 5.0) {
				contador++;
				totalNotas += getNotaFinalDeModulo(i, modulos[i]);
			}
		}

		return totalNotas / contador;
	}

	public String tieneBeca() {
		String beca = "";
		float porcentajeFaltasCurso = (float) getFaltasTotales() / getHorasTotales() * 100;
		int modulosSuperados = 0;

		for (int i = 0; i < modulos.length; i++) {
			modulosSuperados += getNotaFinalDeModulo(i, modulos[i]) >= 5.0 ? 1 : 0;
		}

		if (porcentajeFaltasCurso < 20 && ((float) modulosSuperados / notas.length * 100 > 50)) {
			beca = "Sí";
		}

		return beca;
	}

}

// ********************************************************
// static initializer block
// https://medium.com/@prithukathet/understanding-static-and-instance-initializer-blocks-in-java-0a34902ef308




//private static final ModuloDAW1[] enumModulos = ModuloDAW1.values();
//private static String[] modulos;
//
//static {
//	modulos = new String[setModulosArray()];
//
//	int i = 0;
//
//	for (ModuloDAW1 enumMod : enumModulos) {
//		if (!enumMod.getTipo().equals("opcional"))
//			modulos[i++] = enumMod.name();
//	}
//
//}
//
//public static int setModulosArray() {
//	int modulosLength = 0;
//
//	for (ModuloDAW1 enumMod : enumModulos) {
//		if (!enumMod.getTipo().equals("opcional"))
//			modulosLength++;
//	}
//	return modulosLength;
//}
