//entidad cuenta:
class Cuenta{
    private double saldo;// encapsulamiento no es publico no se puede accder solo en la clase creada (private)
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente(); //creando una referencia de objs a objs entre class
                    // inicialiazando obj con null

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
    
    public void setAgencia(int agencia) {
        if (agencia > 0 ) {
            this.agencia = agencia;
        }
    }
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
}