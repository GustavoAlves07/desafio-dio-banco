public class Conta {

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }

    protected static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public int getAgencia() {
        return agencia;
    }

    public Conta(){

    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }




    public void sacar(double saque) {
        saldo = saldo - saque;

    }


    public void depositar(double deposito) {
        saldo = saldo + deposito;

    }

    public void transferir(double valorTransferencia , Conta contaDestino) {
        this.sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);


    }
}
