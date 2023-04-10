package guia_4;

import java.io.IOException;

public class Ejercicio_4C {
    static String [] array_alumnos = {"Pitehr", "Constanza", "Pitehr", "Constanza", "Constanza", "Vicente", null, null, null};
    static int plibre = 6;
    /*
    Dado un arreglo STRING array_alumnos que utiliza la convención de PLibre, cuente la cantidad de de nombres UNICOS.

    RESULTADO ESPERADO = 2 (Pitehr y Constanza)

    SUPUESTOS:
    1) haremos uso de un arreglo auxiliar
     */
    public static void main(String arg[]) throws IOException{
        /*
        IDEA DE SOLUCION en palabras:
        crear un arreglo auxiliar, agregando solo nombres unicos, es decir, cada vez que queramos agregar verificamos que no se haya agregado.
        el resultado sera un arreglo auxiliar con los nombres unicos, esto nos facilita contar
         */

        String [] array_auxiliar = new String[plibre]; // CASO EXTREMO: no hay nombres repetidos, por eso largo del arreglo auxiliar es PLIBRE (es decir, la cantidad de datos del arreglo original)
        int plibre_array_auxiliar = 0;

        for(int i = 0; i<plibre; i++){
            boolean esta = false; // premisa: nombre de la posicion i no esta agregado en el arreglo auxiliar hasta que se demuestre lo contrario
            for(int j = 0; j< plibre_array_auxiliar; j++){
                if(array_alumnos[i].equals(array_auxiliar[j]))
                    esta = true;
            }
            if(!esta){
                array_auxiliar[plibre_array_auxiliar] = array_alumnos[i];
                plibre_array_auxiliar++;
            }
        }

        System.out.println("Cantidad de nombres unicos: " + plibre_array_auxiliar);

    }
}
