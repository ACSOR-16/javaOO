public class CrearCliente {
    public static void main(String[] args) {
        Cliente oscar = new Cliente();
        //oscar.nombre = "oscar";
        //oscar.documento = "70440047";
        //oscar.telefono = "944020410";

        Cuenta cuentaOscar = new Cuenta();
        cuentaOscar.setAgencia(11);;
        cuentaOscar.setTitular(oscar);
        //cuentaOscar.titular = oscar; // referenciando objs oscar - cuenta oscar
        
        oscar.setNombre("oscar");
        oscar.setDocumento("70440047");
        oscar.setTelefono("944020410");

        System.out.println(oscar.getDocumento());
        System.out.println(oscar.getNombre());
        System.out.println(oscar.getTelefono());
        System.out.println(cuentaOscar.getTitular()); //objeto titular - cliente
        System.out.println(oscar); // el mismo espacio en memoria
    }
}
