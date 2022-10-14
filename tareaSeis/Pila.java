package tareaSeis;

public class Pila<T> {
	private T dato;
	private Pila<T> siguiente;
	private Pila<T> anterior;

	public Pila(T valor) {
		// TODO Auto-generated constructor stub
		this.dato = valor;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public Pila<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Pila<T> sigueinte) {
		this.siguiente = sigueinte;
	}

	public Pila<T> getAnterior() {
		return anterior;
	}

}
