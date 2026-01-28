package boletin2;

import java.util.Arrays;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		// Creamos el array
		int numeros[] = new int[30];
		
		// Rellenamos el array con numeros del 0 al 9
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 10);
		}
		
		// Mostrar el array desordenado para comprobar
        System.out.println("Sin ordenar: " + Arrays.toString(numeros));
        
		// Ordenamos el array
		Arrays.sort(numeros);
		
		// Mostramos el array ordenado
		System.out.println("Array ordenado: " + Arrays.toString(numeros));
	}
}
