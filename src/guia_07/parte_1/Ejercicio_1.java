package guia_07.parte_1;

import java.io.*;

public class Ejercicio_1 {
    public static void main(String arg[]) throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        CuentaCorriente cuenta = null;
        boolean seguir = true;

        String rut_ingresado;
        int monto_ingresado;
        int id_ingresado;
        while(seguir){
            System.out.println("""
                    Ingrese una opcion:
                    1 iniciar proceso
                    2 realizar deposito
                    3 realizar giro
                    4 consultar saldo
                    5 salir
                    """);
            int opcion_ingresada = Integer.parseInt(lector.readLine());
            switch (opcion_ingresada){
                case 1:
                    System.out.println("Ingrese rut");
                    rut_ingresado = lector.readLine();
                    System.out.println("Ingrese id");
                    id_ingresado = Integer.parseInt(lector.readLine());
                    if(cuenta == null){
                        cuenta = new CuentaCorriente(rut_ingresado,id_ingresado);
                    }
                    break;

                case 2:
                    System.out.println("Ingrese rut");
                    rut_ingresado = lector.readLine();
                    System.out.println("Ingrese monto");
                    monto_ingresado = Integer.parseInt(lector.readLine());
                    if(cuenta.getRut().equals(rut_ingresado)){
                        cuenta.depositar(monto_ingresado);
                        System.out.println("Operacion exitosa");
                        break;
                    }
                    System.out.println("Operacion fallida");
                    break;

                case 3:
                    System.out.println("Ingrese rut");
                    rut_ingresado = lector.readLine();
                    System.out.println("Ingrese monto");
                    monto_ingresado = Integer.parseInt(lector.readLine());
                    if(cuenta.getRut().equals(rut_ingresado)){
                        if(cuenta.girar(monto_ingresado)){
                            System.out.println("Operacion exitosa");
                        }
                        break;
                    }
                    System.out.println("Operacion fallida");
                    break;

                case 4:
                    if(cuenta != null){
                        System.out.println(cuenta.getSaldo());
                    }
                    break;

                case 5:
                    seguir=false;
            }
        }
    }
}
