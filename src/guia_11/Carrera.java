package guia_11;

public class Carrera {
    private int id;
    private String nombre;
    private int cantidad_alumnos;
    private int cantidad_semestres;

    private Alumno [][] alumnos_inscritos;

    public Carrera(int id, String nombre, int cantidad_alumnos, int cantidad_semestres) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad_alumnos = cantidad_alumnos;
        this.cantidad_semestres = cantidad_semestres;
        alumnos_inscritos = new Alumno[cantidad_semestres][cantidad_alumnos];
    }
    public boolean agregarAlumno(Alumno obj, int semestre) {
        for (int i = 0; i < alumnos_inscritos[semestre].length; i++) {
            if (alumnos_inscritos[semestre][i] != null && alumnos_inscritos[semestre][i].getRol() == obj.getRol())
                return false; // el alumno ya se encuentra registrado
        }
        for (int i = 0; i < alumnos_inscritos[semestre].length; i++) {
            if (alumnos_inscritos[semestre][i] == null) {
                alumnos_inscritos[semestre][i] = obj; // busco la primera posicion null para agregar
                return true;
            }
        }
        return false; // no hubo posiciones vacias
    }
    public Alumno eliminarAlumno(int rol, int semestre){
        for (int i = 0; i < alumnos_inscritos[semestre].length; i++) {
            if (alumnos_inscritos[semestre][i] != null && alumnos_inscritos[semestre][i].getRol() == rol) {
                // el alumno fue encontrado
                Alumno alumno_eliminado = alumnos_inscritos[semestre][i];
                alumnos_inscritos[semestre][i] = null;
                return alumno_eliminado; // retorno el objeto Alumno
            }

        }
        return null; // no se encontro al alumno buscado
    }

    public boolean agregarPromedioAlumno(int rol, int semestre, double promedio){
        for (int i = 0; i < alumnos_inscritos[semestre].length; i++) {
            if (alumnos_inscritos[semestre][i] != null && alumnos_inscritos[semestre][i].getRol() == rol) {
                return alumnos_inscritos[semestre][i].agregarPromedioSemestral(semestre, promedio); // sera V o F
            }

        }
        return false; // no se encontro al alumno
    }
    public double [] obtenerPromediosGenerales(){
        double [] promedios = new double[this.cantidad_semestres];
        for(int s = 0; s < this.cantidad_semestres; s++){
            // por semestre calculare el promedio
            double suma = 0;
            int contador = 0;
            for(int i = 0; i < this.alumnos_inscritos[s].length; i++){
                if(this.alumnos_inscritos[s][i]!=null){
                    suma += this.alumnos_inscritos[s][i].getPromedioPorSemestre(s);
                    contador++;
                }
            }
            // termine de sumar en un semestre "s"
            if(contador>0) // evitar 0 / 0
                promedios[s] = suma/contador;
            else
                promedios[s] = 0;
        }
        return promedios;
    }

    public int getId(){
        return this.id;
    }
}
