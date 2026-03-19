package coleccionespt2;

import java.util.ArrayList;

import java.util.Collections;

public class Ejercicio01 {
	
	static ArrayList<Integer> lista = new ArrayList<>();
	
	public static void main(String[] args) {
		llenarLista(lista);
		
		System.out.println("Lista sin mezclar: ");
		mostrarLista(lista);
		
		mezclarLista(lista);
		
		System.out.println("Lista Mezclada: ");
		mostrarLista(lista);
	}
	
	/**
	 * Funcion que rellena la lista con numeros del 1 al 10
	 * @param lista
	 */
	static void llenarLista(ArrayList <Integer> lista) {
		for (int indice = 1; indice < 11; indice++) {
			lista.add(indice);
		}
	}
	
	
	/**
	 * Funcion que muestra la lista
	 * @param lista
	 */
	static void mostrarLista(ArrayList <Integer> lista) {
		System.out.println(lista.toString());
	}
	
	/**
	 * Funcion que mezcla la lista de manera aleatoria
	 * @param lista
	 */
	static void mezclarLista(ArrayList <Integer> lista) {
		Collections.shuffle(lista);
	}
	
}
