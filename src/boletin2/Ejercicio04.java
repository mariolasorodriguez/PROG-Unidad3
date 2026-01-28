package boletin2;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos el array donde guardar las puntuaciones
		int puntuaciones[] = new int[8];
		
		// Pedimos las puntuaciones de todos los jugadores
		for (int i = 0 ; i < puntuaciones.length ; i++) {
			System.out.print("Introduce la puntuación del jugador " + i + ": ");
			puntuaciones[i] = reader.nextInt();
		}
		
		// Ordenamos el array
		Arrays.sort(puntuaciones);
		
		// Mostramos el ranking
		System.out.println("== RANKING FINAL ==");
		for (int i = puntuaciones.length - 1 ; i >= 0 ; i--) {
			System.out.println("Puntuación jugador " + i + ": " + puntuaciones[i]);
		}
		
		
		reader.close();
	}
}
