public class Conta {
    
    private int numero;
    private String nome_titular;
    private double saldo;

    public Conta() {}

    public Conta(int numero, String nome_titular){
        this.numero = numero;
        this.nome_titular = nome_titular;
    }
    
    void depositar(double valor) {
        this.saldo = this.getSaldo() + valor;
    }
    
    public boolean sacar(double valor) {
        if (this.getSaldo() >=valor){
            this.saldo -=valor;
            return true;
        }
        return false;
    }

    public double getSaldo() { 
        return this.saldo; 
    }

    public void setSaldo(Double saldo) { 
        this.saldo = saldo; 
    } 

    public String getNome_titular(){
        return this.nome_titular;
    }  

    public void setNome_titular(String nome_titular) { 
        this.nome_titular = nome_titular; 
    } 

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(Integer numero) { 
        this.numero = numero; 
    } 
    
    
        






}




