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
                   double ingreso=sc.nextDouble();
                   ingresar(ingreso, c1);
            }
        }while (opciones!=6);
    }

    public static double ingresar(double ingreso,Cuenta c1){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        double sumaingreso= (double) c1.getSaldoActual()+ingreso;
        c1.setSaldoActual((int) Math.round(sumaingreso));
        System.out.println("el nuevo saldo dsp del ingreso es "+c1.getSaldoActual());

        return c1.getSaldoActual();
    }






}
