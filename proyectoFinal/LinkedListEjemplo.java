package proyectoFinal;

import java.util.LinkedList;

public class LinkedListEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		/*
		 * Se verifica si la lista esta vacia o no
		 * mediante el metodo isEmpty
		 */
		System.out.println("La lista esta vacia? " + lista.isEmpty());
		System.out.println("---------------------------------");
		
		/*
		 * Se agregan elementos a la lista
		 * mediante el metodo add
		 */
		lista.add(10);
		lista.add(20);
		lista.add(50);
		lista.add(70);
		lista.add(90);
		System.out.println(lista);
		System.out.println("---------------------------------");
		
		/*
		 * Se agrega un elemento al principio
		 * de la lista con el metodo addFirts
		 */
		lista.addFirst(5);
		System.out.println(lista);
		System.out.println("---------------------------------");
		
		/*
		 * Se agrega un elemento al final 
		 * de la lista con el metodo addLast
		 */
		lista.addLast(100);
		System.out.println(lista);
		System.out.println("---------------------------------");
		
		/*
		 * Inserta elementos en una posicion
		 * determinada por medio del indice en
		 * la lista con el metodo add
		 */
		lista.add(3, 30);
		System.out.println(lista);
		System.out.println("---------------------------------");
		
		/*
		 * Cambiar un elemento de la lista
		 * por medio del indice con el 
		 * metodo set
		 */
		lista.set(0, 250);
		lista.set(5, 45);
		lista.set(7, 600);
		System.out.println(lista);
		System.out.println("---------------------------------");
		
		/*
		 * Eliminar el primer elemento de
		 * la lista con el metodo removeFirst
		 */
		lista.removeFirst();
		System.out.println(lista);
		System.out.println("---------------------------------");
		
		/*
		 * Eliminar el ultimo elemento de
		 * la lista con el metodo removeLast
		 */
		lista.removeLast();
		System.out.println(lista);
		System.out.println("---------------------------------");
		
		/*
		 * Eliminar un elemento en 
		 * una posiscion especifica mediante 
		 * su indice con el metodo remove
		 */
		lista.remove(4);
		System.out.println(lista);
		System.out.println("---------------------------------");
		
		/*
		 * Se muestra el tamaño actual
		 * de la lista con el metodo 
		 * size
		 */
		System.out.println("El tamaño de la lista es de " + lista.size() + " elementos");
		System.out.println("---------------------------------");
		
		/*
		 * Se eliminan todos los elementos
		 * existentes dentro de la lista
		 * con el metodo clear
		 */
		System.out.println("Lista antes del metodo");
		System.out.println(lista);
		System.out.println();
		lista.clear();
		System.out.println("Lista despues del metodo");
		System.out.println(lista);
	}

}
