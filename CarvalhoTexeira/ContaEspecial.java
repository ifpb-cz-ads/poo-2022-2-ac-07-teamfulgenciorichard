import tarefa.Conta;

public class ContaEspecial extends Conta {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar (double valor){
        if(valor <= this.limite + this.saldo) {
            this.saldo -= saldo;
            return true;
        } else {
            return false;
        }
    }

    public ContaEspecial(int numero, String nome_titular, double limite) {
        super(numero, nome_titular);
        this.limite = limite;
    }
    
}