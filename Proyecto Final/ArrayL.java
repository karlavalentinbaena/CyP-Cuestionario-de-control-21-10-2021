package Proyecto;

import java.util.ArrayList;

//Clase ArrayList

public class ArrayL {
	public static void main(String[] args) {
		ArrayList<String> navidad = new ArrayList<>();

		// M�todo add que va agregando cosas
		navidad.add("luces");
		navidad.add("pi�ata");
		navidad.add("violin");
		navidad.add("pan de muerto");
		navidad.add("esferas");
		System.out.println("Cosas para navidad:" + navidad);

		// M�todo remove(): Elimina un elemento de acuerdo a su posici�n
		navidad.remove(3);
		navidad.remove(2);
		System.out.println("Se eliminaron cosas que no son de navidad, entonces la lista es:" + navidad);

		// M�todo size: para saber el tama�o
		System.out.println("El n�mero de elementos es:" + navidad.size());

		// M�todo get: Obtener un elemento del indice que se elija
		System.out.println("El elemento con indice 0 es:" + navidad.get(0));

		// M�todo clear: borrar todos los elementos
		navidad.clear();
		System.out.println(navidad.toString()); // se nota que ya no hay nada en la lista

		// M�todo contains
		navidad.contains("luces");

	}

}
