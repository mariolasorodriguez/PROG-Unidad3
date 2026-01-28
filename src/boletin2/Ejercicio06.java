package boletin2;

import java.util.Arrays;

public class Ejercicio06 {
	public static void main(String[] args) {
		
		// Declaramos los arrays
		int[] apuesta = new int[6];
		int[] apuestaGanadora = {10, 12, 40, 1, 3, 5};
		
		// Rellenamos la apuesta con numeros aleatorios
		for (int i = 0; i < apuesta.length; i++) {
			apuesta[i] = (int) (Math.random() * 50);
		}
		
		
		System.out.println("Apuesta introducida: " + Arrays.toString(apuesta));
		System.out.println("Apuesta ganadora: " + Arrays.toString(apuestaGanadora));

		// Comprobamos si ha ganado la primitiva
		int numerosAcertados = 0;
		for (int i = 0; i < apuesta.length; i++) {
			for (int j = 0; j < apuesta.length; j++) {
				if (apuestaGanadora[i] == apuesta[j]) {
					numerosAcertados++;
				}
			}
		}
		
		// Mostramos resultados
		System.out.println("Ha acertado " + numerosAcertados + " números");
		
	}
}
