package tareaUno;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Redes {
	
	private static String[][] arch(String dirCSV) {
		try {
			int fila = 0;
			Scanner luc = new Scanner(new File(dirCSV));
			String[][] datos = new String[40][40];
			String linea = luc.nextLine();

			while (luc.hasNextLine()) {
				
				if (datos[fila].toString().endsWith(",")) {
					fila++;
				} else {
					datos[fila] = linea.split(",");
				}
				linea = luc.nextLine();
				fila++;
			}
			luc.close();
			return datos;
		} catch (FileNotFoundException e) {
			return null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[][] info = arch("archivos/presenciaredes.csv");

		// No logro imprimir los ultimos 3 datos sobre YouTube
		for (int i = 0; i <= info[i].length; i++) {
			for (int j = 0; j < info[j].length; j++) {
				System.out.print(info[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("----------------------------");

		System.out.println("Diferencia de followers en Twitter entre el mes de Enero y Junio");
		System.out.println("La diferencia de seguidores entre estos meses es de: "
				+ ((Integer.parseInt(info[8][8])) - Integer.parseInt(info[8][3])) + " followers");

		System.out.println("----------------------------");

		System.out.println(
				"Diferencia de visualizaciones de YouTube entre los meses Enero a Junio seleccionados por el ususario");
		System.out.println("Los meses se elegiran con el numero corresponiente al orden de estos. Ejemplo: Enero = 1");
		System.out.println("El primer mes que se seleccione debera ser menor al segundo mes");
		System.out.println();

		int m1 = 0;
		int m2 = 0;
		boolean s = false;

		while (s == false) {
			System.out.println("Elije el primer mes");
			m1 = sc.nextInt();
			System.out.println("Elije el segundo mes");
			m2 = sc.nextInt();

			if (m2 > m1) {
				s = true;
			} else {
				s = false;
			}
		}

		m2 = m2 + 2;
		m1 += 2;
		System.out.println("La ganancia o perdida de visualizaciones de YouTube entre el mes de " + info[0][m1]
				+ " y el mes de " + info[0][m2] + " es de: "
				+ (Math.abs(Integer.parseInt(info[16][m2])) - Integer.parseInt(info[16][m1])) + " visualisaciones");

		System.out.println("----------------------------");

		System.out
				.println("Calculo del promedio de crecimiento de Twitter y Facebook entre los meses de Enero a Junio");

		System.out.println();

		// Crecimiento de Twitter
		double s1 = 0;
		double sp;

		for (int t = 3; t < 9; t++) {
			info[10][t] = info[10][t].substring(0, info[10][t].length() - 1);
		}

		for (int col = 3; col < 9; col++) {
			sp = Double.parseDouble(info[10][col]);
			s1 = sp + s1;
		}

		double promTwi = s1 / 6;
		double promFinal1 = Math.round(promTwi * 100.0) / 100.0;
		System.out.println("El promedio de crecimiento de Twitter es de: " + promFinal1 + " %");

		System.out.println();

		// Crecimiento de Facebook
		double s2 = 0;
		double im;

		for (int f = 3; f < 9; f++) {
			info[3][f] = info[3][f].substring(0, info[3][f].length() - 1);
		}

		for (int x = 3; x < 9; x++) {
			im = Double.parseDouble(info[3][x]);
			s2 = im + s2;
		}

		double promFace = s2 / 6;
		double promFinal2 = Math.round(promFace * 100.0) / 100.0;
		System.out.println("El promedio de crecimiento de Facebook es de: " + promFinal2 + " %");
	}
}
