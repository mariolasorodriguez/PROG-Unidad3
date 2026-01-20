package boletin1;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		
		//Creamos un Scanner para leer datos
		Scanner reader = new Scanner(System.in); 
		
		//Declaramos un array de longitud 8
		int numeros[] = new int [8];
		
		//Pedimos al usuario que introduzca 8 números enteros
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduza un número entero:");
			numeros[i] = reader.nextInt();
		} 
		
		//Recorremos el array y mostramos los numeros diciendo si son pares o impares
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 ==0) {
				System.out.println("El número " + numeros[i] + " es par.");
			} else {
				System.out.println("El número " + numeros[i] + " es impar.");
			}
		}
		
		//Cerramos el Scanner
		reader.close();
	}
}
