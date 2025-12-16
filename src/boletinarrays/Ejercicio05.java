package boletinarrays;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		
		// Creamos un scanner
		Scanner reader = new Scanner(System.in);
		
		// Definimos el array
		double[] numeros = new double[10];
		
		// Pedimos los 10 numeros por teclado
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce un numero real: ");
			numeros[i] = reader.nextDouble();
		}
		
		// Recorremos el array para sumarlo
		double suma = 0;
		for (int i = 0; i < 10; i++) {
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
		
		// Mostramos los resultados
		System.out.println("Suma de los numeros: " + suma);
		System.out.println("Numero Mayor: " + mayor);
		System.out.println("Numero menor: " + menor);
		
		// Cerramos el scanner
		reader.close();
		
	}
}
