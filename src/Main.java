import model.Cliente;
import model.CreacionNroCuentas;
import model.CuentaBancaria;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int op;

        System.out.println("¡Bienvenido a nuestro portal bancario virtual!\nEscoja una de las siguientes opciones:\n" +
                "1-Iniciar sesión.\n2-Registrarse.\n0-Salir.");
        op=in.nextInt();

        switch (op){
            case 1:
                inicioSesion();
            break;
            case 2:
                registroUsuarios();
            break;

            case 0:
                System.out.println("Hasta pronto~.");
            break;

            default:
                System.out.println("Ingrese una opción correcta por favor.");
        }



    }

    private static void inicioSesion(){

    }

    private static void registroUsuarios(){
        CreacionNroCuentas creacionNroCuentas=new CreacionNroCuentas();
        Scanner in=new Scanner(System.in);
        String nombre="",dni="",ocupacion="";
        int nroCuenta=0, op=0;
        float saldo=0;
        boolean conf=false;

        System.out.print("Para comenzar su registro, digite su nombre completo por favor: ");
        nombre= in.nextLine();

        System.out.print("Digite su identificacion: ");
        dni= in.nextLine();

        System.out.print("Ocupación: ");
        ocupacion= in.nextLine();

        Cliente cliente1=new Cliente(nombre,ocupacion,dni);

        do {
            System.out.println("Para proceder con la creación de la cuenta, debe hacer una consignación por un valor " +
                    "mínimo de 5.000COP, ¿puede hacerla ahora mismo?\n1-Sí.\n2-No.\n0-Cancelar proceso");
            op= in.nextInt();

            switch (op){
                case 1:
                    do {
                        System.out.print("Digite el monto a añadir: ");
                        saldo=in.nextFloat();

                        if (saldo>=5000){

                            nroCuenta=creacionNroCuentas.nroCuenta();
                            System.out.println("¡Registro exitoso! Tu número de cuenta bancaria es: "+nroCuenta);
                            CuentaBancaria cuentaBancaria1=new CuentaBancaria(cliente1,nroCuenta,saldo);

                        }else {System.out.println("Debe ser una cantidad mayor a 5.000COP.");}

                    }while(saldo<5000);
                    conf=true;

                 break;

                case 2:
                    System.out.println("Lo sentimos, para la creacion de la cuenta debe de poseer los medios para hacer el depósito mínimo.");
                break;

                case 0:
                    System.out.println("¡Gracias por preferirnos! Esperamos verte nuevamente.");
                    conf=true;
                    break;

                default:
                    System.out.println("Seleccione una opción correcta por favor.");
            }

        }while(conf == false);


    }
}