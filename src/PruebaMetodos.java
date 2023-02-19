public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta micuenta = new Cuenta();
        micuenta.saldo = 300;
        micuenta.depositar(200);

        System.out.println(micuenta.saldo); // 300 => 500
        
        micuenta.retirar(100);
        System.out.println(micuenta.saldo);
    }
}
