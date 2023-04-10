package guia_5;

import java.util.Arrays;

public class Ejercicio_1 {
    static  int [] array = {1, 2, 2, 2, 3, 4, 4, 5, 5, 0, 0};
    static int plibre = 9;
    /*
    cantidad duplicados = 3 (numeros 2, 4, 5)
    array con valores unicos = [1,2,3,4,5....]
     */
    public static void main(String [] arg) {

        int [] arreglo_unicos = new int[plibre];
        boolean [] duplicados = new boolean[plibre];
        int plibre_arreglo_unicos = 0;

        for(int i = 0; i< plibre; i++){
            boolean esta = false;

            for(int j =0; j< plibre_arreglo_unicos; j++){
                if(array[i] == arreglo_unicos[j]) {
                    esta = true;
                    duplicados[j] = true;
                }
            }
            if(!esta){
                arreglo_unicos[plibre_arreglo_unicos] = array[i];
                duplicados[plibre_arreglo_unicos] = false;
                plibre_arreglo_unicos++;
            }
        }

        int contador_elementos_duplicados = 0;
        for(int j = 0; j< plibre_arreglo_unicos; j++){
            if(duplicados[j]){
                contador_elementos_duplicados++;
            }
        }

        System.out.println("Cantidad de duplicados: " + contador_elementos_duplicados);
        System.out.println("Arreglo Unicos: " + Arrays.toString(arreglo_unicos));
    }
}
