package tareaTres;

import java.io.*;

public class NominaADT {
	private String ruta;
	private ArregloADT<Trabajador> datos;

	public NominaADT(String ruta) throws IOException {
		this.ruta = ruta;
		int contador = 0;
		String linea, contenido = "";

		BufferedReader br = new BufferedReader(new FileReader(this.ruta));
		br.readLine();
		while ((linea = br.readLine()) != null) {
			contenido += linea + "\n";
			contador++;
		}
		br.close();

		String[] temp = contenido.split("\n");

		datos = new ArregloADT<>(contador);

		for (int i = 0; i < temp.length; i++) {
			String[] Arreglo = temp[i].split(",");
			Trabajador Trabajador = new Trabajador(Arreglo[0], Arreglo[1], Arreglo[2], Arreglo[3],
					Double.parseDouble(Arreglo[4]), Double.parseDouble(Arreglo[5]), Integer.parseInt(Arreglo[6]));
			;
			datos.setElemento(i, Trabajador);
		}
	}

	public void listarSueldos() {
		for (int i = 0; i < datos.getLongitud(); i++) {
			System.out.println("Nombre del trabajador: " + datos.getElemento(i).getNombre() + " "
					+ datos.getElemento(i).getApellidoP() + " " + datos.getElemento(i).getApellidoM());
			System.out.println("Numero de trabajador: " + datos.getElemento(i).getNumTrabajador());
			System.out.println("Sueldo total: " + datos.getElemento(i).CalcularSueldo());
			System.out.println();
		}
	}

	public String mayorAntiguedad() {
		int max = 2022;
		int inx = 0;
		for (int i = 0; i < datos.getLongitud(); i++) {
			Trabajador emp = datos.getElemento(i);
			if (emp.getAIngreso() < max) {
				inx = i;
				max = emp.getAIngreso();
			}
		}
		return "El empleado con mayor antiguedad es: " + datos.getElemento(inx).getNombre() + " "
				+ datos.getElemento(inx).getApellidoP() + " " + datos.getElemento(inx).getApellidoM();
	}

	public String menorAntiguedad() {
		int min = 2000;
		int inx = 0;
		for (int i = 0; i < datos.getLongitud(); i++) {
			Trabajador emp = datos.getElemento(i);
			if (emp.getAIngreso() >= min) {
				inx = i;
				min = emp.getAIngreso();
			}
		}
		return "El empleado con menor antiguedad es: " + datos.getElemento(inx).getNombre() + " "
				+ datos.getElemento(inx).getApellidoP() + " " + datos.getElemento(inx).getApellidoM();
	}
}
