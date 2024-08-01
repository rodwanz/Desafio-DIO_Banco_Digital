package banco;

public abstract class Contas implements Conta{
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected  Cliente clientes;

    public Contas(Cliente clientes) {
        this.agencia = Contas.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        this.clientes = clientes;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Contas contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void infosComuns() {
        System.out.println(String.format("Titular %s", clientes.getNome()));
        System.out.println(String.format("Agência %d", agencia));
        System.out.println(String.format("Número %d", numero));
        System.out.println(String.format("Saldo %.2f", saldo));
    }
}
