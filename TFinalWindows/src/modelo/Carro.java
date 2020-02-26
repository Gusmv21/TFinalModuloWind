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
 *  Constructor del objeto Carro
 * @param cantOcupantes;
 * @param fechaIngresoInstitucion
 * @param fila;
 * @param columna;
 */

	public Carro() {
		fila = (int) (Math.random() * 15);
		columna = (int) (Math.random() * 15);
	}
	public Carro(int cantOcupantes, String fechaIngresoInstitucion) {
		this.cantOcupantes = cantOcupantes;
		this.fechaIngresoInstitucion = fechaIngresoInstitucion;
		fila = (int) (Math.random() * 15);
		columna = (int) (Math.random() * 15);
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
	//
}