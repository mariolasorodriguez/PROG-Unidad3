package boletin2;

public class Ejercicio07 {

	public static void main(String[] args) {

		int[] secuencia = new int[55]; // Tamaño total necesario para la secuencia
		
		int index = 0; // Índice para rastrear la posición en el array
		
		for (int numero = 1; numero <= 10; numero++) {
			// Rellenamos el array con el número 'numero', 'numero' veces
			java.util.Arrays.fill(secuencia, index, index + numero, numero);
			index += numero; // Actualizamos el índice para la siguiente posición
		}
		
		// Mostramos el array resultante
		System.out.println(java.util.Arrays.toString(secuencia));
	
	}
}
