package P2.Ejercicio2;

public class Container {
    private int codigo;
    private String destino;
    private double pesoMaximo;
    private Producto [] productos;
    private int plibre;

    public Container(int codigo, String destino, double pesoMaximo) {
        this.codigo = codigo;
        this.destino = destino;
        this.pesoMaximo = pesoMaximo;
        this.productos = new Producto[100];
        this.plibre = 0;
    }

    public Container(int codigo, String destino) {
        this.codigo = codigo;
        this.destino = destino;
        this.pesoMaximo = 100;
        this.productos = new Producto[100];
        this.plibre = 0;
    }

    public boolean agregarProducto(Producto nuevo){
        //hay espacio?
        if(plibre >= productos.length)
            return false; // no hay espacio

        // mismo destino?
        if(nuevo.getDestino().equals(this.destino) == false)
            return false; // no tiene mismo destino

        // no superamos peso max?
        double peso_total = getPesoTotal(); // metodo auxiliar, pudieron hacer la suma aca en vez de usar un metodo
        if(peso_total + nuevo.getPeso() > this.pesoMaximo)
            return false; // superamos peso maximo

        // si llegamos aca es poque las condiciones anteriores se cumplen
        productos[plibre] = nuevo;
        plibre++;
        return true;
    }

    public double getPesoTotal(){
        double peso = 0;
        for(int i = 0; i< plibre; i++){
            peso += productos[i].getPeso();
        }
        return peso;
    }

    public int cantidadProductosFragiles(){
        int contador = 0;
        for(int i =0 ; i < plibre; i++){
            if(productos[i].esFragil() == true)
                contador++;
        }
        return contador;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }
}
