package boletinarraysbidimensionales;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio02 {
	
	private static final int NUM_ALUMNOS = 4;
	private static final int NUM_ASIGNATURAS = 5;
	
	public static void main(String[] args) {
		
		// Creamos el array bidimensional
		double[][] notas = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Rellenar el array con las notas introducidas por el usuario
		rellenarNotas(reader, notas);
		
		// Mostrar las notas de cada alumno
		mostrarTablaNotas(notas);
		
		// Mostrar el resumen de cada alumno
		mostrarResumenAlumnos(notas);
		
	}
	
	// Rellena la tabla de notas con los alumnos en filas y las asignaturas en columnas
	private static void rellenarNotas(Scanner reader, double[][] notas ) {
		int indiceAlumno;
		for (indiceAlumno = 0; indiceAlumno < NUM_ALUMNOS; indiceAlumno++ ) {
			System.out.println("Introduce las notas del alumno " + (indiceAlumno +1) + ":");
			int indiceAsignatura;
			for (indiceAsignatura = 0; indiceAsignatura < NUM_ASIGNATURAS; indiceAsignatura++) {
				System.out.println(" Aisgnatura " + (indiceAsignatura + 1) + " : ");
				notas[indiceAlumno][indiceAsignatura] = reader.nextDouble();
			}
		}
		
	}
	
	// Muestra las notas
	private static void mostrarTablaNotas (double[][] notas) {
		System.out.println(Arrays.toString(notas));
	}
	
	// Muestra el resumen de notas de cada alumno
	private static void mostrarResumenAlumnos (double [][] notas) {
		
	}
}
