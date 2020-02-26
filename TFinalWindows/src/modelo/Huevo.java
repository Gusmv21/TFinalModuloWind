/**
 * Clase Huevo Proyecto Modulo Java
 */
package modelo;

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase Huevo.
 */
public class Huevo {
	private int fila;
	private int columna;
	private int puntaje;
	
	/**
	 *  Constructor del objeto Huevo.
	 * @param fila;
	 * @param columna;
	 * @param puntaje;
	 */
	public Huevo(int fila, int columna, int puntaje) {
		this.fila = fila;
		this.columna = columna;
		this.puntaje = puntaje;
	}

// Get, Set y toString de clase Huevo.
	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public String toString() {
		return "Huevo [fila=" + fila + ", columna=" + columna + ", puntaje=" + puntaje + "]";
	}
	//
}