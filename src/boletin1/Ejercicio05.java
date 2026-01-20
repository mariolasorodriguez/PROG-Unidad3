package boletin1;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {

		// Definimos el scanner
		Scanner reader = new Scanner(System.in);
		
		double numeros[] = new double[10];
		
		// Leemos los diez números y los guardamos en el array
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce un numero real: ");
			numeros[i] = reader.nextDouble();
		}
		
		//Recorremos el array y hacemos la suma de los números 
		double suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		//Averiguamos el número mayor de la tabla
		
		double mayor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		
		//Averiguamos el número menor de la tabla
		
		double menor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		//Mostramos la suma, el número mayor y el número menor
		
		System.out.println("La suma de los números es: " + suma);
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
		
		
		reader.close();
	}
}
