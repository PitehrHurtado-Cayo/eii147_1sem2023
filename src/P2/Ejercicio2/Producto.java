package P2.Ejercicio2;

public class Producto {
    private String sku;
    private double peso;
    private boolean esFragil;
    private String destino;

    public Producto(String sku, double peso, boolean esFragil, String destino) {
        this.sku = sku;
        this.peso = peso;
        this.esFragil = esFragil;
        this.destino = destino;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean esFragil() {
        return esFragil;
    }

    public void setEsFragil(boolean esFragil) {
        this.esFragil = esFragil;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
