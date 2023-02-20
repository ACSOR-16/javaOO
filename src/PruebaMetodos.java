public class PruebaMetodos {
    public static void main(String[] args) {
        // Cuenta miCuenta = new Cuenta();
        // miCuenta.saldo = 300;
        // miCuenta.depositar(200);

        // System.out.println(miCuenta.saldo); // 300 => 500
        
        // miCuenta.retirar(100);
        // System.out.println(miCuenta.saldo); // 400

        // Cuenta araceliCuenta =  new Cuenta();
        // araceliCuenta.depositar(1000);
        // araceliCuenta.transferir(200, miCuenta);
        
        // System.out.println(araceliCuenta.saldo); // 1000-200 = 800
        // System.out.println(miCuenta.saldo); // 400 + 200 = 600

        Cuenta miCuenta = new Cuenta(02);
        miCuenta.getSaldo();
        miCuenta.depositar(200);

        System.out.println(miCuenta.getSaldo()); // 300 => 500
        
        miCuenta.retirar(100);
        System.out.println(miCuenta.getSaldo()); // 400

        Cuenta araceliCuenta =  new Cuenta(02);
        araceliCuenta.depositar(1000);
        araceliCuenta.transferir(200, miCuenta);
        
        System.out.println(araceliCuenta.getSaldo()); // 1000-200 = 800
        System.out.println(miCuenta.getSaldo()); // 400 + 200 = 600
    }
}
