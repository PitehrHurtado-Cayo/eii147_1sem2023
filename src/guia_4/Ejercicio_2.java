package guia_4;

import java.io.*;
import java.util.Arrays;

public class Ejercicio_2 {
    /*
    SUPUESTO:
    1) no se permite el uso de libreria MATH
    2) el orden en que se pide los coeficientes puede ser ascendente
     */
    public static void main(String arg[]) throws IOException{
        BufferedReader lectorcillo = new BufferedReader(new InputStreamReader(System.in));
        int [] coeficientes = null;
        boolean seguir = true;
        while(seguir){
            System.out.println("""
                    1) Ingresar Polinomio
                    2) Calcular Valor
                    3) salir
                    """);
            String opcion_ingresada = lectorcillo.readLine();
            if(opcion_ingresada.equals("1")){
                System.out.println("Ingrese el grado del polinomio");
                int grado_polinomio_ingresado = Integer.parseInt(lectorcillo.readLine());
                coeficientes = new int[grado_polinomio_ingresado+1];

                // Solicitar cada coeficiente
                for(int i = 0; i<coeficientes.length; i++){
                    System.out.println("Ingrese el coeficiente de x^"+i);
                    coeficientes[i] = Integer.parseInt(lectorcillo.readLine());
                }

                // opcional: para ver el arreglo
                System.out.println(Arrays.toString(coeficientes));
                //

            } else if (opcion_ingresada.equals("2")) {
                System.out.println("ingrese un valor para evaluar el polinomio: ");
                int valor_ingresado = Integer.parseInt(lectorcillo.readLine());
                int resultado = 0;

                for(int i = 0; i < coeficientes.length; i++){
                    // calculo de potencia
                    int potencia = 1;
                    for(int exponente = 1; exponente <= i; exponente++ ){
                        potencia = potencia*valor_ingresado;
                    }
                    // esto pudo haberse reemplazado por Math.pow(valor_ingresado, i)

                    resultado = resultado + coeficientes[i]*potencia;
                }

                // mostrar Resultado
                System.out.println("Resultado: " + resultado);

            } else if (opcion_ingresada.equals("3")) {
                seguir = false;
            }
        }
    }
}
