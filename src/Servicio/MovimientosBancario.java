package Servicio;

import Entidades.Cuenta;

import java.util.Scanner;


public class MovimientosBancario {
    public static void Menu(Cuenta c1) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int opciones;
        do {
            System.out.println("");
            System.out.println("------MENU DE OPCIONES----------");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Extraccion Rapida");
            System.out.println("4. Consulta Saldo");
            System.out.println("5. Consultar Datos Personales");
            System.out.println("6. salir");
            opciones=sc.nextInt();
            switch (opciones){
                case 1:
                    System.out.println("MENU cuanto plata queres ingresar????");
                   double ingreso=sc.nextDouble();
                   ingresar(ingreso, c1);break;
                case 2:
                    System.out.println("cuanto plata queres sacar????");
                    double retiro=sc.nextDouble();
                    extraccion(c1, retiro);break;
                case 3:
                    System.out.println("ingresa el monto pero solo podes sacar el 20% de tu saldo con esta opcion, vo fijate!!");
                    double retiro20=sc.nextDouble();
                    extraccionRapida( c1, retiro20); break;

                case 4: mostrarSaldo(c1); System.out.println("su saldo disponible es $: "+ c1.getSaldoActual());

                break;
                case 5: mostrarDatos(c1); break;
                case 6:
            }
        }while (opciones!=6);
    }

    public static double ingresar(double ingreso,Cuenta c1){
        double sumaingreso= (double) c1.getSaldoActual()+ingreso;
        c1.setSaldoActual((int) Math.round(sumaingreso));
        System.out.println("el nuevo saldo dsp del ingreso es $ "+c1.getSaldoActual());
        return c1.getSaldoActual();
    }

    public static int mostrarSaldo(Cuenta c1){

        return c1.getSaldoActual();
    }

    public static boolean verificarSaldo(Cuenta c1, double retiro){
        return c1.getSaldoActual()>=retiro;
    }

    public static int extraccion(Cuenta c1, double retiro){
        if (verificarSaldo(c1, retiro)){
           double saldoPstRetiro=(double)(c1.getSaldoActual()-retiro);
           c1.setSaldoActual(  (int) (Math.round(saldoPstRetiro)));
           return c1.getSaldoActual();
        }else {
            System.out.println("no hay suficiente money");
        }

    return c1.getSaldoActual();
    }

    public static int extraccionRapida(Cuenta c1, double retiro){
        if (verificarSaldo(c1, retiro)  && (c1.getSaldoActual()*0.20>=retiro) ){
            double extraccion20 = (double) c1.getSaldoActual()-retiro;
            c1.setSaldoActual((int) Math.round(extraccion20));
        }else {
            System.out.println("solo el 20%, so burro ehh o no tenes saldo suficiente, no se q onda");
        }
        return c1.getSaldoActual();
    }

    public static void mostrarDatos(Cuenta c1) {
        System.out.println(" la numero de cliente es: "+ c1.getNumeroCuenta()+ " ,numero de DNI "+ c1.getDNIcliente()+ " y tu money es "+ mostrarSaldo(c1));
    }









}
