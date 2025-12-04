package pruebas;

import java.util.Arrays;

public class arraybasico {
	public static void main(String[] args) {

		// Array normal

		int[] numeros = new int[1000];

		int numeroactual = 1;

		for (int i = 0; i < 1000; i++) {
			numeros[i] = numeroactual;
			numeroactual++;
		}

		System.out.println(Arrays.toString(numeros));

	}
}
