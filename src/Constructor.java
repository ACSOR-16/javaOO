public class Constructor {
    public static void main(String[] args) {
        Cuenta cuentaAraceli = new Cuenta(01);
        Cuenta cuentaOscar = new Cuenta(05);
        Cuenta cuentaDaniela = new Cuenta(06);
        Cuenta.getTotal();

        System.out.println(cuentaAraceli.getAgencia());
        System.out.println(cuentaOscar.getAgencia());
        System.out.println(cuentaDaniela.getAgencia());
        
        System.out.println(Cuenta.getTotal());
    }
}
