/**
 * Clase Carro Proyecto Modulo Java
 */
package modelo;
import java.util.*;
/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase Padre Carro.
 */

public class Carro {

	private int cantOcupantes;
	private String fechaIngresoInstitucion;
	private int fila;
	private int columna;

/**
 *  Constructores del objeto Carro
 * @param cantOcupantes;
 * @param fechaIngresoInstitucion
 * @param fila;
 * @param columna;
 */
//constructor que solo llama a la ubicacion del carro, nos podria servir para heredar la posicion a las hijas y usarla en otras clases y metodos.
	public Carro(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}
	
//Constructor de Carro que contiene todos los atributos que este puede tener.
	public Carro(int cantOcupantes, String fechaIngresoInstitucion, int fila, int columna) {
		this.cantOcupantes = cantOcupantes;
		this.fechaIngresoInstitucion = fechaIngresoInstitucion;
		this.fila = fila;
		this.columna = columna;
	}

	//Get y Set de los atributos.
	public int getCantOcupantes() {
		return cantOcupantes;
	}

	public void setCantOcupantes(int cantOcupantes) {
		this.cantOcupantes = cantOcupantes;
	}

	public String getFechaIngresoInstitucion() {
		return fechaIngresoInstitucion;
	}

	public void setFechaIngresoInstitucion(String fechaIngresoInstitucion) {
		this.fechaIngresoInstitucion = fechaIngresoInstitucion;
	}

	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	private void setColumna(int columna) {
		this.columna = columna;
	}
	
//toString de la clase Carro.
	
	@Override
	public String toString() {
		return "Carro [Cantidad Ocupantes: " + cantOcupantes + ", Fecha Ingreso Institucion: " + fechaIngresoInstitucion 
			+ ", ubicacion: ("+fila+","+columna+")";
	}
	
}