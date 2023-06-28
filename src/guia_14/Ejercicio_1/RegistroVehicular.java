package guia_14.Ejercicio_1;

public class RegistroVehicular {
    private Vehiculo [] vehiculos;
    private int pl;
    public RegistroVehicular(){
        this.vehiculos = new Vehiculo[1000];
        this.pl = 0;
    }

    public boolean agregarVehiculo(Vehiculo v){
        for(int i=0; i<pl;i++){
            if(vehiculos[i].getCodigo() == v.getCodigo())
                return false;
        }
        if(pl >= vehiculos.length)
            return false;
        vehiculos[pl] = v;
        pl++;
        return true;
    }

    public Vehiculo eliminarVehiculo(int codigo){
        Vehiculo eliminado = null;
        for(int i=0; i<pl;i++){
            if(vehiculos[i].getCodigo() == codigo){
                eliminado = vehiculos[i];
                vehiculos[i] = vehiculos[pl-1];
                pl--;
                return eliminado;
            }
        }
        return eliminado;
    }

    public double sumarKilometraje(int año){
        // supuesto: no existe vehiculos fabricados en 2024 o mas
        double km_total = 0;
        for(int i=0; i< pl; i++){
            if(vehiculos[i].getAñoFabricacion() >= año) {
                if (vehiculos[i] instanceof Acuatico) {
                    km_total += ((Acuatico) vehiculos[i]).getKmRecorrido();
                }else{
                    km_total += ((Terreste) vehiculos[i]).getKmRecorrido();
                }
            }
        }
        if(km_total>0)
            return km_total;
        return -1;
    }

    public int importarVehiculosAcuaticos(Vehiculo[] lista){
        int cantidad_importada = 0;
        // recorremos lista que ingresa por parametro
        for(int j =0 ; j< lista.length; j++){
            if(lista[j]!=null && lista[j] instanceof Acuatico){
                if(agregarVehiculo(lista[j])) // este metodo valida que no se repita + que haya espacio + agrega el vehiculo
                    cantidad_importada++;
            }
        }
        return cantidad_importada;
    }

    public int[] contarVehiculoPorTipo(){
        // supuesto: indice 0=terreste indice 1=Acuatico
        int [] contador = new int[2];
        for(int i=0; i< pl; i++){
            if(vehiculos[i] instanceof Terreste){
                contador[0]++;
            }else{
                contador[1]++;
            }
        }
        return contador;
    }

    public int acuaticosEnAgua(){
        int contador = 0;
        for(int i=0; i< pl; i++){
            if(vehiculos[i] instanceof Acuatico && ((Acuatico)vehiculos[i]).estaEnAgua() == true)
                contador++;
        }
        return contador;
    }
}
