package Entidades;

public class Cuenta {
    private int numeroCuenta= (int)(Math.random() * 10000001);
    private long DNIcliente;
    private int saldoActual;

    public Cuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Cuenta() {
        this.numeroCuenta = numeroCuenta;
        this.DNIcliente = DNIcliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNIcliente() {
        return DNIcliente;
    }

    public void setDNIcliente(long DNIcliente) {
        this.DNIcliente = DNIcliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }


    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", DNIcliente=" + DNIcliente +
                ", saldoActual=" + saldoActual +
                '}';
    }
}
