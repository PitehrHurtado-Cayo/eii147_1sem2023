package P2.Ejercicio1;
public class Tripulante {
	
	//Clase Tripulante: Un tripulante posee un nombre 
	//(String), un rol (int), y un cargo dentro de la tripulación (String).
	//Al instanciarse, se deben solicitar todos los parámetros indicados.
	
	private String nombre;
	private int rol;
	private String cargo;
	private boolean embarcado;
	
	
	public Tripulante(String nombre, int rol, String cargo) {
		super();
		this.nombre = nombre;
		this.rol = rol;
		this.cargo = cargo;
		embarcado = false;
	}


	public String getNombre() {
		return nombre;
	}

	public int getRol() {
		return rol;
	}

	public String getCargo() {
		return cargo;
	}

	public boolean isEmbarcado() {
		return embarcado;
	}

}
