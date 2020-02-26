/**
0 * Clase Tablero Proyecto Modulo Java
 */
package modelo;



import modelo.Carro;
import modelo.Huevo;

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase Tablero.
 * atributos y constantes de la Clase.
 */
public class Tablero {
	private String[][]tablero;
	private Carro carro;
	private Huevo huevo;
	public static final int TAM_TABLERO_DEFAULT =15;//Constante que define el valor de columnas y filas del tablero = 15.
	public static final int CANT_MAX_KROMI = 3;
	public static final int CANT_MAX_CAGUANO = 5;
	public static final int CANT_MAX_TRUPALLA = 10;
	public static final int CANT_MAX_CARROS = 18;
	
	/**
	 *  Constructor del objeto Tablero.
	 * @param tablero;  es la matriz que define el tamaño del tablero
	 * @param Carro; son los objetos carro que seran creados en el tablero
	 * @param Huevo; son los objetos huevo que seran creados en el tablero no se si el huevo de adiciona aqui o en el ejecutable
	 */	
//Constructor por defecto de tablero
	
	public Tablero() {
		tablero = new String[TAM_TABLERO_DEFAULT][TAM_TABLERO_DEFAULT];
		carro = new Carro();
		//huevo = new Huevo();// nose si es así o si tiene que pasar fila y columna por el constructor
	}

//metodo inicial para determinar si el espacio esta ocupado con el disparo.
	public boolean espacioOcupado(int fila, int columna) {	
		boolean espacioLibre = false;
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				//if (carro.getFila().equals(new Huevo(fila)) && carro.getColumna().Equals(new Huevo(columna))) {
					espacioLibre = true;
				}
				
			}
			
		return espacioLibre ;		
	}
}