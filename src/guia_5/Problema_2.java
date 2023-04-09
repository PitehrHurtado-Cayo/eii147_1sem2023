package guia_5;

import java.io.*;

public class Problema_2 {
    public static void main(String arg[]) throws IOException{
        BufferedReader lectorcillo = new BufferedReader(new InputStreamReader(System.in));
        // SUPUESTO: se define una opcion salir para finalizar la aplicación
        boolean salir = false;
        String opcion_ingresada;
        /*
        Solución propuesta incluye uso de arreglo compacto INT
        los paquetes seran conceptualizados como posiciones del arreglo de tamaño 6
        primer paquete corresponde al indice 0.
        uso de variable auxiliar para registrar el peso total, asi evitamos recorrer siempre el arreglo

        SUPUESTOS:
        1. el usuario siempre ingresara un peso de paquetes valida (>0)
        2. al descargar no importa el orden resultante
        3. el usuario simpre ingresara una posicion de paquete valido (>=0)
         */
        int [] paquetes = new int[6];
        int plibre = 0;
        int peso_total = 0;

        while(!salir){
            System.out.println("""
                    Ingrese una opcion:
                    1) Cargar Paquete
                    2) Descargar Paquete
                    Otra tecla) Salir
                    """);
            opcion_ingresada = lectorcillo.readLine();
            if(opcion_ingresada.equals("1")){
                System.out.println("Ingrese el peso del nuevo paquete");
                int peso_nuevo_paquete = Integer.parseInt(lectorcillo.readLine());

                // si hay espacio y no se viola la restriccion de peso max 200k, agrego el paquete
                if(plibre < paquetes.length && (peso_total+peso_nuevo_paquete <= 200)){
                    paquetes[plibre] = peso_nuevo_paquete;
                    peso_total = peso_total + peso_nuevo_paquete;
                    plibre++;
                }

            } else if (opcion_ingresada.equals("2")) {
                System.out.println("Ingrese el paquete a descargar 0 - 5");
                int paquete_a_descargar = Integer.parseInt(lectorcillo.readLine());

                if(paquete_a_descargar == plibre-1) // si el paquete a descargar es el ultimo (plibre -1) simplemente reduzco plibre
                    plibre--;
                else if (paquete_a_descargar < plibre-1) { // si el paquete a descargar es cualquiera menos el ultimo, entonces muevo el ultimo a la posicion que quiero borrar
                    paquetes[paquete_a_descargar] = paquetes[plibre-1];
                    plibre--;
                }
            }else {
                salir = true;
            }
        }
    }
}
