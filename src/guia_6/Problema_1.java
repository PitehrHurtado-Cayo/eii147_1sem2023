package guia_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_1 {
    /*
    Supuestos:
    - se define un como MAX cantidad de clientes a almacenar igual a 100, es decir, N =100
    - al agregar no es necesario verificar que el cliente se encuentre repetido
    - si no hay espacio se mostrara un msje de error
    - al buscar un titular, si no lo encuentra no es necesario mostrar un msje de error
     */
    public static void main(String arg[]) throws IOException{
        BufferedReader lectorcito = new BufferedReader(new InputStreamReader(System.in));
        // instanciamos nuestro arreglo y matriz
        String [][] clientes = new String[100][3];
        int [] saldos = new int[100];
        int plibre = 0;

        boolean seguir = true;
        while(seguir){
            System.out.println("""
                    ingrese una opcion
                    1. agregar titular
                    2. buscar titular
                    3. listar titulares
                    4. depositar
                    5. girar
                    6A. eliminar
                    6B. eliminar
                    7. salir
                    """);
            String opcion_ingresada = lectorcito.readLine();
            if(opcion_ingresada.equals("7")){
                seguir=false;
            } else if (opcion_ingresada.equals("1")) {
                if(plibre == clientes.length){
                    System.out.println("Error: Clientes lleno");
                }else{
                    System.out.println("ingrese rut");
                    clientes[plibre][0] = lectorcito.readLine();
                    System.out.println("ingrese nombre");
                    clientes[plibre][1] = lectorcito.readLine();
                    System.out.println("ingrese direccion");
                    clientes[plibre][2] = lectorcito.readLine();
                    System.out.println("ingrese saldo inicial");
                    saldos[plibre] = Integer.parseInt(lectorcito.readLine());
                    plibre++;
                }
            } else if (opcion_ingresada.equals("2")) {
                System.out.println("Ingrese rut a buscar");
                String rut_buscado = lectorcito.readLine();
                for(int i = 0 ; i < plibre; i++){
                    if(clientes[i][0].equals(rut_buscado)) {
                        System.out.println("rut: " + clientes[i][0]);
                        System.out.println("nombre: " + clientes[i][1]);
                        System.out.println("direccion: " + clientes[i][2]);
                        System.out.println("saldo: " + saldos[i]);
                    }
                }
            } else if (opcion_ingresada.equals("3")) {
                for(int i = 0 ; i < plibre; i++){
                        System.out.print("rut: " + clientes[i][0] + " ");
                        System.out.print("nombre: " + clientes[i][1] + " ");
                        System.out.print("direccion: " + clientes[i][2] + " ");
                        System.out.println("saldo: " + saldos[i]);
                }
            } else if (opcion_ingresada.equals("4")) {
                System.out.println("Ingrese rut a depositar");
                String rut_ingresado = lectorcito.readLine();
                System.out.println("Ingrese monto a depositar");
                int monto_a_depositar = Integer.parseInt(lectorcito.readLine());
                for(int i = 0 ; i < plibre; i++){
                    if(clientes[i][0].equals(rut_ingresado)) {
                        saldos[i] += monto_a_depositar;
                    }
                }
            } else if (opcion_ingresada.equals("5")) {
                System.out.println("Ingrese rut a girar");
                String rut_ingresado = lectorcito.readLine();
                System.out.println("Ingrese monto a girar");
                int monto_a_girar = Integer.parseInt(lectorcito.readLine());
                for(int i = 0 ; i < plibre; i++){
                    if(clientes[i][0].equals(rut_ingresado)) {
                        if(saldos[i] >= monto_a_girar)
                            saldos[i] -= monto_a_girar;
                        else
                            System.out.println("No se puede girar");
                    }
                }
            }else if (opcion_ingresada.equals("6A")) {

            }else if (opcion_ingresada.equals("6B")) {

            }
        }
    }
}
