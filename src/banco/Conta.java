package banco;

public interface Conta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Contas contaDestino, double valor);
    void imprimirExtrato();
}
