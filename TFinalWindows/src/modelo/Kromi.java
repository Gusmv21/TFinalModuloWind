/**
 * Clase Kromi hija de Carro Proyecto Modulo Java
 */
package modelo;

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase hija Kromi.
 */

public class Kromi extends Carro{
	private int anoFabricacion;
	private String marca;
	
	
	/**
	 *  Constructores del objeto Kromi.
	 * @param anoFabricacion;
	 * @param marca;
	 * 
	 */
//Constructor por defecto de Kromi nos entragara su posicion.
	public Kromi () {
		super();
	}
//Constructor de Kromi contiene todos los atributos, inclusive los heredados.	
	public Kromi(int cantOcupantes, String fechaIngresoInstitucion, 
			int anoFabricacion, String marca) {
		super(cantOcupantes, fechaIngresoInstitucion);
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
	
	
	//
}

