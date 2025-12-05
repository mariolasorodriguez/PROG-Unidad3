package boletinarrays;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Declarar variables y arrays		
		String[] meses = {
			"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
			"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
		};
		
		double[] temperaturas = new double[meses.length];
		
		// Rellenar el array de temperaturas
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Introduce la temperatura media de " + meses[i] + ": ");
			temperaturas[i] = reader.nextDouble();
		}
		
		// Mostrar las temperaturas medias de cada mes en un diagrama de barras horizontal
		System.out.println("Diagrama de barras de temperaturas medias:");
		for (int i = 0; i < meses.length; i++) {
			System.out.print(meses[i] + ": ");
			int barras = (int) temperaturas[i];
			for (int j = 0; j < barras; j++) {
				System.out.print("|");
			}
			System.out.println(" " + temperaturas[i] + "°C");
		}

		// Cerrar el scanner
		reader.close();
	}
}
