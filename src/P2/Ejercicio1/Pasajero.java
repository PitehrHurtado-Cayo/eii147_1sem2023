package P2.Ejercicio1;
public class Pasajero {

	//Clase Pasajero: Un pasajero se caracteriza por poseer un nombre 
	//(String), un rut (int) y una nacionalidad (String). 
	//Al instanciarse, se deben solicitar todos los parámetros indicados.

	private String nombre;
	private int rut;
	private String nacionalidad;
	private boolean verificado;

	public Pasajero(String nombre, int rut, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.nacionalidad = nacionalidad;
		verificado = false;
	}

	public String getNombre() {
		return nombre;
	}

	public int getRut() {
		return rut;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public boolean isVerificado() {
		return verificado;
	}
}
