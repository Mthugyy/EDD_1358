package proyectoFinal;

import java.util.Stack;

public class StackEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pila = new Stack<String>();
		
		/*
		 * Se verifica si la pila esta vacia o no
		 * mediante el metodo isEmpty
		 */
		System.out.println("La lista esta vacia? " + pila.isEmpty());
		System.out.println("---------------------------------");
		
		/*
		 * Se agregan elementos a la pila
		 * mediante el metodo push
		 */
		pila.push("Brazil");
		pila.push("Belgica");
		pila.push("Argentina");
		pila.push("Francia");
		pila.push("Inglaterra");
		System.out.println(pila);
		System.out.println("---------------------------------");
		
		/*
		 * Eliminar el ultimo elemento 
		 * añadido a la pila con el 
		 * metodo pop
		 */
		pila.pop();
		System.out.println(pila);
		System.out.println("---------------------------------");
		
		/*
		 * Se muestra el ultimo elemento
		 * que se encuentra en la lista
		 * con el metodo peek
		 */
		System.out.println("El ultimo elemento en la pila es: " + pila.peek());
		System.out.println("---------------------------------");
		
		/*
		 * Se muestra el tamaño actual
		 * de la pila con el metodo 
		 * size
		 */
		System.out.println("El tamaño de la pila es de " + pila.size() + " elementos");
		System.out.println("---------------------------------");
		
		/*
		 * Se eliminan todos los elementos
		 * existentes dentro de la pila
		 * con el metodo clear
		 */
		System.out.println("Pila antes del metodo");
		System.out.println(pila);
		System.out.println();
		pila.clear();
		System.out.println("Pila despues del metodo");
		System.out.println(pila);
		
	}

}
