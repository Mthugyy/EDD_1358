package tareaOcho;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundedPriorityQueue<Integer> cola1 = new BoundedPriorityQueue(1);
		BoundedPriorityQueue<Integer> cola2 = new BoundedPriorityQueue(2);
		BoundedPriorityQueue<Integer> cola3 = new BoundedPriorityQueue(3);
		BoundedPriorityQueue<Integer> cola4 = new BoundedPriorityQueue(4);
		BoundedPriorityQueue<Integer> cola5 = new BoundedPriorityQueue(5);
		
		System.out.println("Inicializacion de cola acotada con prioridad");
		System.out.println();
		cola4.enqueue(4, "Maestro");
		cola4.transversal();
		System.out.println();
		
		cola2.enqueue(2, "Niños");
		cola2.transversal();
		cola4.transversal();
		System.out.println();
		
		cola4.enqueue(4, "Mecanico");
		cola2.transversal();
		cola4.transversal();
		System.out.println();
		
		cola3.enqueue(3, "Mujeres");
		cola2.transversal();
		cola3.transversal();
		cola4.transversal();
		System.out.println();
		
		cola2.enqueue(2, "3ra edad");
		cola2.transversal();
		cola3.transversal();
		cola4.transversal();
		System.out.println();
		
		cola1.enqueue(1, "Niñas");
		cola1.transversal();
		cola2.transversal();
		cola3.transversal();
		cola4.transversal();
		System.out.println();
		
		cola3.enqueue(3, "Hombres");
		cola1.transversal();
		cola2.transversal();
		cola3.transversal();
		cola4.transversal();
		System.out.println();
		
		cola4.enqueue(4, "Vigia");
		cola1.transversal();
		cola2.transversal();
		cola3.transversal();
		cola4.transversal();
		System.out.println();
		
		cola5.enqueue(5, "Capitan");
		cola1.transversal();
		cola2.transversal();
		cola3.transversal();
		cola4.transversal();
		cola5.transversal();
		System.out.println();
		
		cola4.enqueue(4, "Timonel");
		cola1.transversal();
		cola2.transversal();
		cola3.transversal();
		cola4.transversal();
		cola5.transversal();
	}

}
