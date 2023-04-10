package guia_4;

import java.io.*;

public class Ejercicio_3 {
    /*
    SUPUESTOS:
    1) haremos uso de plibre
    2) nombres ingresados todos en minusculas
     */
    public static void main(String arg[]) throws IOException{
        BufferedReader objetoQueLee = new BufferedReader(new InputStreamReader(System.in));
        String [] nombres = null;
        boolean [] asistencia = null;
        int plibre = 0;
        boolean seguir = true;
        while(seguir){
            System.out.println("""
                    1) Iniciar Proceso
                    2) Tomar Asistencia
                    3) Alumnos Presentes
                    5) salir
                    """);
            String opcion_ingresada = objetoQueLee.readLine();
            if(opcion_ingresada.equals("1")){
                System.out.println("Ingrese la cantidad de alumnos");
                int cantidad_alumnos = Integer.parseInt(objetoQueLee.readLine());

                nombres = new String[cantidad_alumnos];
                asistencia = new boolean[cantidad_alumnos];
                plibre = 0;

            } else if (opcion_ingresada.equals("2")) {
                System.out.println("Ingrese el nombre del alumno");
                String nombre_ingresado = objetoQueLee.readLine();

                System.out.println("Ingrese Asistencia");
                boolean asistencia_ingresada = Boolean.parseBoolean(objetoQueLee.readLine());

                if(nombres!=null){
                    boolean esta = false; // premisa inicial: alumno no esta registrado
                    for(int i = 0; i<plibre ; i++){
                        if(nombre_ingresado.equals(nombres[i]))
                            esta=true;
                    }
                    if(!esta){
                        nombres[plibre] = nombre_ingresado;
                        asistencia[plibre] = asistencia_ingresada;
                        plibre++;
                    }else{
                        System.out.println("alumno ya registrado");
                    }
                }else{
                    System.out.println("No se ha instanciado el arreglo");
                }

            } else if (opcion_ingresada.equals("3")) {
                for(int i = 0; i<plibre; i++){
                    if(asistencia[i]){
                        System.out.println(nombres[i]);
                    }
                }
            } else if (opcion_ingresada.equals("4")) {

            } else if (opcion_ingresada.equals("5")) {
                seguir = false;
            }
        }
    }
}
