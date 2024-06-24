public class ContaCorrente extends Conta{

    public static int SEQUENCIAL = 0;

    public ContaCorrente(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL + 1;
    }




}
