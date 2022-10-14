package tareaSeis;

public class StackADT<T> {

	Pila<T> tope;
	int tamanio;

	public StackADT() {
		// TODO Auto-generated constructor stub
		this.tope = null;
		this.tamanio = 0;
	}

	public boolean estaVacia() {
		return this.tope == null;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void push(T valor) {
		Pila nuevo = new Pila(valor);

		this.tope = nuevo;
		tamanio++;
	}

	public T pop() {
		T tmp;

		if (this.estaVacia()) {
			return null;
		} else {
			tmp = tope.getDato();
			tope = tope.getAnterior();
			tamanio--;
			return tmp;
		}
	}

	public T peek() {
		if (this.estaVacia()) {
			return null;
		} else {
			return tope.getDato();
		}
	}
}
