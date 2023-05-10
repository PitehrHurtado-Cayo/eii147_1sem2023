package guia_07.parte_2;

public class CuentaCorriente {
    private int id;
    private Cliente cliente_titular;
    private int saldo;
    private int transaccciones;

    public CuentaCorriente(String rut, int id){
        this.id = id;
        cliente_titular = new Cliente(rut); // se inicializa cliente = instanciar cliente usando su constructor
    }

    public String getRut() {
        return cliente_titular.getRut();
    }

    public int getSaldo() {
        return saldo;
    }

    public int getTransaccciones() {
        return transaccciones;
    }

    public void depositar(int monto){
        saldo += monto;
    }

    public boolean girar(int monto){
        int saldo_remanente = saldo - monto;
        if(saldo_remanente >= 0){
            saldo -= monto;
            return true;
        }
        return false;
    }
}
