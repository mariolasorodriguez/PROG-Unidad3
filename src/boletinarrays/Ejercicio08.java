package boletinarrays;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Declarar variables
		int N;
		boolean encontrado = false;
		int posicion;

		// Crear e inicializar el array con 100
		int[] numeros = new int[100];

		// Rellenar el array con numeros aleatorios entre 1 y 10
		for (posicion = 0; posicion < numeros.length; posicion++) {
			numeros[posicion] = (int) (Math.random() * 10) + 1;
		}

		// Pedir al usuario un numero N entre 1 y 10
		System.out.println("Introduce un numero N (entre 1 y 10): ");
		N = reader.nextInt();
		
		// Buscar el numero N en el array
		for (posicion = 0; posicion < numeros.length; posicion++) {
			if (numeros[posicion] == N) {
				System.out.println("El numero " + N + " se encuentra en la posicion " + posicion);
				encontrado = true;
			} 
		}
		
		// Si no se ha encontrado el numero N en el array, se lo mostramos al usuario
		if (!encontrado) {
			System.out.println("El numero " + N + " no se encuentra en el array.");
		}
		
		// Cerrar el scanner
		reader.close();
	}
}
