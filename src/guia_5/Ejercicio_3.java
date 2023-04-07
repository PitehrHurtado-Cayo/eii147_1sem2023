package guia_5;

import java.io.*;
import java.util.Arrays;

public class Ejercicio_3 {
    static String [] nombres = {"Constanza", "Pitehr", "Constanza", "Nicolas", "Constanza", null, null, null, null};
    static int plibre = 5;

    // inputs : Constanza
    // resultado: plibre = 2

    public static void main (String arg[]) throws IOException{
        BufferedReader  lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un nombre:");
        String nombre_ingresado = lector.readLine();

        int i = 0;
        while(i < plibre){
            if(nombre_ingresado.equals(nombres[i])){
                nombres[i] = nombres[plibre-1];
                nombres[plibre-1] = null; // NO ES NECESARIO (?) respuesta=NO
                plibre--;
            }else{
                i++;
            }
        }
        System.out.println(plibre);
        System.out.println(Arrays.toString(nombres));

    }
}
