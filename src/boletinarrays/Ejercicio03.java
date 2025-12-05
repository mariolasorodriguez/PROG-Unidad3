package boletinarrays;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declarar variables y arrays
		int[] numeros = new int[10];
		
		// Rellenar el array con numeros introducidos por el usuario
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce un numero entero: ");
			numeros[i] = reader.nextInt();
		}
		
		// Mostrar los numeros en orden inverso (FALTA ARREGLAR)
		Arrays.sort(numeros);
		System.out.println("Numeros en orden inverso:" + Arrays.toString(numeros));
		
		// Cerrar el scanner
		reader.close();
	}
}
