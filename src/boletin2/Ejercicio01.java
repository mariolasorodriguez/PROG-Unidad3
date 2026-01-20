package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaramos las variables
		int tamaño;
		int valor;
		
		// Pedimos tamaño y valor
		System.out.print("Introduce un tamaño: ");
		tamaño = reader.nextInt();
		
		System.out.print("Introduce un valor: ");
		valor = reader.nextInt();
		
		// Creamos el array
		int numeros[] = new int[tamaño];
		
		// Llenamos el array
		for (int i = 0; i < numeros.length; i++) {
				numeros[i] = valor;
		}
		
		// Mostramos el array
		System.out.println("--- ARRAY ---");
		System.out.println(Arrays.toString(numeros));
		
	}
}
