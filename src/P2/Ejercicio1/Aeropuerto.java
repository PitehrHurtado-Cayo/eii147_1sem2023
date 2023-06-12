package P2.Ejercicio1;
public class Aeropuerto {
	
	private String nombre, direccion, codigoInternacional;
	private Vuelo[] pistas;


	public Aeropuerto(String nombre, String direccion, String cod) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		codigoInternacional = cod;
		pistas = new Vuelo[10];
	}
	
	public int readyToDeparture() {
		int cola = 0;
		for(int i = 0; i < pistas.length; i++) {
			if(pistas[i] != null && pistas[i].listoParaDespegue() == true && pistas[i].getOrigen().equals(codigoInternacional))
				cola++;
		}
		return cola;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getCodigoInternacional() {
		return codigoInternacional;
	}

}
