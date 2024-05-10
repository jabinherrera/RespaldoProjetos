package LOL;

public class Mapa {

	private String[][] tablero;
	private static int dimension = 16;
	private String vacio = "[ ]";
	private Casilla casilla;

	public void generarTableroVacio() {
		//Genera un tablero vacio
		tablero = new String[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				tablero[i][j] = vacio;
			}
		}
//Estos 2 for generan el contorno del tablero
		for (int i = 0; i < dimension; i++) {
			tablero[i][0] = " " + i;
		}
		for (int j = 0; j < dimension; j++) {
			tablero[0][j] = " " + j;
		}
	}

	public void llenarTableroInicial() {
		ubicarBaron();
		ubicarDragon();
		ubicarTorretas();
		ubicarNexos();
		ubicarCampeones();
	}

	private void ubicarCampeones() {
	}

	private void ubicarNexos() {
		tablero[1][15]=("[N]");

		tablero[15][1]=("[N]");
	}

	private void ubicarTorretas() {
		tablero[1][3]=("[T]");
		tablero[1][14]=("[T]");
		tablero[2][15]=("[T]");
		tablero[3][1]=("[T]");
		tablero[6][11]=("[T]");
		tablero[10][5]=("[T]");
		tablero[12][15]=("[T]");
		tablero[14][1]=("[T]");
		tablero[15][2]=("[T]");
		tablero[15][12]=("[T]");
	}


	private void ubicarDragon() {
		tablero[4][5] = ("[D]");
	}

	private void ubicarBaron() {
		tablero[10][11] = ("[B]");
	}

	public void generarTableroCompleto(){
		generarTableroVacio();
		llenarTableroInicial();
		imprimirTablero();
	}

	public void imprimirTablero() {
		//Muestra el tablero
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				System.out.print(tablero[i][j] + "\t");     //tiene que ser print no println
			}
			System.out.println("\n");
		}
	}

}