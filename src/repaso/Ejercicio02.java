package repaso;

import java.util.Arrays;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		// Declaramos el array de double
		double notas[] = new double[30];
		
		// Declaramos el array con las notas modificadas
		double notasModificadas[] = new double[30];
		
		// Declaramos el incremento
		double incremento = 0.5;
		
		// Rellenamos el array con notas entre 0 y 10
		for (int i = 0; i < notas.length; i++) {
			double aleatorio = Math.random() * 10;
			notas[i] = Math.round(aleatorio * 100.0) / 100.0; // Truncar a 2 decimales
		}
		
		// Calculamos las notas
	    double mediaNotas = calcularMedia(notas);
	    double notaMayor = calcularNotaMaxima(notas);
	    int notasAprobadas = calcularNotasAprobadas(notas);

	    // Subimos las notas
	    subirNotas(notas, incremento, notasModificadas);
		
		imprimirNotas(notas, notasModificadas, mediaNotas, notaMayor, notasAprobadas);
	}

	
	
	/* 
	 * @param Funcion que calcula la media de todas las notas de los alumnos
	 * double[] notas (Array con las notas)
	 * @return Media de todas las notas
	 */
	
	static double calcularMedia(double[] notas) {
		double totalNotas = 0.00;
		for (int i = 0; i < notas.length; i++) {
			totalNotas += notas[i];
		}
		
		double mediaNotas = totalNotas / notas.length;

		return mediaNotas;
	}
	
	/* @param Funcion que calcula la nota mayor de todas las de los alumnos
	 * double[] notas (Array con las notas)
	 * @return Nota maxima de todas las notas
	 */
	
	static double calcularNotaMaxima(double[] notas) {
		double notaMayor = 0;
		for (int i = 0; i < notas.length; i++) {
			  if (notas[i] > notaMayor) {
	                notaMayor = notas[i];
			  }
		}
		
		return notaMayor;
	}
	
	
	/* @param Funcion que calcula las notas aprobadas
	 * double[] notas (Array con las notas)
	 * @return Cuantas personas han aprobado
	 */
	
	static int calcularNotasAprobadas(double[] notas) {
		int notasAprobadas = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 5) {
                notasAprobadas++;
			}
		}	
		return notasAprobadas;
	}
	
	/*
	 * @param Funcion que añade incremento definido a las notas de los alumnos
	 * double notas[] (Array con las notas)
	 * double incremento (Incremento definido en el main)
	 */
	
	static void subirNotas(double[] notas, double incremento, double[] notasModificadas) {
		for (int i = 0; i < notas.length; i++) {
	        notasModificadas[i] = (notas[i] + incremento);
            if	(notasModificadas[i] > 10) {
                notasModificadas[i] = 10;
            }
        }
	}

	
	/*
	 * @param Funcion para mostrar todos los resultados
	 * double notas[] (Array con las notas)
	 */
	
	static void imprimirNotas(double[] notas, double[] notasModificadas, double mediaNotas, double notaMayor, int notasAprobadas) {
		System.out.println("== NOTAS ORIGINALES ==");
		System.out.println(Arrays.toString(notas));
		System.out.println("Nota media: " + mediaNotas + " | Nota Mayor: " + notaMayor + " | Notas Aprobadas: " + notasAprobadas);
		System.out.println("== NOTAS MODIFICADAS CON INCREMENTO ==");
		System.out.println(Arrays.toString(notasModificadas));
	}
	
		
}
