package tareaCinco;

public class ListaDobleLigada<T> {
	
	NodoDoble<T> head;
	int tamanio;
	
	public ListaDobleLigada() {
		// TODO Auto-generated constructor stub
		this.head = null;
		this.tamanio = 0;
	}
	
	public boolean estaVacia() {
		return this.head == null;
	}

	public int getTamanio() {
		return tamanio;
	}
	
	public void agregarAlFinal(T valor) {
		NodoDoble nuevo = new NodoDoble(valor);
		
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			NodoDoble tmp = this.head;
			while (tmp.getSiguiente() != null) {
				tmp = tmp.getSiguiente();
				nuevo.setAnterior(tmp);
			}
			tmp.setSiguiente(nuevo);
			nuevo.setAnterior(tmp);
			tmp = null;
			nuevo = null;
		}
	}
	
	public void agregarAlInicio(T valor) {
		NodoDoble nuevo = new NodoDoble(valor);
		
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			nuevo.setSiguiente(this.head);
			this.head.setAnterior(nuevo);
			this.head = nuevo;
		}
		//System.out.println(head);
	}
	
	public void agregarDespuesDe(T valor, int posicion) {
		NodoDoble nuevo = new NodoDoble(valor);
		NodoDoble tmp = this.head;
		
		for (int contador = 1; contador <= posicion - 1; contador++) {
			tmp = tmp.getSiguiente();
		}
		nuevo.setSiguiente(tmp.getSiguiente());
		nuevo.setAnterior(tmp);
		tmp.getSiguiente().setAnterior(nuevo);
		tmp.setSiguiente(nuevo);
	}
	
	public void eliminar(int posicion) {
		NodoDoble tmp = this.head;
		
		for (int contador = 1; contador <= posicion - 1; contador++) {
			tmp = tmp.getSiguiente();
			//System.out.print(tmp);
		}
		tmp.setSiguiente(tmp.getSiguiente().getSiguiente());
		tmp.getSiguiente().getSiguiente().setAnterior(tmp.getAnterior().getAnterior());
	}
	
	public void eliminarElPrimero() {
		this.head.setSiguiente(this.head = this.head.getSiguiente());
		this.head.getAnterior().setAnterior(null);
		//System.out.println(head);
	}
	
	public void eliminarElFinal() {
		NodoDoble tmp = this.head;
		NodoDoble tmp2 = this.head.getSiguiente();
		
		while (tmp2.getSiguiente() != null) {
			tmp2 = tmp2.getSiguiente();
			tmp = tmp.getSiguiente();
		}
		tmp.setSiguiente(null);
	}
	
	public int buscar (T valor) {
		NodoDoble tmp = this.head;
		int posicion = 0;
		
		while (tmp.getSiguiente() != null) {
			tmp = tmp.getSiguiente();
			posicion++;
			if (valor == tmp.getDato()) {
				return posicion + 1;
			}
		}
		return 0;
	}
	
	//No encuentro la forma de hacer funcionar el metodo :(
	public void actualizar (T a_buscar, T valor) {
		NodoDoble tmp = this.head;
		
		while (tmp.getDato() != a_buscar) {
			tmp = tmp.getSiguiente();
		}
		tmp.setDato(valor);
	}
	
	public void transversal() {
		NodoDoble curr_node = this.head;
		
		while (curr_node != null) {
			System.out.print(curr_node);
			curr_node = curr_node.getSiguiente();
		}
		System.out.println("");
	}
}
