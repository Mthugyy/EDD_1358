package tareaDos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArregloADT<Object> lista = new ArregloADT<>(5);

		int numEntero = 22;
		float numDecimal = 8.26f;
		boolean booleano = false;

		lista.setElemento(0, numEntero);
		lista.setElemento(1, numDecimal);
		lista.setElemento(2, "Fear the Tribe");
		lista.setElemento(3, booleano);
		lista.setElemento(4, new Perro("Milaneso", "Pug", 6));

		System.out.println("Longitud del ArregloADT = " + lista.getLongitud());

		System.out.println();

		for (int i = 0; i < lista.getLongitud(); i++) {
			System.out.println(lista.getElemento(i).toString());
		}

		System.out.println();

		lista.clean("Vacio");

		for (int i = 0; i < lista.getLongitud(); i++) {
			System.out.println(lista.getElemento(i));
		}

	}
}
