package guia_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio_D {
    public static void main(String arg[]) throws IOException {
        BufferedReader lectorcillo = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese valor N");
        int n = Integer.parseInt(lectorcillo.readLine());

        int [][] matrix = new int[n][n];

        for (int i= matrix.length-1; i>=0; i--){
            for(int j=matrix[i].length-1; j>=0; j--){
                System.out.println("ingrese el valor de ["+i+"]["+j+"]");
                matrix[i][j] = Integer.parseInt(lectorcillo.readLine());
            }
        }

        // Opcional: mostrar la matrix resultante
        System.out.println("Resultado:");
        for(int i = 0 ; i< matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}
