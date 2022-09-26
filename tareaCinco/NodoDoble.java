package tareaCinco;

public class NodoDoble<T> {
	private T dato;
	private NodoDoble<T> siguiente;
	private NodoDoble<T> anterior;
	
	public NodoDoble() {
		// TODO Auto-generated constructor stub
	}

	public NodoDoble(T valor) {
		this.dato = valor;
	}

	public NodoDoble(T valor, NodoDoble<T> siguiente, NodoDoble<T> anterior) {
		this.dato = valor;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public NodoDoble<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble<T> siguiente) {
		this.siguiente = siguiente;
	}

	public NodoDoble<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble<T> anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "|" + dato + "| <--> ";
	}
	
			
}
