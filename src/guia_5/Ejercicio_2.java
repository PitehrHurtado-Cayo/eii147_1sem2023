package guia_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio_2 {
    static int [] array = {2, 3, 5 , 6, 7 , 0 , 0, 0 , 0 , 0};
    static int plibre = 5;
    /*
    CASO 1: valor ingresado = 1
    Resultado = No existen valores

    CASO 2: valor ingresado = 4
    resultado: [2,3]
     */
    public static void main (String arg[]) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el valor");
        int numero_ingresado = Integer.parseInt(lector.readLine());

        int cantidad_elementos_menor_o_igual = 0;
        for(int i = 0; i < plibre; i ++){
            if(array[i] <= numero_ingresado)
                cantidad_elementos_menor_o_igual++;
        }
        if (cantidad_elementos_menor_o_igual == 0) {
            System.out.println("No existen valores");
        }
        else {
            int [] array_nuevo = new int[cantidad_elementos_menor_o_igual];
            int plibre_nuevo_array = 0;

            for(int i = 0; i < plibre; i ++){
                if(array[i] <= numero_ingresado) {
                    array_nuevo[plibre_nuevo_array] = array[i];
                    plibre_nuevo_array++;
                }
            }

            System.out.println(Arrays.toString(array_nuevo));
        }

    }
}
