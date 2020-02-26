/**
 * Clase Trupalla hija de Carro Proyecto Modulo Java
 */

package modelo;

import java.util.*;

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase hija Trupalla.
 */

public class Trupalla extends Carro {
	private int nivelArmadura;
	private String nombreManipulador;
	
	
	/**
	 *  Constructor del objeto Trupalla.
	 * @param nivelArmadura;
	 * @param nombreManipulador;
	 * 
	 */
	public Trupalla(int cantOcupantes, String fechaIngresoInstitucion, String nombreManipulador) {
		super(cantOcupantes, fechaIngresoInstitucion);
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
	
	

	
}
