public class CrearNull {
    public static void main(String[] args) {
        Cuenta cuentaOscar = new Cuenta(01);
        // cuentaOscar.titular.nombre = "oscar";
        
        //Cliente clienteOscar = new Cliente();
        //cuentaOscar.titular = clienteOscar; // null valorpor defecto (obj)
        
        //cuentaOscar.titular = new Cliente(); // el mismo codigo 
        //cuentaOscar.titular.setNombre("oscar");
        cuentaOscar.setTitular(null);
        //cuentaOscar.setNombre("oscar"); // no se puede por setter y getter
        // cuando cuenta esta inicializada por defaul se puede acceder al atributo

        System.out.println(cuentaOscar.getTitular());
        // arrojara null por que aun no existe ningun valor
        System.out.println(cuentaOscar);
        //aun no se crea la instacia de titular - cliente(class)

    }
}