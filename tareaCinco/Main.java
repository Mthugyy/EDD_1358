package tareaCinco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDobleLigada<Integer> listaDoble = new ListaDobleLigada<>();
		
		System.out.println("Inicializando lista doblemente enlazada");
		listaDoble.agregarAlFinal(10);
		listaDoble.agregarAlFinal(20);
		listaDoble.agregarAlFinal(30);
		listaDoble.agregarAlFinal(50);
		listaDoble.transversal();
		System.out.println();
		listaDoble.agregarAlInicio(5);
		listaDoble.transversal();
		System.out.println();
		listaDoble.agregarDespuesDe(40, 4);
		listaDoble.transversal();
		System.out.println();
		listaDoble.eliminar(3);
		listaDoble.transversal();
		System.out.println();
		listaDoble.eliminarElPrimero();
		listaDoble.transversal();
		System.out.println();
		listaDoble.eliminarElFinal();
		listaDoble.transversal();
		System.out.println();
		//listaDoble.buscar(40);
		//listaDoble.transversal();
		System.out.println();
		listaDoble.actualizar(40, 30);
		listaDoble.transversal();
	}

}
