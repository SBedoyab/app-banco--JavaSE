package model;

import javax.swing.*;
import java.util.Random;

public class CreacionNroCuentas {
    Random rnd=new Random();
    private int n;
    private int[] nroCuentas=new int[n];

    public CreacionNroCuentas(int[] nroCuentas) {
        this.nroCuentas = nroCuentas;
    }

    public int[] getNroCuentas() {
        return nroCuentas;
    }

    public void setNroCuentas(int[] nroCuentas) {
        this.nroCuentas = nroCuentas;
    }

    public int nroCuenta(int[] nroCuentas){
        int nroCuenta, cont;
        do {
            cont=0;
            nroCuenta=0;
            nroCuenta=rnd.nextInt(99999999);
            for (int i=0; i<n+1 ; i++){
                if (nroCuenta==nroCuentas[i]){
                    cont++;
                }
            }

        }while(cont != 0);
        n++;
        nroCuentas[n]=nroCuenta;

        return nroCuenta;
    }
}
