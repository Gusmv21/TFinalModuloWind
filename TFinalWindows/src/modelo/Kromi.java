/**
 * Clase Kromi hija de Carro Proyecto Modulo Java
 */
package modelo;

import interfaces.IImprimeObjeto;

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase hija Kromi.
 */

public class Kromi extends Carro implements IImprimeObjeto{
	private int anoFabricacion;
	private String marca;
	
	
	/**
	 *  Constructores del objeto Kromi.
	 * @param anoFabricacion;
	 * @param marca;
	 * 
	 */
//Constructor por defecto de Kromi nos entragara su posicion.
	public Kromi (int fila, int columna) {
		super(fila, columna);
	}
//Constructor de Kromi contiene todos los atributos, inclusive los heredados.	
	public Kromi(int cantOcupantes, String fechaIngresoInstitucion, 
			int anoFabricacion, String marca, int fila, int columna) {
		super(cantOcupantes, fechaIngresoInstitucion, fila, columna);
		this.anoFabricacion = anoFabricacion;
		this.marca = marca;
		
		
		//get ,set y toString Clase Kromi
		
	}

	public int getAnoFabricacion() {
		return anoFabricacion;
	}

	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi [anoFabricacion=" + anoFabricacion + ", marca=" + marca + "]";
	}
	/**
	 *  Metodo extendido desde la Interfaz, imprimeObjeto()
	 *  metodo que permite imprimir un string, segun la clase de objeto
	 *  para Kromi imprime K.
	 * @return K;
	 */
	public String imprimeObjeto() {
		String K ="[ K ]";
		return K;
	}
	//
}

