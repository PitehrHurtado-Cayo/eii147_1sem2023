package guia_14.Ejercicio_1;

public class Acuatico extends Vehiculo{
    private double millasNauticas;
    private boolean estaEnAgua;

    public Acuatico(int codigo, String modelo, int añoFabricacion, double millasNauticas, boolean estaEnAgua) {
        super(codigo, modelo, añoFabricacion);
        this.millasNauticas = millasNauticas;
        this.estaEnAgua = estaEnAgua;
    }

    public boolean estaEnAgua() {
        return estaEnAgua;
    }
    public double getKmRecorrido(){
        return this.millasNauticas * 1852;
    }
}
