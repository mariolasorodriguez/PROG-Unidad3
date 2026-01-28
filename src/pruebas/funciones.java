package pruebas;

public class funciones {
	public static void main(String[] args) {
		saludo("Mario");
		System.out.println(suma(1,2));
	}
	
	static void saludo(String nombre) {
		System.out.println("Hola que haces " + nombre);
	}
	
	static int suma(int n1, int n2) {
		return n1 + n2;
	}
}
