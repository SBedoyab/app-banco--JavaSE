package model;

public class Transaccion {
    private CuentaBancaria cuentaOrigen;
    private CuentaBancaria cuentaDestino;
    private double monto;

    public Transaccion(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, double monto) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
    }

    public CuentaBancaria getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public CuentaBancaria getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(CuentaBancaria cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void ejecutarTransaccion(){
        if (cuentaOrigen.getSaldo()>=monto){

        }
    }
}
