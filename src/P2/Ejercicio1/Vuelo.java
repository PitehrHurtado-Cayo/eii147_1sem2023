package P2.Ejercicio1;
public class Vuelo {
	
	private String numeroVuelo;
	private String origen, destino, horarioPartida, modelo;
	
	private Tripulante[] tripulacion;
	private int posLT;
	
	private Pasajero[] cabina;
	
	public Vuelo(String num, String o, String d, String h, String m, Tripulante piloto, int asientos) {
		numeroVuelo = num;
		origen = o;
		destino = d;
		horarioPartida = h;
		modelo = m;
		
		tripulacion = new Tripulante[7];
		tripulacion[0] = piloto;
		posLT = 1;
		cabina = new Pasajero[asientos];
		
	}

	public boolean ready() {
		return posLT >= 4;
	}

	//ejercicio c
	public boolean listoParaDespegue() {
		for(int i = 0; i < cabina.length; i++) {
			if(cabina[i] != null && cabina[i].isVerificado() == false)
				return false;
		}
		return verificacionTripulacion();
	}
	
	private boolean verificacionTripulacion() {
		if(tripulacion[0].getCargo() != "piloto")
			return false;
		if(posLT <= 3)
			return false;
		for(int i = 0; i < posLT; i++) {
			if(!tripulacion[i].isEmbarcado())
				return false;
		}
		return true;
	}
	
	//ejercicio b
	public int asientosDisponibles() {
		int asientosDisponibles = 0;
		for(int i = 0; i < cabina.length; i++) {
			if(cabina[i] == null)
				asientosDisponibles++;
		}
		return asientosDisponibles;
	}

	public String getOrigen() {
		return origen;
	}

}
