package guia_14.Ejercicio_1;

public class Terreste extends Vehiculo{
    private double kmRecorrido;

    public Terreste(int codigo, String modelo, int añoFabricacion, double kmRecorrido) {
        super(codigo, modelo, añoFabricacion);
        this.kmRecorrido = kmRecorrido;
    }

    public double getKmRecorrido() {
        return kmRecorrido;
    }
}
