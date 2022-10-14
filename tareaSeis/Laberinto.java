package tareaSeis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Laberinto {

	public Laberinto(String ruta) {
		// TODO Auto-generated constructor stub
		try {
			BufferedReader lectura = new BufferedReader(new FileReader(ruta));
			int col, fil;

			col = Integer.parseInt(lectura.readLine());
			fil = Integer.parseInt(lectura.readLine());

			matriz = new Array2D(fil, col);

			for (int f = 0; f < fil; f++) {
				String linea = lectura.readLine();
				String[] comas = linea.split(",");

				for (int c = 0; c < col; c++) {
					String caracterActual = comas[c];
					if (caracterActual.equals("0")) {
						matriz.setElemento(f, c, false);
					} else if (caracterActual.equals("1")) {
						matriz.setElemento(f, c, true);
					} else if (caracterActual.equals("E")) {
						matriz.setElemento(f, c, true);
						entrada[0] = f;
						entrada[1] = c;
					} else if (caracterActual.equals("S")) {
						matriz.setElemento(f, c, true);
						salida[0] = f;
						salida[1] = c;
					}
				}
			}

		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
		}
	}

	public int[] reglas(int renglon, int columna, int paso) {
		int[] coordenadas = new int[2];

		if (paso == 0) {
			coordenadas[0] = renglon;
			coordenadas[1] = columna - 1;
		} else {
			if (paso == 1) {
				coordenadas[0] = renglon - 1;
				coordenadas[1] = columna;
			} else {
				if (paso == 2) {
					coordenadas[0] = renglon;
					coordenadas[1] = columna + 1;
				} else {
					if (paso == 3) {
						coordenadas[0] = renglon + 1;
						coordenadas[1] = columna;
					}
				}
			}
		}

		return coordenadas;
	}
	
	public boolean[] saltarCeros(int renglones, int columnas) {
		boolean[] direccion = { true, true, true, true };

		if (renglones == 0) {
			direccion[1] = false;
		} else {
			if (renglones == matriz.getRenglones() - 1)
				;
			direccion[3] = false;
		}

		if (columnas == 0) {
			direccion[0] = false;
		} else {
			if (columnas == matriz.getColumnas() - 1) {
				direccion[2] = false;
			}
		}

		return direccion;
	}

	public void recorridoMatriz() {
		int[] posiActual = entrada;
		int[] afuera = { -1, -1 };
		int[] posiAnterior = posiActual;
		boolean tmp = true;

		camino.push(posiActual);

		do {

			int[] nuevaPosicion = siguientePaso(posiActual, posiAnterior);
			posiAnterior = posiActual;
			posiActual = nuevaPosicion;

			if (coordenadas(posiActual, salida)) {
				camino.push(posiActual);
				tmp = false;
			} else {
				if (coordenadas(posiActual, afuera)) {

					int[] eliminar = (int[]) camino.pop();
					matriz.setElemento(eliminar[0], eliminar[1], false);
					posiActual = (int[]) camino.pop();
					posiAnterior = (int[]) camino.peek();
					camino.push(posiActual);

					if (coordenadas(eliminar, entrada)) {
						tmp = false;
						camino = null;
					}
				} else {
					camino.push(posiActual);
				}
			}
		} while (tmp);
	}

	private int[] siguientePaso(int[] coordenadaAct, int[] coordenadaAnt) {
		boolean posicion = false;
		int filaY = coordenadaAct[0];
		int columnaX = coordenadaAct[1];
		int[] coorNuevas = null;
		boolean[] direccion = new boolean[4];

		direccion = saltarCeros(filaY, columnaX);
		for (int contador = 0; contador <= 4; contador++) {
			if (contador < 4) {
				if (direccion[contador]) {
					coorNuevas = reglas(filaY, columnaX, contador);
					posicion = (boolean) matriz.getElemento(coorNuevas[0], coorNuevas[1]);
					if (posicion && !this.coordenadas(coorNuevas, coordenadaAnt)) {
						break;
					}
				} else {
					continue;
				}
			} else {
				coorNuevas[0] = -1;
				coorNuevas[1] = -1;
			}
		}

		return coorNuevas;
	}

	public void solucion() {
		if (camino == null) {
			System.out.println("No fue posible encontrar la salida");
		} else {
			StackADT tmp = new StackADT();
			while (camino.getLongitud() != 0) {
				int[] coor = (int[]) camino.pop();
				tmp.push(coor);

				System.out.println("[ " + coor[0] + " ]" + "[ " + coor[1] + " ]");
			}

			camino = tmp;
		}
	}

	private boolean coordenadas(int[] coorNueva, int[] coorVieja) {
		return (coorNueva[0] == coorVieja[0]) && (coorNueva[1] == coorVieja[1]);
	}
}
