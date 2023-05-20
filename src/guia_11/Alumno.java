package guia_11;

public class Alumno {
    private int rol;
    private String nombre;
    private String carrera;
    private int año_ingreso;
    private double [] promedios_semestrales;

    public Alumno(int rol, String nombre, String carrera, int año_ingreso, int cantidad_semestres){
        this.rol = rol;
        this.nombre = nombre;
        this.carrera = carrera;
        this.año_ingreso = año_ingreso;
        this.promedios_semestrales = new double[cantidad_semestres];
    }

    public Alumno(int rol, String nombre, String carrera, int año_ingreso){
        this.rol = rol;
        this.nombre = nombre;
        this.carrera = carrera;
        this.año_ingreso = año_ingreso;
        this.promedios_semestrales = new double[11];
    }
    public boolean agregarPromedioSemestral(int semestre, double promedio){
        if (semestre >= this.promedios_semestrales.length)
            return false; // semestre no valido
        if (this.promedios_semestrales[semestre] == 0) {
            this.promedios_semestrales[semestre] = promedio;
            return true;
        }
        return false; // la nota del semestre ya se encuentra
    }

    public int getRol() {
        return rol;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño_ingreso() {
        return año_ingreso;
    }

    /*
    Metodo implicito requerido para la clase Carrera:
    retornar el promedio dado un semestre
     */
    public double getPromedioPorSemestre(int semestre){
        if(semestre >= this.promedios_semestrales.length)
            return 0.0;
        return this.promedios_semestrales[semestre];
    }

}
