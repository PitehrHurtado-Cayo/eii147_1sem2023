package P2.Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppAeropuerto {

	public static void main(String[] args) throws IOException {

		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		Aeropuerto[] aeropuertos = new Aeropuerto[4];
		
		System.out.println("Ingrese código aeropuerto");
		String codigo = lector.readLine();
		boolean encontrado = false;
		for(int i = 0; i < aeropuertos.length; i++) {
			if(aeropuertos[i].getCodigoInternacional().equals(codigo)) {
				encontrado = true;
				System.out.println("La cantidad de pistas listas para despegue es " + aeropuertos[i].readyToDeparture());
			}
		}
		if(!encontrado) {
			System.out.println("Aeropuerto no existe");
		}
				

	}

}
