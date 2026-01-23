package repaso;

public class Ejercicio03 {
	public static void main(String[] args) {

		// Definir texto y array de claves a buscar
		
		String texto = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme3, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor";
		String[] claves = { "mancha", "hidalgo", "sevilla", "caballo", "lanza", "java" };
		String[] encontradas = palabrasEncontradas(texto, claves);
		
		mostrarResultado(encontradas);
		
		
	}
	
	/*
	 * @param Función que mira si hay una palabra en un texto dado
	 * String texto (El texto donde buscar)
	 * String palabra (Palabra de busqueda)
	 * @return true o false dependiendo si esta o no la palabra
	 */
	static boolean contienePalabra(String texto, String palabra) {
		String textoMinus =  texto.toLowerCase();
		String palabraMinus = palabra.toLowerCase();
		return textoMinus.contains(palabraMinus);
	}
	
	static String[] palabrasEncontradas(String texto, String[] claves) {
		int contador = 0;
		for (int i = 0; i < claves.length; i++) {
			if(contienePalabra(texto,claves[i])) {
				contador++;
			}
		}
		
		String[] resultado = new String[contador];
		
		int pos = 0;
		
		for (int i = 0; i < claves.length; i++) {
			if(contienePalabra(texto,claves[i])) {
				resultado[pos] = claves[i];
				pos++;
			}
		}
		
		return resultado;
	}
	
	static void mostrarResultado(String[] encontradas) {
		if (encontradas.length == 0) {
			System.out.println("No se han encontrado palabras clave en el texto");
		} else {
			System.out.println("Palabras encontradas: ");
			for (int i = 0; i < encontradas.length ; i++) {
				System.out.print(encontradas[i]);
				if (i < encontradas.length - 1) {
					System.out.print(", ");
				}
			}
		}
	}
	
	
	
	
}
