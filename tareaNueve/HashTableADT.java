package tareaNueve;

import java.util.ArrayList;

public class HashTableADT<T> {

	ArregloADT<ArrayList> tablaHash;
	int table_size;

	public HashTableADT(int table_size) {
		// TODO Auto-generated constructor stub
		this.table_size = table_size;
		
		if (table_size % 2 == 0) {
			this.table_size = table_size + 1;
			tablaHash = new ArregloADT<>(table_size);
		} else {
			tablaHash = new ArregloADT<>(table_size);
		}
	}

	public void Add(int key, T value) {
		int posicion = key % table_size;
		tablaHash.getElemento(posicion).add(value);
	}

	public T valueOf(int key) {
		int posicion = key % table_size;
		Object elemHallado = null;

		if (tablaHash.getElemento(posicion).size() == 1) {
			return (T) tablaHash.getElemento(posicion).get(0);
		} else {
			for (int i = 0; i < tablaHash.getElemento(posicion).size(); i++) {
				if (tablaHash.getElemento(posicion).get(i).equals(key)) {
					elemHallado = tablaHash.getElemento(posicion).get(i);
					System.out.println("El elemento se encuentra en la posición " + i);
				}
			}
		}
		return (T) elemHallado;
	}

	public void Remove(int key) {
		int posicion = key % table_size;

		if (tablaHash.getElemento(posicion).size() == 1) {
			tablaHash.getElemento(posicion).remove(0);
		} else {
			for (int i = 0; i < tablaHash.getElemento(posicion).size(); i++) {
				if (tablaHash.getElemento(posicion).get(i).equals(key)) {
					tablaHash.getElemento(posicion).remove(i);
				}
			}
		}
	}

}
