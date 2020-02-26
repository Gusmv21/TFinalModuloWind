/**
 * Clase Caguano hija de Carro Proyecto Modulo Java
 */
package modelo;

/**
 * @author Gonzalo Guzman/Gustavo Morales/ Paolo Mancini /Sebastian Ramirez 
 * Clase hija Caguano.
 */
public class Caguano extends Carro {
	private int alcanceTiro;//aun nose bien cual tipo de atributo ponerle
	private String colorConfeti;
	
	/**
	 *  Constructores del objeto Caguano.
	 * @param alcanceTiro;
	 * @param colorconfeti;
	 * 
	 */	
	//Constructor que nos dara la posicion de Caguano heredada por Carro.
	public Caguano () {
		super();
	}
	//constructor con todos los atributos que contiene Caguano.
	public Caguano(int cantOcupantes, String fechaIngresoInstitucion,
			int alcanceTiro, String colorConfeti){
		super(cantOcupantes, fechaIngresoInstitucion);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}
	
	//falta metodo alcance de tiro  y color confeti.hacer java doc para estos metodos.
	
//Get, Set y toString clase Caguano.
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}
	
	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
	@Override
	public String toString() {
		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
	}
	
	//
}

