package proyectoFinal;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List persona = new ArrayList();
		
		/*
		 * Se verifica si la lista esta vacia o no
		 * mediante el metodo isEmpty
		 */
		System.out.println("La lista esta vacia? " + persona.isEmpty());
		System.out.println("---------------------------------");
		
		/*
		 * Se agregan elementos a la lista
		 * mediante el metodo add
		 */
		persona.add("Ana");
		persona.add("Pedro");
		persona.add("Monica");
		persona.add("Guillermo");
		persona.add("Hanna");
		persona.add("Roberto");
		persona.add("Estefania");
		persona.add("Leonel");
		persona.add("Diana");
		persona.add("Samantha");
		System.out.println(persona);		
		System.out.println("---------------------------------");
		
		/*
		 * Se eliminan elementos de la lista
		 * accediendo a ellos mediante su indice
		 * con el metodo remove
		 */
		persona.remove(0);
		System.out.println(persona);
		System.out.println("---------------------------------");
		persona.remove(1);
		System.out.println(persona);
		System.out.println("---------------------------------");
		
		/*
		 * Se busca un elemento en la lista
		 * accediendo a el mediante su indice
		 * con el metodo get
		 */
		System.out.println(persona.get(2));
		System.out.println(persona.get(4));
		System.out.println(persona.get(6));
		System.out.println("---------------------------------");
		
		/*
		 * Se verifica si existe cierto elemento
		 * en la lista con el metodo contains
		 */
		System.out.println(persona.contains("Juan"));
		System.out.println(persona.contains("Roberto"));
		System.out.println("---------------------------------");
		
		/*
		 * Se muestra el tamaño actual
		 * de la lista con el metodo 
		 * size
		 */
		System.out.println("La lista tiene un tamaño de " + persona.size() + " elementos");
		System.out.println("---------------------------------");
		
		/*
		 * Se eliminan todos los elementos
		 * existentes dentro de la lista
		 * con el metodo clear
		 */
		System.out.println("Lista antes del metodo");
		System.out.println(persona);
		System.out.println();
		System.out.println("Lista despues del metodo");
		persona.clear();
		System.out.println(persona);
	}

}
