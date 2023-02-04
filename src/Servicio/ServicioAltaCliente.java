package Servicio;

import Entidades.Cuenta;

import java.util.Scanner;

public class ServicioAltaCliente {
    public Cuenta AltaCliente (){

Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Cuenta c1 = new Cuenta();
        System.out.println("ingrese el DNI cliente");
        long DNICliente= sc.nextLong();
        c1.setDNIcliente(DNICliente);
        System.out.println("ingrese el saldo inicial cliente");
        int saldoActual= sc.nextInt();
        c1.setSaldoActual(saldoActual);
        System.out.println("el numero de cuenta random es   "+ c1.getNumeroCuenta());
        return c1;
    }


}
