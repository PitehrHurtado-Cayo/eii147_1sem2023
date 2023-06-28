package guia_14.Ejercicio_1;

public class Vehiculo {
    private int codigo;
    private String modelo;
    private int añoFabricacion;

    public Vehiculo(int codigo, String modelo, int añoFabricacion) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }
}
