public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuentaOscar = new Cuenta();
        // cuentaOscar.saldo = 200;
        cuentaOscar.setAgencia(22);
        cuentaOscar.setNumero(365124567);

        cuentaOscar.depositar(1000);
        cuentaOscar.retirar(600);
        System.out.println(cuentaOscar.getAgencia());
        System.out.println(cuentaOscar.getNumero());
        System.out.println(cuentaOscar.getSaldo());
    }
}
