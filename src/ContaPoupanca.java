public class ContaPoupanca extends Conta {

    public static int SEQUENCIAL = 0;

    public ContaPoupanca(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL + 2;
    }


}
