/**
0 * Clase Tablero Proyecto Modulo Java
 */
package modelo;

import modelo.*;

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase Tablero.
 * Atributos tablero.
 */
public class Tablero {
	private Object[][] tablero;
	
	/**
	 *  Constructor del objeto Tablero 
	 */	
	public Tablero() {
		tablero = new Object[15][15];
	}
	/**
	 * Metodo crearCarro()
	 * metodo que permite crear Carros de tipo Kromi, Trupalla y Caguano.
	 * 
	 */	
	
	public void iniciaTablero() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				tablero[i][j] = "[ _ ]";
			}	
		}
	}
		
	public void crearCarro() {
		//crear subclase de la clase carro y asignarla al tablero
		int filaK = (int)(Math.random()*12);
		int fila = (int)(Math.random()*15);
		int columna = (int)(Math.random()*15);
		int columnaC = (int)(Math.random()*14);
		Kromi k1 = new Kromi(filaK, columna);
		Kromi k2 = new Kromi(filaK, columna);
		Kromi k3 = new Kromi(filaK, columna);
		Caguano c = new Caguano(fila, columnaC);
		Trupalla t = new Trupalla(fila,columna);
		
//		for (int i = 0; i < tablero.length; i++) {
//			for (int j = 0; j < tablero.length; j++) {
//				if (tablero[i][j].equals("[ _ ]") && tablero[i + 1][j].equals("[ _ ]") && 
//						tablero[i + 2][j].equals("[ _ ]");
//				}
//			}
//		}
//		
			
//		} 
		for (int i = 0; i < 3; i++) {	
			while (!verificaEspacio()) {
				tablero[filaK][columna] = k1.imprimeObjeto();
				tablero[filaK+1][columna] = k1.imprimeObjeto();
				tablero[filaK+2][columna] = k1.imprimeObjeto();
			}
		}
		for (int i = 0; i < 5; i++) {
			while (!verificaEspacio()) {
				tablero[fila][columnaC] = c.imprimeObjeto();
				tablero[fila][columnaC+1] = c.imprimeObjeto();
			}
		}
		for (int i = 0; i < 10; i++) {
			while (!verificaEspacio()) {
				tablero[fila][columna] = t.imprimeObjeto();
			}
		}
	}
	
	public boolean verificaEspacio() {
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j]==null) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 *  Metodo lanzarHuevo()
	 *  metodo que permite lanzar huevos dentro del tablero
	 * @param 
	 * @param 
	 * @param 
	 * @param 
	 */
	public void lanzarHuevo() {
		
	}
	/**
	 *  Metodo mostrarMatriz()
	 *  metodo que imprime por consola  el tablero de juego.
	 * @param 
	 * @param 
	 * @param 
	 * @param 
	 */
	public void mostrarMatriz() {
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j]);
			}
			System.out.println("");
		}
		
	}
	/**
	 *  Metodo calcularPuntaje
	 *  metodo que permite sumar la cantidad de puntaje que obtuvo el jugador en el trasncurso
	 *  del juego. kromi 3 puntos/Kromi completa = 10 puntos. Caguano 2 puntos/ Caguano completo = 7 puntos.
	 *  Trupalla completa 1 punto.
	 * @param 
	 * @param 
	 * @param 
	 * @param 
	 */
	public void calcularPuntaje() {
		
	}	
}