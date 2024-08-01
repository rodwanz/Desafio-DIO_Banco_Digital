package banco;

public class ContaPoupanca extends Contas{

    public ContaPoupanca(Cliente clientes) {
        super(clientes);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato conta poupança ---");
        super.infosComuns();
    }
}
