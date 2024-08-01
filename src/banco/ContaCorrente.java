package banco;

public class ContaCorrente extends Contas{

    public ContaCorrente(Cliente clientes) {
        super(clientes);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato conta corrente ---");
        super.infosComuns();
    }
}
