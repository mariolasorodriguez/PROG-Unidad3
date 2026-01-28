package boletin2;

import java.util.Scanner;

public class Ejercicio05 {
	
	public static void main(String[] args) {
		
		// Definimos scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos el array
		int numeros[] = new int[1000];
		
		// Rellenamos con valores entre 0 y 99
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = (int) (Math.random() * 100);
		}
		
		// Preguntamos el valor
		System.out.print("Introduce un numero a buscar: ");
		int numBuscado;
		numBuscado = reader.nextInt();
		
		// Buscamos el valor
		int contador = 0;
		for (int numeroActual : numeros) {
			if (numeros[numeroActual] == numBuscado) {
				contador++;
			}
		}
		
		// Mostramos el resultado
		if (contador > 0) {
            System.out.println("El numero " + numBuscado + " se encuentra " + contador + " veces.");
		} else {
            System.out.println("El numero " + numBuscado + " no se encuentra en el array.");
		}
		
		
		reader.close();
	}
}
