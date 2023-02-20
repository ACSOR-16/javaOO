public class CrearCuenta {
    public static void main(String[] args) {
        // Cuenta primeraCuenta = new Cuenta();
        // primeraCuenta.saldo = 100;

        // Cuenta segundaCuenta = new Cuenta();
        // segundaCuenta.saldo = 400;

        // System.out.println(primeraCuenta.saldo);
        // System.out.println(segundaCuenta.saldo);
        
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.getSaldo();

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.getSaldo();

        System.out.println(primeraCuenta.getSaldo());
        System.out.println(segundaCuenta.getSaldo());

    }
}
