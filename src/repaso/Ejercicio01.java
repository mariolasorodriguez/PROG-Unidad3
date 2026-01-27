package repaso;

import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca una frase
		System.out.print("Introduce una frase: ");
		String frase = reader.nextLine();
		
		// Obtenemos las palabras de la frase
		String[] palabras = obtenerPalabras(frase);
		
		// Contamos las palabras largas
		int numPalabrasLargas = contarPalabrasLargas(palabras, 5);
		
		// Obtenemos la palabra más larga
		String[] palabraLarga = palabraMasLarga(palabras);
		
		// Mostramos los resultados
		mostrarResultados(palabras, numPalabrasLargas, palabraLarga);
		
		reader.close();
		
	}
	
	/*
	 * @param Función que obtiene las palabras de una frase
	 * String frase (Frase introducida por el usuario)
	 * @return Array con las palabras de la frase
	 */
	
	static String[] obtenerPalabras(String frase) {
		String fraseFinal;
		// Quitamos espacios al principio y al final y pasamos a minúsculas
		fraseFinal = frase.trim();
		fraseFinal = frase.toLowerCase();
		// Creamos el array de palabras y separamos por espacios
		String[] palabras = fraseFinal.split(" ");
		// Devolvemos el array de palabras
		return palabras;
	}
	
	/*
	 * @param Función que cuenta las palabras largas en un array de palabras
	 * String[] palabras (Array de palabras)
	 * int longitudMinima (Longitud mínima para considerar una palabra larga)
	 * @return Número de palabras largas
	 */
	
	static int contarPalabrasLargas(String[] palabras, int longitudMinima) {
		longitudMinima = 5;
		int contador = 0;
		for (int i = 0; i < palabras.length; i++) {
			if(palabras[i].length() >= longitudMinima) {
				contador++;
			}
		}
		return contador;
	}
	
	/*
	 * @param Función que obtiene la palabra más larga de un array de palabras
	 * String[] palabras (Array de palabras)
	 * @return Array con la palabra más larga
	 */
	
	static String[] palabraMasLarga(String[] palabras) {
		String palabraLarga = "";
		for (int i = 0; i < palabras.length; i++) {
			if(palabras[i].length() > palabraLarga.length()) {
				palabraLarga = palabras[i];
			}
		}
		String[] resultado = {palabraLarga};
		return resultado;
	}
	
	/* 
	 * @param Función que muestra los resultados por pantalla
	 * String[] palabras (Array de palabras de la frase)
	 * int numPalabrasLargas (Número de palabras largas)
	 * String[] palabraLarga (Array con la palabra más larga)
	 */
	
	static void mostrarResultados(String[] palabras, int numPalabrasLargas, String[] palabraLarga) {
		System.out.println("Palabras de la frase: " + String.join(", ", palabras));
		System.out.println("Palabras Totales: " + palabras.length);
		System.out.println("Número de palabras largas (5 o más letras): " + numPalabrasLargas);
		System.out.println("Palabra más larga: " + palabraLarga[0]);
	}
}
