public class Main {
    public static void main(String[] args) {

        Conta corrente = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        System.out.println(corrente);
        System.out.println(poupanca);

        corrente.depositar(2);
        System.out.println(corrente);

        corrente.transferir(5.0,poupanca);
        System.out.println(poupanca);


    }
}
