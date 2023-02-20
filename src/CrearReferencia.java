public class CrearReferencia {
    public static void main(String[] args) {
        // Cuenta firstCount = new Cuenta(); // se reserva un espacio en memoria
        // firstCount.saldo = 300;

        // Cuenta secondCount = firstCount;
        // secondCount.saldo = 100;


        // System.out.println(firstCount.saldo); // 300 => 100
        // System.out.println(secondCount.saldo); // 100

        // secondCount.saldo += 400;

        // System.out.println(secondCount.saldo); // 500

        // System.out.println(firstCount);  // Cuenta@123456 tienen el mismo lugar en memoria
        // System.out.println(secondCount);// Cuenta@123456 tienen el mismo lugar en memoria
        
        Cuenta firstCount = new Cuenta(); // se reserva un espacio en memoria
        firstCount.getSaldo();

        Cuenta secondCount = firstCount;
        secondCount.getSaldo();


        System.out.println(firstCount.getSaldo()); // 300 => 100
        System.out.println(secondCount.getSaldo()); // 100

        secondCount.getSaldo();

        System.out.println(secondCount.getSaldo()); // 500

        System.out.println(firstCount);  // Cuenta@123456 tienen el mismo lugar en memoria
        System.out.println(secondCount);// Cuenta@123456 tienen el mismo lugar en memoria

    }
}
