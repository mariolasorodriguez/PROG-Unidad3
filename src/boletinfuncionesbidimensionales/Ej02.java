package boletinfuncionesbidimensionales;

/**
 * Ejercicio 2
 * @author mario.laso@iesnervion.es
 * */

public class Ej02 {
	
	public static void main(String[] args) {

		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] transpuesta = transponer(matriz);

		// Aqui llamaremos a la función

		System.out.println("Original: ");
		imprimirMatriz(matriz);

		System.out.println("Transpuesta: ");
		imprimirMatriz(transpuesta);
	}

	/**
	 * Funcion que transpone una matriz rectangular
	 * 
	 * @param matriz array bidimensional
	 * 
	 * @return array bidimensional matriz transpuesta de la original
	 */

	public static int[][] transponer(int[][] matriz) {
		if (matriz == null) {
			throw new IllegalArgumentException("La matriz no puede ser nula");
		}
		if (matriz.length == 0 || matriz[0] == null) {
			throw new IllegalArgumentException("La matriz tiene que tener al menos una fila");
		}

		int filas = matriz.length;
		int columnas = matriz[0].length;

		for (int indiceFila = 0; indiceFila < filas; indiceFila++) {
			if (matriz[indiceFila] == null || matriz[indiceFila].length != columnas) {
				throw new IllegalArgumentException("Todas las filas deben tener el mismo número de columnas");
			}

		}

		int[][] resultado = new int[columnas][filas];

		for (int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				resultado[columna][fila] = matriz[fila][columna];

			}
		}

		return resultado;

	}

	/**
	 * Funcion que imprime las matrices original y transpuesta
	 * 
	 * @param matriz array bidimensional y resultado array bidimensional
	 * 
	 */

	public static void imprimirMatriz(int[][] matriz) {

		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.print(matriz[fila][columna] + "\t");
			}
			System.out.println();
		}
	}
}