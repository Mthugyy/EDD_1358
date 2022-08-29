package tareaDos;

import java.util.ArrayList;

public class ArregloADT<T> {

	private int tamanio;
	private ArrayList<T> datos;

	public ArregloADT(int tamanio) {
		datos = new ArrayList<>();
		this.tamanio = tamanio;

		for (int j = 0; j < tamanio; j++) {
			datos.add(null);
		}
	}

	public int getLongitud() {
		return tamanio;
	}

	public void setElemento(int indice, T Elemento) {

		if (indice >= 0 && indice < this.tamanio) {
			datos.set(indice, Elemento);
		}
	}

	public T getElemento(int indice) {

		if (indice >= 0 && indice < this.tamanio) {
			return datos.get(indice);
		}
		return null;
	}

	public void clean(T dato) {

		for (int i = 0; i < tamanio; i++) {
			datos.set(i, dato);
		}
	}

	public String toString() {
		return " + [datos.toString()]";
	}
}
