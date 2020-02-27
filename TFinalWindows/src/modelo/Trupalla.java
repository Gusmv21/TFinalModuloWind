/**
 * Clase Trupalla hija de Carro Proyecto Modulo Java
 */

package modelo;

import java.util.*;

import interfaces.IImprimeObjeto;

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase hija Trupalla.
 */

public class Trupalla extends Carro implements IImprimeObjeto {
	private int nivelArmadura;
	private String nombreManipulador;
	
	
	/**
	 *  Constructores del objeto Trupalla.
	 * @param nivelArmadura;
	 * @param nombreManipulador;
	 * 
	 */
	
	//Constructor por defecto, nos entragara la ubicacion y el nivel de armadura de la Trupalla
	public Trupalla (int fila, int columna) {
		super(fila, columna);
		nivelArmadura = (int)Math.random()*5+1;
	}
	//Constructor con todos los atributos que lleva la clase Trupalla inclusive los heredados.
	public Trupalla(int cantOcupantes, String fechaIngresoInstitucion, String nombreManipulador,
			int fila, int columna) {
		super(cantOcupantes, fechaIngresoInstitucion, fila, columna);
		nivelArmadura = (int)Math.random()*5+1;
		this.nombreManipulador = nombreManipulador;
	}

	//Get, Set y toString.
	public int getNivelArmadura() {
		return nivelArmadura;
	}


	private void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}


	public String getNombreManipulador() {
		return nombreManipulador;
	}


	public void setNombreManipulador(String nombreManipulador) {
		this.nombreManipulador = nombreManipulador;
	}

	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreManipulador=" + nombreManipulador + "]";
	}
	/**
	 *  Metodo extendido desde la Interfaz, imprimeObjeto()
	 *  metodo que permite imprimir un string, segun la clase de objeto
	 *  para Trupalla imprime T.
	 * @return T;
	 */
	public String imprimeObjeto() {
		String T ="[ T ]";
		return T;
	}

	
}
