package banco;

public class Teste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Miguel");

        Contas cc = new ContaCorrente(c1);
        cc.depositar(100);

        Contas poupanca = new ContaPoupanca(c1);
        cc.transferir(poupanca, 100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
