package listaSimpleLigada;

// Karla Valentin Baena

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ADTTablasHash<T> {
	ArregloADT<ArrayList> TabHash;
    int tam;

    public ADTTablasHash(int tam) {
        this.tam = tam;
        if (tam < 7) {
            this.tam = 7;
            TabHash= new ArregloADT(tam);
        } else {
            double res = tam % 2;
            if ((tam % 2) == 0) { 
                this.tam = tam + 1;
                TabHash = new ArregloADT(tam);
            } else { 
            	TabHash = new ArregloADT(tam);
            }
        }
        for (int i = 0; i < tam; i++) {
        	TabHash.setElemento(i, new ArrayList());
        }
    }

    public void agregarE(int llave, T valor) {
        int posici�n = llave % tam;
        TabHash.getElemento(posici�n).add(valor);
    }

    public T valor(int llave) {
        int posici�n = llave % tam;
        Object fi=null;
        Object enc = null;

        if (TabHash.getElemento(posici�n).size() == 1) {
            return (T) TabHash.getElemento(posici�n).get(0);
        } else {       
            for (int j = 0; j < TabHash.getElemento(posici�n).size(); j++) {
                if (TabHash.getElemento(posici�n).get(j).equals(fi)) {
                    enc = TabHash.getElemento(posici�n).get(j);
                    System.out.println("Est� en: " + j);
                }
            }
        
        return (T) fi;
}
    }

    public void eliminar(int llave) {
        int posici�n = llave % tam;
        Object fi;
        if (TabHash.getElemento(posici�n).size() == 1) {
        	TabHash.getElemento(posici�n).remove(0);
        } else {
            for (int j = 0; j < TabHash.getElemento(posici�n).size(); j++) {
                //if (TabHash.getElemento(posici�n).get(j).equals(fi)) {
                	TabHash.getElemento(posici�n).remove(j);
                }
            }
        }
    

    public static void main(String[] args) {
    	ADTTablasHash Tabla = new ADTTablasHash(8);
    	Tabla.agregarE(176, "Hola");
    	Tabla.agregarE(737, "Crayola");
    	Tabla.agregarE(838, "Fresa");
    	Tabla.agregarE(722, "Chocolate");
        System.out.println(Tabla.valor(737));
        Tabla.eliminar(838);
    }
}


