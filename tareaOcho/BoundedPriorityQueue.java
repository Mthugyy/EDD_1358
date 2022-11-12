package tareaOcho;

public class BoundedPriorityQueue<T> {

	Nodo<T> head;
	Nodo<T> colaAcotada;
	int longitud;
	int importancia;
	
	public BoundedPriorityQueue(int niveles) {
		// TODO Auto-generated constructor stub
		this.head = null;
		this.colaAcotada = null;
		this.longitud = 0;
		this.importancia = niveles;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public int longitud() {
		return longitud;
	}
	
	public void enqueue(int p, String elemento) {
		Nodo<T> nuevo = new Nodo();
		nuevo.setDato(p, (T) elemento);
		nuevo.setSiguiente(null);
		
		if (this.isEmpty()) {
			this.head = nuevo;
		} else {
			colaAcotada.setSiguiente(nuevo);
		}
		colaAcotada = nuevo;
		longitud++;
	}
	
	public T dequeue() {
		T info = this.head.dato;
		this.head = this.head.siguiente;
		
		if (this.isEmpty()) {
			colaAcotada = null;
		}
		longitud--;
		return info;
	}
	
	public void transversal() {
		Nodo curr_node = this.head;
		
		while (curr_node != null) {
			System.out.print(curr_node);
			curr_node = curr_node.getSiguiente();
		}
		System.out.println("");
	}
}
