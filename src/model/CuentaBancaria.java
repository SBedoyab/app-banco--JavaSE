package model;

public class CuentaBancaria {
    private Cliente cliente;
    private int nCuenta;
    private float saldo;


    public CuentaBancaria(Cliente cliente, int nCuenta, float saldo) {
        this.cliente = cliente;
        this.nCuenta = nCuenta;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void Depositar(float monto){
        saldo+=monto;
    }

    public void Retirar(float retiro){
        if (saldo>=retiro){
            saldo-=retiro;
        }else System.out.println("No existe el saldo suficiente.");
    }

}
