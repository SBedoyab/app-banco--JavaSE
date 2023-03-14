package model;

import java.util.Random;

public class CreacionNroCuentas {
    Random rnd=new Random();
    private int n;
    private int[] nroCuentas=new int[n];
    int aux;

    public int[] getNroCuentas() {
        return nroCuentas;
    }

    public void setNroCuentas(int[] nroCuentas) {
        this.nroCuentas = nroCuentas;
    }

    public int nroCuenta(){
        int nroCuenta;
        boolean cont=false;

        do {
            nroCuenta=0;
            nroCuenta=rnd.nextInt(999999);

            for (int i=0; i<n ; i++){
                if (nroCuenta==nroCuentas[i]){
                    cont=true;
                    break;
                }else{
                    nroCuentas[n-1]=nroCuenta;
                    break;
                }
            }

        }while(cont == true);



        return nroCuenta;
    }
}
