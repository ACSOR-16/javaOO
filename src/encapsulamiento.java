public class encapsulamiento {
    public static void main(String[] args) {
        Cuenta CuentaAdhara = new Cuenta();
        Cliente clientAdhara = new Cliente();
        clientAdhara.setNombre("Elizabeth");
        clientAdhara.setDocumento("76459803");

        CuentaAdhara.setTitular(clientAdhara);

        System.out.println(clientAdhara.getNombre());
        System.out.println(CuentaAdhara.getTitular().getNombre());
        System.out.println(clientAdhara);
        System.out.println(CuentaAdhara.getTitular());
    }
}
