package tareaTres;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NominaADT prueba;
		try {
			prueba = new NominaADT("C:\\Users\\52557\\Documents\\Ing. en Computación\\TERCER SEMESTRE\\Estructura de Datos\\Espacio-trabajo\\tareasEDD\\archivos\\junio.dat");
			prueba.listarSueldos();
			System.out.println(prueba.mayorAntiguedad());
			System.out.println(prueba.menorAntiguedad());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
