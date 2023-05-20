package guia_11;

import java.io.*;
import java.util.Arrays;

public class Aplicación {
    public static void main(String [] args) throws IOException{
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        Carrera [] carreras = new Carrera[3];
        int pL = 0; // supuesto: se manejara el arreglo de carreras de forma compacta
        boolean seguir = true;
        int id_carrera;
        int semestre_carrera;
        int rol_alumno;
        while(seguir){
            System.out.println("""
                    Ingrese una opcion:
                    1. Agregar Carrera
                    2. Agregar Alumno a Carrera
                    3. Eliminar Alumno de Carrera
                    4. Agregar Promedio a Alumno de Carrera
                    5. Obtener Promedios Generales de Carrera
                    6. Salir
                    """);
            String opcion_ingresada = lector.readLine();
            switch (opcion_ingresada){
                case "1":
                    if (pL == carreras.length) {
                        System.out.println("No hay espacio");
                        break;
                    }
                    System.out.println("Ingrese el id de carrera");
                    int id_ingresado = Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese el Nombre de carrera");
                    String nombre_carrera = lector.readLine();
                    System.out.println("Ingrese el cantidad de alumnos");
                    int cant_alumnos = Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese el cantidad de semestres");
                    int cant_semestres = Integer.parseInt(lector.readLine());
                    carreras[pL] = new Carrera(id_ingresado, nombre_carrera, cant_alumnos, cant_semestres);
                    pL++;
                    break;

                case "2":
                    System.out.println("Ingrese el id de carrera");
                    id_carrera = Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese el semestre donde agregar");
                    semestre_carrera = Integer.parseInt(lector.readLine());

                    System.out.println("Ingrese el Nombre de alumno");
                    String nombre_alumno = lector.readLine();
                    System.out.println("Ingrese el rol de Alumno");
                    rol_alumno = Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese la carrera de Alumno");
                    String carrera_alumno = lector.readLine();
                    System.out.println("Ingrese el año de ingreso de Alumno");
                    int año_ingreso = Integer.parseInt(lector.readLine());
                    System.out.println("""
                            Desea indicar cantidad de semestres?
                            Ingrese True o False
                            """);
                    boolean opcion = Boolean.parseBoolean(lector.readLine());
                    Alumno alumno_nuevo;
                    if(opcion) {
                        // creamos el obj Alumno con cantidad de semestres
                        System.out.println("Ingrese cantidad de semestres de Alumno");
                        int semestre_alumno = Integer.parseInt(lector.readLine());
                        alumno_nuevo = new Alumno(rol_alumno, nombre_alumno, carrera_alumno, año_ingreso, semestre_alumno);
                    }else
                        // creamos obj Alumno sin cantidaad de semestres
                        alumno_nuevo = new Alumno(rol_alumno, nombre_alumno, carrera_alumno, año_ingreso);

                    // buscamos la carrera para agregarlo
                    for(int i = 0; i<pL; i++){
                        if(carreras[i].getId() == id_carrera){ // si es V encontramos la carrera
                            if(carreras[i].agregarAlumno(alumno_nuevo, semestre_carrera))
                                System.out.println("Se agrego correctamente");
                            else
                                System.out.println("No se agregó");
                            break;
                        }
                    }
                    System.out.println("No se encontró la carrera");
                    break;

                case "3":
                    System.out.println("Ingrese el id de carrera");
                    id_carrera = Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese el semestre de carrera");
                    semestre_carrera = Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese el rol de Alumno");
                    rol_alumno = Integer.parseInt(lector.readLine());

                    // recorremos arreglo de carrera
                    for(int c = 0; c< pL; c++){
                        if(carreras[c].getId() == id_carrera) {
                            Alumno eliminado = carreras[c].eliminarAlumno(rol_alumno, semestre_carrera);
                            if (eliminado != null) { // si es != null quiere decir que la carrera "c" tenia al alumno y lo eliminó
                                System.out.println("Nombre" + eliminado.getNombre());
                                System.out.println("Rol" + eliminado.getRol());
                                System.out.println("Año de Ingreso" + eliminado.getAño_ingreso());
                                break;
                            }
                        }
                    }
                    System.out.println("Alumno no encontrado");
                    break;

                case "4":
                    System.out.println("Ingrese el id de carrera");
                    id_carrera = Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese el semestre de carrera");
                    semestre_carrera = Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese el rol de Alumno");
                    rol_alumno = Integer.parseInt(lector.readLine());
                    System.out.println("Ingrese el promedio de Alumno");
                    double promedio = Double.parseDouble(lector.readLine());
                    // recorremos buscando carrera
                    for(int c = 0; c< pL; c++){
                        if(carreras[c].getId() == id_carrera){
                            if(carreras[c].agregarPromedioAlumno(rol_alumno, semestre_carrera, promedio)){
                                System.out.println("Se agregó el promedio correctamente");
                                break;
                            }
                        }
                    }
                    System.out.println("Se produjo un error al agregar promedio");
                    break;

                case "5":
                    System.out.println("Ingrese el id de carrera");
                    id_carrera = Integer.parseInt(lector.readLine());
                    // buscamos carrera
                    for(int c = 0; c< pL; c++){
                        if(carreras[c].getId() == id_carrera){
                            double [] promedios = carreras[c].obtenerPromediosGenerales();
                            // mostrar valores de promedios: pueden usar un for o while para recorrer
                            System.out.println(Arrays.toString(promedios));
                            break;
                        }
                    }
                    System.out.println("Se produjo un error al consultar promedios");
                    break;

                default:
                    seguir = false;
                    System.out.println("Saliending");
            }
        }
    }
}
