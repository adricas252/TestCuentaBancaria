public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuentaEmma = new CuentaBancaria("Emma", 1500.00);
        CuentaBancaria cuentaPedro = new CuentaBancaria("Pedrito", 1969.57);

        System.out.println(cuentaEmma);
        System.out.println(cuentaPedro);

        cuentaPedro.retirar(300);

        System.out.println(cuentaPedro);

        cuentaEmma.ingresar(120);

        System.out.println(cuentaEmma);

        cuentaPedro.setTitular("Pedro");
        System.out.println(cuentaPedro);

        cuentaEmma.ingresar(325.56);

        System.out.println(cuentaEmma);

        System.out.println("Titular: " + cuentaEmma.getTitular() + ". Saldo: " + cuentaEmma.getSaldo());

        cuentaEmma.retirar(649.99);

        System.out.println(cuentaEmma);

        System.out.println("Titular: " + cuentaEmma.getTitular() + ". Saldo: " + cuentaEmma.getSaldo());

    }
}
