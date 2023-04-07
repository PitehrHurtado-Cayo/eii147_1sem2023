package guia_5;

import javax.xml.stream.FactoryConfigurationError;
import java.security.MessageDigest;
import java.util.Arrays;

public class Ejercicio_1 {
    static  int [] array = {1, 2, 2, 3, 4, 4, 5, 5};
    /*
    cantidad duplicados = 3 (numeros 2, 4, 5)
    array con valores unicos = [1,2,3,4,5]
     */
    public static void main(String [] arg) {

        int contador_elementos_duplicados = 0;

        for (int i = 0; i < array.length; i++) {
            // premisa: todos parten de la base que no se repiten (false) hasta que se demuestre lo contrario
            boolean repetido = false;
            for (int j = i + 1; j < array.length && !repetido; j++) {
                if (array[i] == array[j]) {
                    // se demuestra que esta duplicado, cambia a True
                    contador_elementos_duplicados++;
                    repetido = true;
                }
            }
        }
        System.out.println("cantidad de valores duplicados: "+contador_elementos_duplicados);

        // premisa: si valores duplicados es X implicado que en el arreglo hay 2X
        // valores unicos = largo del arreglo - valores duplicados
        int largo_nuevo_arreglo = array.length-contador_elementos_duplicados;
        int [] array_nuevo = new int[largo_nuevo_arreglo];
        // plibre usado para ir agregando
        int plibre = 0;

        for (int i = 0; i < array.length; i++){
            // premisa: todos parte con la base que no se encuentran en el arreglo nuevo, hasta demostrar lo contrario
            boolean esta = false;
            for (int j = 0; j < plibre; j++)
                if(array[i] == array_nuevo[j]) // se demuestra que si esta en el nuevo arreglo
                    esta = true;
            if(!esta) { // si not esta (false) entonces lo agrego
                array_nuevo[plibre] = array[i];
                plibre++;
            }
        }
        // mostrar por pantalla los valores
        // puede ocuparse otro for para ir iterando, no es necesario ocupar "Array.toString"
        System.out.println(Arrays.toString(array_nuevo));
    }
}
