package tarefa;

public class Conta {
    
    private int numero;
    private String nome_titular;
    protected double saldo;


    public Conta(int numero, String nome_titular, double saldo){
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }
    public Conta(int numero, String nome_titular){
        this.numero = numero;
        this.nome_titular = nome_titular;
        saldo = 0;
    }


    void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
    
    public boolean sacar(double valor) {
        if (this.saldo>=valor){
            this.saldo-=valor;
            return true;
        } else{
            return false;
        }
    }


    public void setNome_titular(String nome) { 
        this.nome_titular = nome; 
    } 
        
    public void setNumero(Integer numero) { 
        this.numero = numero; 
    } 
    
    public void setSaldo(Double saldo) { 
        this.saldo = saldo; 
    } 
        

    public String getNome_titular(){
        return nome_titular;
    }    
    public int getNumero(){
        return numero;
    }
    public Double getSaldo() { 
        return saldo; 
    } 


}




