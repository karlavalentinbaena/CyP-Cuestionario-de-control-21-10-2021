package tareaDos;

public class MainADT {
	public static void main(String[] args) {
		ArregloADT<String> info = new ArregloADT<>(5);
		// getLongitud
		System.out.println("El tama�o del arreglo es de:" + info.getLongitud());
		// setElemento
		info.setElemento(3, "H");
		System.out.println("el elemento en la posici�n 3 es:" + info.getElemento(3));
		info.setElemento(0, "K");
		// getElemento
		System.out.println("El elemento en la posici�n 0 es:" + info.getElemento(0));
		// limpiar
		info.limpiarInformacion();
		// toString
		System.out.println(info);
	}
}
