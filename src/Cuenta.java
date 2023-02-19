//entidad cuenta:
class Cuenta{
    double saldo;
    int agencia;
    int numero;
    String titular;

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
}