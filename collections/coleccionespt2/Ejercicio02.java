package coleccionespt2;

import java.util.HashSet;

public class Ejercicio02 {

    static HashSet<Integer> listaNumeros = new HashSet<>();

    public static void main(String[] args) {
        llenarLista(listaNumeros);
        System.out.println("Lista numeros: " + listaNumeros);
    }

    /**
     * Metodo que llena el set de 10 numeros enteros aleatorios del 1 al 20
     * @param lista
     */
    static void llenarLista(HashSet<Integer> lista) {
        while (lista.size() < 10) {
            lista.add((int)(Math.random() * 20) + 1);
        }
    }
}
