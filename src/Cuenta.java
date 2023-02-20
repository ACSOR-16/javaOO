//entidad cuenta:
class Cuenta{
    private double saldo;// encapsulamiento no es publico no se puede accder solo en la clase creada (private)
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente(); //creando una referencia de objs a objs entre class
    // inicialiazando obj con null
    
    // constructor en java ya no usamos setter y es ideal al momento de la creacion de cuentas 
    private static int total = 0; //static variable que pertenesca no sera alterada po la clase
    public Cuenta(int agencia) {
        if (agencia <= 0) {
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total ++;
        System.out.println("Se han creado: " + total + " de cuentas");
    }

    //METODO: toda secuencia de pasos para realizar una accion
    public void depositar(double valor) {
    // void es un metodo que no retorna nada
        this.saldo = this.saldo + valor;
        // this.saldo += valor;
    }
    
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transferir(double valor, Cuenta cuenta){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    // public void setAgencia(int agencia) {
    //     if (agencia > 0 ) {
    //         this.agencia = agencia;
    //     }
    // }
    // usando el constructor requiere informacion para que el obj sera creado
    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }
    public int getNumero() {
        return numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return titular;
    }
    
    public static int getTotal() {
        return total;
        //para accedet a total parte de la clase y no de la instancia
    }
}