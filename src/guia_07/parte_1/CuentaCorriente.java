package guia_07.parte_1;

public class CuentaCorriente {
    private int id;
    private String rut;
    private int saldo;
    private int transaccciones;

    public CuentaCorriente(String rut, int id){
        this.id = id;
        this.rut = rut;
    }

    public String getRut() {
        return rut;
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
