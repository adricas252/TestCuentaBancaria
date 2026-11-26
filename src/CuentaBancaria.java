public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede ser nulo ni estar vacio");
        }

        if (saldo <= 0) {
            throw new IllegalArgumentException("El saldo debe ser mayor o igual que cero");
        }
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {

        return titular;
    }

    public void setTitular(String titular) {

        this.titular = titular;
    }

    public double getSaldo() {

        return saldo;
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar no puede ser negativa");
        }

        if (cantidad > saldo) {
            throw new IllegalArgumentException("La cantidad a retirar no puede superar el saldo");
        }

        saldo -= cantidad;
    }

    public void ingresar (double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Tienes que ingresar una cantidad mayor que cero");
        }

        saldo += cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
