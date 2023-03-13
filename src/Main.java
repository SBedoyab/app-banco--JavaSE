import model.Cliente;
import model.CreacionNroCuentas;
import model.CuentaBancaria;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rnd=new Random();
        String nombre,dni,ocupacion;
        int n=1;
        int[] nroCuentas=new int[n];

        System.out.print("¡Bienvenido a nuestro portal virtual!\nPara comenzar su registro, " +
                "digite su nombre completo por favor: ");
        nombre= in.nextLine();
        System.out.print("\nDigite su identificacion: ");
        dni= in.nextLine();
        System.out.print("\n\nOcupación: ");
        ocupacion= in.nextLine();


        Cliente cliente1=new Cliente(nombre,ocupacion,dni);
        CreacionNroCuentas
        CuentaBancaria cuentaBancaria1=new CuentaBancaria(cliente1,);


    }
}