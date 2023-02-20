public class CrearNull {
    public static void main(String[] args) {
        Cuenta cuentaOscar = new Cuenta();
        // cuentaOscar.titular.nombre = "oscar";
        
        //Cliente clienteOscar = new Cliente();
        //cuentaOscar.titular = clienteOscar; // null valorpor defecto (obj)
        
        //cuentaOscar.titular = new Cliente(); // el mismo codigo 
        cuentaOscar.titular.nombre = "oscar";
        // cuando cuenta esta inicializada por defaul se puede acceder al atributo

        System.out.println(cuentaOscar.titular.nombre);
        // arrojara null por que aun no existe ningun valor
        System.out.println(cuentaOscar.titular);
        //aun no se crea la instacia de titular - cliente(class)

    }
}