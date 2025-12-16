package boletinarrays;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Definimos el array
		int[] numeros = new int[8];

		// Pedimos al usuario los 8 numeros
		for (int i = 0; i < 8; i++) {
			System.out.print("Introduce un numero entero: ");
			numeros[i] = reader.nextInt();
		}

		// Calcular numeros pares e impares y mostrarlos
		for (int i = 0; i < numeros.length; i++) {
			// Evaluamos cada numero individualmente aqui
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " es PAR");
			} else {
				System.out.println(numeros[i] + " es IMPAR");
			}
		}
		
		// Cerramos el scanner
		reader.close();
	}
}
