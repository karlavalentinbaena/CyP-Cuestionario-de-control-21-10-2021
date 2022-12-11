package Proyecto;

import java.util.Stack;

public class StackADT {
	public static void main(String[] args) {
		Stack<Integer> pila = new Stack<Integer>();

		System.out.println("�En este momento la pila est� vac�a? " + pila.isEmpty());

		// Agregar elementos
		pila.push(11);
		pila.push(9);
		pila.push(3);
		pila.push(15);

		// Hacer recorrido
		for (Integer datos : pila) {
			System.out.println(datos);
		}

		System.out.println("La pila es:" + pila);
		System.out.println("�Est� vac�a la pila?: " + pila.isEmpty());

		// Eliminar �ltimo dato que entr�
		pila.pop();
		System.out.println("Despu�s de aplicar pop queda: " + pila);

		// Buscar un elemento
		System.out.println("�En qu� indice est� el n�mero 9? " + pila.search(9));

		// Obtener el �ltimo valor
		System.out.println("El �ltimo valo es: " + pila.peek());
	}
}
