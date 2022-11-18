package tareaNueve;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableADT Tab = new HashTableADT(9);
        Tab.Add(653, "Marauders");
        Tab.Add(728, "Moony");
        Tab.Add(127, "Maraudentium");
        Tab.Add(845, "Padfoot");
        Tab.Add(217, "Fear the tribe");
        Tab.Add(485, "Prongs");
        System.out.println(Tab.valueOf(217));
        Tab.Remove(217);
	}

}
