package boletinarraysbidimensionales;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creamos el array con 3 filas y 6 columnas
		int[][] num = new int[3][6];
		
		// Rellenamos las columnas del array según la tabla
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		
		// Visualizamos en forma de tabla con bucles for para las filas y otro para las columnas
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "	");
			}
			System.out.println();
		}
	}

}
