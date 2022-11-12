package tareaOcho;

public class Nodo<T> {
	T dato;
	int prioridad;
	Nodo<T> siguiente;

	public Nodo() {
		// TODO Auto-generated constructor stub
	}

	public Nodo(T valor) {
		this.dato = valor;
	}

	public Nodo(T info, Nodo<T> siguiente) {
		// TODO Auto-generated constructor stub
		this.dato = info;
		this.siguiente = siguiente;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(int p, T dato) {
		this.dato = dato;
		this.prioridad = p;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public String toString() {
		return "[" + prioridad + "]" + "|" + dato + "| --> ";
	}
	
}
