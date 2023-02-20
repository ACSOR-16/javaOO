public class CrearCliente {
    public static void main(String[] args) {
        Cliente oscar = new Cliente();
        oscar.nombre = "oscar";
        oscar.documento = "70440047";
        oscar.telefono = "944020410";

        Cuenta cuentaOscar = new Cuenta();
        cuentaOscar.agencia = 01;
        cuentaOscar.titular = oscar; // referenciando objs oscar - cuenta oscar

        System.out.println(cuentaOscar.titular.documento);
        System.out.println(cuentaOscar.titular); //objeto titular - cliente
        System.out.println(oscar); // el mismo espacio en memoria
    }
}
