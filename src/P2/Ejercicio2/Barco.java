package P2.Ejercicio2;

public class Barco {
    private String [] destinos;
    private String id;
    private int plibre;
    private Container []  containers;

    public Barco(String[] destinos, String id) {
        this.destinos = destinos;
        this.id = id;
        this.containers = new Container[100];
        this.plibre = 0;
    }

    public boolean agregarContainer(Container nuevo){
        // hay espacio?
        if(plibre >= containers.length)
            return false;  // no hay espacio

        // barco visita el destino del nuevo container?
        if(estaEnDestinos(nuevo.getDestino()) == false)
            return false; // el barco no tiene el mismo destino

        // el container ya se encuentra?
        if(existeContainer(nuevo.getCodigo()) == true)
            return false; // el container ya fue agregado antes

        // si llegamos aca podemos agregar
        containers[plibre] = nuevo;
        plibre++;
        return true;
    }
    /*
    Metodo auxiliar, no era necesario
     */
    public boolean estaEnDestinos(String destino){
        // retorna true si el destino ingresado se encuentra en el arreglo de destinos del barco
        for(int i =0; i< destinos.length ; i++){
            if(destino.equals(destinos[i]))
                return true; // si esta en destinos
        }
        return false; // no esta
    }
    /*
    Metodo auxiliar, no era necesario
     */
    public boolean existeContainer(int codigo){
        // retorna true si el container ya se encuentra en el arreglo de containers
        for(int i =0; i< plibre ; i++){
            if(containers[i].getCodigo() == codigo)
                return true; // si esta agregado
        }
        return false; // no esta agregado
    }

    public boolean agregarProducto(Producto nuevo, int codigo){
        // buscar container
        for(int i = 0; i< plibre; i++){
            if(containers[i].getCodigo() == codigo)
                return containers[i].agregarProducto(nuevo);
        }
        return false; // no encontro al container
    }
    public int cantidadProductosFragil(String destino){
        // destino esta en arreglo de destinos?
        if(estaEnDestinos(destino) == false)
            return 0; // no esta

        // acumulamos la cantidad de productos fragiles
        int cantidad = 0;
        for(int i =0; i< plibre; i++){
            if(containers[i].getDestino().equals(destino))
                cantidad += containers[i].cantidadProductosFragiles();
        }
        return cantidad;
    }

}
