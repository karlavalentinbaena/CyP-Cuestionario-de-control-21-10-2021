package Proyecto;

//Clase LinkedList
import java.util.LinkedList;

public class LinkedL {
	public static void main(String[] args) {
		LinkedList<String> patos1 = new LinkedList();

		String nombre1 = "Aar�n";
		String nombre2 = "Lalo";
		String nombre3 = "Gabriel";
		String nombre4 = "Jaasiel";
		String nombre5 = "Fernando";

		// M�todo add
		patos1.add(nombre1);
		patos1.add(nombre2);
		patos1.add(nombre3);
		patos1.add(nombre4);
		patos1.add(nombre5);

		// para recorrer la lista:
		System.out.println(patos1);

		// Otra manera de recorrer la lista:
		/*
		 * for(String nombres : patos) { System.out.println(patos); }
		 */

		// M�todo a�adir primero
		String nombre6 = "Tobi";
		patos1.addFirst(nombre6);
		System.out.println("Ahora el nombre del primer pato es:");
		for (String nombres : patos1) {
			System.out.println(patos1);
		}

		// M�todo tama�o de LinkedList

		System.out.println("El tama�o de la lista de patos es:" + patos1.size());

		// M�todo para obtener el primer elemento de la lista

		System.out.println("El primer pato de la lista es:" + patos1.getFirst());

		// M�todo para obtener al �ltimo

		System.out.println("El �ltimo pato de la lista es:" + patos1.getLast());

		/*
		 * M�todo addAll: sirve para rellenar una nueva lista con elementos de otra ya
		 * existente
		 */

		LinkedList<String> patos2 = new LinkedList();

		patos2.addAll(patos1);
		System.out.println("Se esta copiando lista 1 a 2");
		for (String nombres : patos2) {
			System.out.println(patos2);
		}
		System.out.println("La lista de patos 1, fue copiada a la lista 2 exitosamente");

	}

}
