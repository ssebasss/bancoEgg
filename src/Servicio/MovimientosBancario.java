package Servicio;

import Entidades.Cuenta;

import java.util.Scanner;


public class MovimientosBancario {
    public static void Menu(Cuenta c1) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int opciones;
        do {
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
                    retirar(c1, retiro);

                case 4: mostrarSaldo(c1);break;
            }
        }while (opciones!=6);
    }

    public static double ingresar(double ingreso,Cuenta c1){
        double sumaingreso= (double) c1.getSaldoActual()+ingreso;
        c1.setSaldoActual((int) Math.round(sumaingreso));
        System.out.println("el nuevo saldo dsp del ingreso es "+c1.getSaldoActual());
        return c1.getSaldoActual();
    }

    public static int mostrarSaldo(Cuenta c1){
        System.out.println("su saldo disponible es jojo: "+ c1.getSaldoActual());
        return c1.getSaldoActual();
    }

    public static boolean verificarSaldo(Cuenta c1, double retiro){
        return c1.getSaldoActual()>=retiro;
    }

    public static double retirar(Cuenta c1, double retiro){
        if (verificarSaldo(c1, retiro)){
            double saldoPostRetiro= ((double) c1.getSaldoActual()-retiro);
            System.out.println("retirando...." + retiro);
            c1.setSaldoActual((int) Math.round(saldoPostRetiro));
        }else {
            System.out.println("espera a cobrar, no tenes money!!!!");
        }
        return c1.getSaldoActual();
    }






}
