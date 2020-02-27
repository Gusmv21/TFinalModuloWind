/**
 * Ejecutable Camara Secreta Proyecto Modulo Java
 */
package ejecutable;

import java.util.*;

import modelo.Carro;
import modelo.Huevo;
import modelo.Tablero;


/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase Ejecutable Camara Secreta, crear un tablero de juego.
 */
public class EjecutableCamaraSecreta {

	/**
	 * Metodo principal (Ejecutable), despliega el menu y permite ejecutar la accion seleccionada
	 * utiliza la Clase Tablero
	 */
	public static void main(String[] args) {
		
		Tablero t1 = new Tablero();
		//t1.iniciaTablero();
		t1.crearCarro();
		t1.mostrarMatriz();
	}
//		
//		
//		Huevo huevo = new Huevo(0, 0, 0);//no se me ocurre como definirlo aun
//		//Carro carro = new Carro();// defini otro constructor por defaul en clase Carro, solo considera la ubicacion.
//		Tablero tablero = new Tablero();//define el tablero.
//		boolean salida = false; 
//		escribir("Preparate para luchar contra los KPS");
//		escribir("");
//		
//		
//		
//				
//		do {				 
//			switch (menuAcciones()) {
//			case 1:
//				//CrearCarro()
//				break;
//			case 2:
//				int filaHuevo = pedirFilaHuevo("Indica el numero de posicion de la fila Huevo (0 a 14)");		
//				int columnaHuevo = pedirColumnaHuevo("Indica el numero de posicion de columna Huevo (0 a 14)");
//				//LanzarHuevo()
//				break;
//			case 3:
//				//mostrarMatriz()			
//				break;
//			case 4:
//				//CalcularPuntaje()
//				break;
//			case 5:
//				escribir("");
//				escribir("Lucha contra KPS pronto....");
//				salida = true;
//				break;
//			default:
//				escribir("");
//				escribir("Accion no valida\n vuelva a intentarlo"
//						+ " o presione \"5\" para salir del programa");
//				break;
//			}
//		}while(!salida);
//	}
//	
//	//Define la posicion de la fila del Huevo
//		public static int pedirFilaHuevo(String mensaje) {		
//			int fila = pideNumero("Introduce la posicion de la fila del huevo a lanzar, de 0 a 14.");
//			return fila;
//		}
//	//Define la posicion de la columna del Huevo
//		public static int pedirColumnaHuevo(String mensaje) {
//			int columna = pideNumero("Introduce la posicion de la columna del huevo a lanzar, de 0 a 14.");
//			return columna;
//		}
//	/**
//	 * Metodo que permite mostrar el menu del programa y elegir una accion de este.
//	 * @return, retornara la opcion seleccionada en el menu.
//	 */
//	//Muestra el menu y devuelve la accion seleccionada
//	public static int menuAcciones() {
//		escribir("");
//		escribir("Menu de Acciones");
//		escribir("");
//		escribir(" 1-. Crear un Carro. \n 2-. Lanzar Huevos . \n"
//				+ " 3-. Mostrar Matriz.\n 4-. Calcular Puntaje.\n 5-. Salir del Tablero.");
//		escribir("");
//		return pideNumero("Elige una Accion: ");
//	}
//	/**
//	 * Metodo que pide un String, el cual retornara un Strig que se puede utilizar.
//	 * @param mensaje, parametro sirve para pedir el string
//	 * @return,  devuelve un String para ser usado.
//	 */
//	public static String pideString(String mensaje) {
//		escribir(mensaje);
//		Scanner n= new Scanner(System.in);
//		return n.nextLine();
//	}
//	/**
//	 * Metodo para mostar por consola un mensaje 
//	 * @param mensaje , corresponde al String que se va a mostrar.
//	 */
//	public static void escribir(String mensaje) {
//		System.out.println(mensaje);
//	}
//	
//	/**
//	 * Metodo que pide un entero como mensaje y retorna un entero para utilizarlo.
//	 * @param mensaje , se usa para pedir el Int.
//	 * @param g , Entero utilizado como variable local del try catch.
//	 * @param salida, Booleano, valor inicial = true, usado en el do while para poder salir del bucle.
//	 * @return , devuelve un valor tipo Int para ser usado.
//	 */
//	public static int pideNumero(String mens) {
//		escribir(mens);
//		int g = 0;
//		boolean salida = true;
//		
//		//Con este bucle, y usando Try Catch, podemos manejar el error de tipeo del usuario,
//		// forzandolo a escribir un entero.
//		do {
//			try {
//				Scanner n = new Scanner(System.in);
//				g = n.nextInt();
//				if (n >= 0 && n<= 14) {
//					salida = true;					
//				}
//			} catch (Exception e) {
//				escribir("Error..Ingrese un valor entero");
//				salida = false;
//			}			//falta agregar un catch		
//		}while(!salida);
//		
//		return g;
//	}
}
