package guia_6;

public class Ejercicio_B {
    /*
    CASO:
     matrix = { {1, 2, 3, 1, 2, 3, 1, 2, 3, 1},
                {4, 5, 6, 4, 5, 6, 4, 5, 6, 4},
                {7, 8, 9, 7, 8, 9, 7, 8, 9, 7},
                {1, 2, 3, 1, 2, 3, 1, 2, 3, 1},
                {4, 5, 6, 4, 5, 6, 4, 5, 6, 4},
                {7, 8, 9, 7, 8, 9, 7, 8, 9, 7},
                {1, 2, 3, 1, 2, 3, 1, 2, 3, 1},
                {1, 2, 3, 1, 2, 3, 1, 2, 3, 1},
                {4, 5, 6, 4, 5, 6, 4, 5, 6, 4},
                {7, 8, 9, 7, 8, 9, 7, 8, 9, 7} }
     Resultado Esperado = 7+5+3+1+8+6+1+8+6+1 = 46
     */
    static int [] [] matrix = { {1, 2, 3, 1, 2, 3, 1, 2, 3, 1},
                                {4, 5, 6, 4, 5, 6, 4, 5, 6, 4},
                                {7, 8, 9, 7, 8, 9, 7, 8, 9, 7},
                                {1, 2, 3, 1, 2, 3, 1, 2, 3, 1},
                                {4, 5, 6, 4, 5, 6, 4, 5, 6, 4},
                                {7, 8, 9, 7, 8, 9, 7, 8, 9, 7},
                                {1, 2, 3, 1, 2, 3, 1, 2, 3, 1},
                                {1, 2, 3, 1, 2, 3, 1, 2, 3, 1},
                                {4, 5, 6, 4, 5, 6, 4, 5, 6, 4},
                                {7, 8, 9, 7, 8, 9, 7, 8, 9, 7} };
    public static void main(String arg []){
        /*
         IDEA:
         dado que sumaremos los valores: [9][0] + [8][1] + [7][2] + ... es decir mientras dimension-fila decrece, la dimencion-columna crece
         lo cual corresponde a la diagonal secundaria, entonces solo ocuparemos una estructura de control
         */
        int suma_diagonal_secundaria = 0;
        for (int i = 0; i < matrix.length; i++){
            suma_diagonal_secundaria += matrix[matrix.length - 1 - i][i];
        }
        System.out.println("La suma de la diagonal secundaria es: " + suma_diagonal_secundaria);
        /*
        Comentarios:
        recordar que matrix.lenght - 1 = cantidad de filas
        Entonces cuando i = 0
            matrix[9-0][0] -> matrix[9][0]
        cuando i = 1
            matrix[9-1][1] -> matrix[8][1]
        ....
         */

    }
}
