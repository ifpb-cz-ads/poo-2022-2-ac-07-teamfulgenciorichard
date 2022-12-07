public class ContaPoupanca extends Conta{

    public ContaPoupanca() {}

    public ContaPoupanca(int numero, String nome_titular) {
        super(numero, nome_titular);
    }

    public void rejustar(double percentual) {
        double reajuste = this.getSaldo() * percentual;
        this.depositar(reajuste);
    }

    
}