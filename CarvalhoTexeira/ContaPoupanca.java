import tarefa.Conta;

public class ContaPoupanca extends Conta{

    public void rejustar(double percentual) {
        saldo = saldo + saldo * percentual;
        
    }

    public ContaPoupanca(int numero, String nome_titular) {
        super(numero, nome_titular);
    }
}