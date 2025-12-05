package boletinarrays;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio02 {
	public static void main(String[] args) {
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos el array
		double[] numeros = new double[5];
		
		// Pedimos 5 numeros decimales al usuario y los guardamos en un array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce un número decimal: ");
			numeros[i] = reader.nextDouble();
		}
		
		// Mostramos el array en el mismo orden por pantalla
		System.out.println(Arrays.toString(numeros));
		
		// Cerramos el scanner
		reader.close();
		
	}
}
