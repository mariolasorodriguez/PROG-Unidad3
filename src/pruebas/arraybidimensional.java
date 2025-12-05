package pruebas;

import java.util.Arrays;

public class arraybidimensional {

	public static void main(String[] args) {
		// Array bidimensional

		int[][] numeros = new int[5][5];

		int numeroactual = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				numeros[i][j] = numeroactual;
				numeroactual++;
			}
		}

		System.out.println(Arrays.deepToString(numeros));
	}

}
