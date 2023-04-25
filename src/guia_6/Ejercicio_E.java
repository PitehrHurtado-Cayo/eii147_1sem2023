package guia_6;

import java.util.Arrays;

public class Ejercicio_E {
    /*
    CASO:
     matrix = { {1, 2, 3, 1, 2, 3, 1},
                {4, 5, 6, 4, 5, 6, 4},
                {7, 8, 9, 7, 8, 9, 7},
                {1, 2, 3, 1, 2, 3, 1},
                {4, 5, 6, 4, 5, 6, 4},
                {7, 8, 9, 7, 8, 9, 7},
                {1, 2, 3, 1, 2, 3, 1},
                {1, 2, 3, 1, 2, 3, 1},
                {4, 5, 6, 4, 5, 6, 4},
                {7, 8, 9, 7, 8, 9, 7} }
     Resultado Esperado:
     prom fila 0 = (1+2+3+1+2+3+1)/7 = 1,86
     prom fila 1 = (4+5+6+4+5+6+4)/7 = 4,86
     ....

     se deben ir almacenando los promedios:
     arreglo[0] = 1,86
     arreglo[1] = 4,86
     ....
     */
    static int [] [] matrix = { {1, 2, 3, 1, 2, 3, 1},
                                {4, 5, 6, 4, 5, 6, 4},
                                {7, 8, 9, 7, 8, 9, 7},
                                {1, 2, 3, 1, 2, 3, 1},
                                {4, 5, 6, 4, 5, 6, 4},
                                {7, 8, 9, 7, 8, 9, 7},
                                {1, 2, 3, 1, 2, 3, 1},
                                {1, 2, 3, 1, 2, 3, 1},
                                {4, 5, 6, 4, 5, 6, 4},
                                {7, 8, 9, 7, 8, 9, 7} };
    public static void main(String arg[]){
        double[] arreglo_de_promedios = new double[10];

        for(int fila = 0; fila < matrix.length; fila++){
            double suma_fila = 0;
            for(int columna = 0; columna < matrix[fila].length; columna++)
                suma_fila += matrix[fila][columna];

            arreglo_de_promedios[fila] = suma_fila / 7;
        }

        // Opcional: mostrar arreglo resultante
        System.out.println(Arrays.toString(arreglo_de_promedios));
    }
}
