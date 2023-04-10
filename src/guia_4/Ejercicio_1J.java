package guia_4;

import java.util.Arrays;

public class Ejercicio_1J {
    /*
    Dado un arreglo int array_ejemplo invierta el contenido de este y muestre el contenido por pantalla.
     */
    static int [] array_ejemplo = {1,2,3,4,5,6,7};
    /*
    RESULTADO ESPERADO = {7,6,5,4,3,2,1}

    SUPUESTOS:
    1) arreglo lleno
     */
    public static void main(String arg[]) {

        System.out.println("arreglo original: "+ Arrays.toString(array_ejemplo)); // puede reemplazarlo por un FOR para ir mostrando cada posicion

        int i = 0;
        while( i < (array_ejemplo.length / 2)) {
            int aux = array_ejemplo[i];
            array_ejemplo[i] = array_ejemplo[array_ejemplo.length - 1 - i];
            array_ejemplo[array_ejemplo.length - 1 - i] = aux;
            i++;
        }

        System.out.println("resultado: "+ Arrays.toString(array_ejemplo)); // puede reemplazarlo por un FOR para ir mostrando cada posicion
    }
}
