/**
 * Clase Tablero Proyecto Modulo Java
 */
package modelo;

import java.util.*;
import modelo.*;

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase Tablero.
 * Atributos tablero.
 */
public class Tablero {
	private static String[][] tablero;
	private Carro [] carro;
	private ArrayList<Huevo> puntajeHObtenido;
	private int puntajeHObtenidotaje;
	public static final int DIM_DEFAULT_TABLERO =15;

	
	/**
	 *  Constructor del objeto Tablero
	 *  el cual contendra una cantidad maxima de 18 objetos tipo carro;
	 *  y contendra un arraylist para los huevos y puntajes asignados por el disparo. 
	 */	
	public Tablero() {
		tablero = new String[DIM_DEFAULT_TABLERO][DIM_DEFAULT_TABLERO];
		this.carro = new Carro[18];
		this.puntajeHObtenido = new ArrayList<>();
	}
	
	/**
	 * Metodo crearCarros().
	 * metodo que le permite al tablero crear los 18 carro y a su vez los guarda en el arreglo carro.	
	 */
	public  void crearCarros() {		
		Tablero[][]tablero = new Tablero[DIM_DEFAULT_TABLERO][DIM_DEFAULT_TABLERO];
		
		
		//crea 3 Kromis 
		for (int i = 0; i < 3; i++) {
			crearKromi(this.tablero);
		}
	
		//crea 5 Caguanos 
		for (int i = 0; i < 5; i++) {
			crearCaguano(this.tablero);
		}
	
		//crea10 trupallas 3
		for (int i = 0; i < 10; i++) {
			crearTrupalla(this.tablero);
		}
			
		
	}		
	
	/**
	 * Metodo CrearKromi() , permite crear un maximo de 3 Kromis y valida que no se sobrelapen.
	 * @param tablero, corresponde al tablero de juego.
	 * @return retorna un arreglo con 3 kromis.
	 */
	public Kromi crearKromi(String tablero[][]) {
		int a = (int)(Math.random()*12);
		int b = (int)(Math.random()*15);
		Kromi k = new Kromi(a, b);
		Carro K[] = new Carro[3];
		
		for (int i = 0; i < 3; i++) {							
			a = (int)(Math.random()*12);
			b = (int)(Math.random()*15);		
			
			//valida que no caigan en la misma posicion
			if (tablero[a][b].equals("[ _ ]") && tablero[a+1][b].equals("[ _ ]") && tablero[a+2][b].equals("[ _ ]")) {		
				K[i] = new Kromi(a,b);//lo va guardando en el arreglo
				
				//con esto llenara 3 posiciones de forma vertical con ("[ K ]")
				for (int j = 0; j < 3; j++) {						
					tablero[a][b] = k.imprimeObjeto(); 
					a++;
				}				
			}else {
				i--; //para garantizar que solo salga del for cuando halla tres kromis creados
			}				
		}					
		return k;
	}
	
	/**
	 * Metodo CrearCaguano() , permite crear un maximo de 5 caguanos y valida que no se sobrelapen entre ellas y con otros vehiculos.
	 * @param tablero, corresponde al tablero de juego.
	 * @return retorna un arreglo con 5 caguanos.
	 */
	public Caguano crearCaguano(String tablero[][]) {		
		int a = (int)(Math.random()*15);
		int b = (int)(Math.random()*14);
		Caguano c = new Caguano(a,b);
		Carro C[] = new Carro[5];
		
		for (int i = 0; i < 5; i++) {		
			a = (int)(Math.random()*15);
			b = (int)(Math.random()*14);
			
			//valida que no caigan en la misma posicion	
			if (tablero[a][b].equals("[ _ ]") && tablero[a][b+1].equals("[ _ ]")) {
				C[i] = new Caguano(a,b);//lo va guardando en el arreglo	
				//genera dos posiciones de manera horizontal
				for (int j = 0; j < 2; j++) {				
					tablero[a][b] = c.imprimeObjeto(); 
					b++;
				}					
			}else {
				i--;//para garantizar que solo salga del for cuando halla cinco caguanos creados
			}
		}		
		return c;
	}

	/**
	 * Metodo CrearTrupalla() , permite crear un maximo de10 Trupallas y valida que no se sobrelapen entre ellas y con otros vehiculos.
	 * @param tablero, corresponde al tablero de juego.
	 * @return retorna un arreglo con 10 caguanos.
	 */
	public Trupalla crearTrupalla(String tablero[][]) {
		int a = (int)(Math.random()*15);
		int b = (int)(Math.random()*15);
		Trupalla t  = new Trupalla(a,b);
		Carro T [] = new Carro[10];
	
			
		for (int i = 0; i < 10; i++) {
			a = (int)(Math.random()*15);
			b = (int)(Math.random()*15);
			
			//valida que no caigan en la misma posicion	
			if (tablero[a][b].equals("[ _ ]")) {
					
				T[i] = new Trupalla(a,b);//lo va guardando en el arreglo						
				tablero[a][b] = t.imprimeObjeto(); 										
			}else {
				i--;//para garantizar que solo salga del for cuando halla diez trupallas creados
			}			
		}	
		return t;		
	}
	/**
	 * Metodo creaTablero()
	 * metodo que permite crear el tablero de 15 x 15 , relleno con " [ _ ] "; 
	 * 
	 */	
	public  void creaTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = "[ _ ]";
			}	
		}
		this.tablero = tablero;
	}

	
	/**
	 *  Metodo lanzarHuevos, permite lanzar los huevos dentro del tablero, pasando este metodo por tres parametros
	 *  y retorna el puntaje segun donde se apunte (fila, columna) dentro del tablero, este retornara el valor asignado
	 *  por el metodo imprime Objeto, donde cambiara el valor de la posicion en la matriz por "[ H ]".
	 *@param tablero[][]; corresponde al tablero donde se apuntaran los huevos.
	 *@param fila; dato ingresado por el usuario.
	 *@param columna; dato ingresado por el usuario.
	 */
	public void lanzarHuevos (Object tablero[][], int fila, int columna) {
		Huevo h = new Huevo(fila, columna);
		
		int puntajeObtenido = 0;
		
		if (tablero[fila][columna].equals("[ C ]")) {
			tablero[fila][columna] = h.imprimeObjeto();
			puntajeObtenido = 2;
		} else {
			if (tablero[fila][columna].equals("[ K ]")) {
				tablero[fila][columna] = h.imprimeObjeto();
				puntajeObtenido = 3;
			} else {
				if (tablero[fila][columna].equals("[ T ]")) {
				tablero[fila][columna] = h.imprimeObjeto();
				puntajeObtenido = 1;
				} else {
					tablero[fila][columna].equals("[ H ]");
				}
				this.puntajeHObtenidotaje = puntajeObtenido;
			}
		}
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