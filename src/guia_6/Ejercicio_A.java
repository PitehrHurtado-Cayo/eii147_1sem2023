package guia_6;

public class Ejercicio_A {
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
     Resultado Esperado = 1 + 5 + 9 + 1 + 5 + 9 + 1 + 2 + 6 + 7 = 46
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
    public static void main(String arg[]){
        /*
         IDEA:
         dado que sumaremos los valores donde fila = columnas, es decir, [0][0] + [1][1] + [2][2] + ...
         lo cual corresponde a la diagonal principal, entonces solo ocuparemos una estructura de control
         */
        int suma_diagonal_principal = 0;
        for(int i = 0; i < matrix.length; i++ ){
            suma_diagonal_principal += matrix[i][i];
        }
        System.out.println("La suma de la diagonal princiapl es: " + suma_diagonal_principal);
    }
}
