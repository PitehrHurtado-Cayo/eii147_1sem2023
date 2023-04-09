package guia_5;

import java.io.*;

public class Problema_1 {
    public static void main(String arg[]) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        // SUPUESTO: se define una opcion salir para finalizar la aplicación
        boolean salir = false;
        String opcion_ingresada;
        /*
        Solución propuesta incluye uso de arreglo compactos (puede no ocuparla si gusta)
        SKU productos se registraran en un arreglo STRING
        Inventario se registraran un arreglo INT

        SUPUESTOS:
        1. el sistema solo podra almacenar o registrar 100 productos
        2. el usuario siempre ingresara una cantidad de inventario valida (>0)
         */
        int cantidad_productos = 100;
        String [] productos = new String[cantidad_productos];
        int [] inventario = new int[cantidad_productos];
        int plibre = 0;

        while(!salir){
            System.out.println("""
                    Ingrese una Opción:
                    1) Registrar Inventario
                    2) Consultar Inventario
                    3) Rebajar Inventario
                    Otra Tecla) Salir
                    """);
            opcion_ingresada = lector.readLine();
            if (opcion_ingresada.equals("1")){
                System.out.println("Ingrese un SKU");
                String sku_ingresado = lector.readLine();
                System.out.println("Ingrese el inventario");
                int inventario_ingresado = Integer.parseInt(lector.readLine());

                boolean encontrado = false; // partimos de la premisa que el producto no fue encontrado
                for (int i = 0; i< plibre; i++){
                    if(productos[i].equals(sku_ingresado)){
                        // si lo encuentra cambia la premisa y se actualiza el inventario
                        encontrado = true;
                        inventario[i] = inventario[i] + inventario_ingresado;
                        System.out.println("Inventario total: " + inventario[i]);
                    }
                }
                if(!encontrado && plibre < productos.length) {
                    // si no fue encontrado y hay espacio en el arreglo, lo agrego
                    productos[plibre] = sku_ingresado;
                    inventario[plibre] = inventario_ingresado;
                    System.out.println("Inventario total: " + inventario[plibre]);
                    plibre++;
                }
            } else if (opcion_ingresada.equals("2")) {
                System.out.println("Ingrese el sku a consultar");
                String sku_a_consultar = lector.readLine();
                boolean encontrado = false;

                for(int i = 0; i<plibre; i++){
                    if(productos[i].equals(sku_a_consultar)){
                        encontrado = true;
                        System.out.println("Inventario = " + inventario[i]);
                    }
                }
                if(!encontrado)
                    System.out.println("producto no encontrado");
            } else if (opcion_ingresada.equals("3")) {
                System.out.println("Ingrese un SKU");
                String sku_a_rebajar = lector.readLine();
                System.out.println("Ingrese el inventario a rebajar");
                int inventario_a_rebajar = Integer.parseInt(lector.readLine());

                boolean encontrado = false;
                for(int i = 0; i < plibre; i++){
                    if(productos[i].equals(sku_a_rebajar)){
                        encontrado = true;
                        if(inventario[i] - inventario_a_rebajar >= 0)
                            inventario[i] = inventario[i] - inventario_a_rebajar;
                    }
                }
                if(!encontrado)
                    System.out.println("producto no encontrado");
            } else{
                salir = true;
            }
        }
    }
}
