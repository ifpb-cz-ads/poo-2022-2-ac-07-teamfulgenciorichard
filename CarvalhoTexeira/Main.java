
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome_titular;
        int numero;
        
        System.out.println("Insira uma das opções:");
        System.out.print("\n1 - Cadastrar Conta\n2 - Cadastrar Conta Poupança\n3 - Cadastrar Conta Especial\nDigite aqui: ");
        
        switch(scanner.nextInt()){
            case 1:
            System.out.print("\nDigite o nome do titular da conta: ");
            Scanner nomeNormal = new Scanner(System.in);
            nome_titular = nomeNormal.nextLine();

            System.out.print("Digite um número para a conta: ");
            numero = scanner.nextInt();

            Conta cadastroNormal = new Conta(numero, nome_titular);
            System.out.println("\n|CONTA NORMAL|\n\nNúmero: "+cadastroNormal.getNumero()+"\nTitular: "+cadastroNormal.getNome_titular()+'\n');
            break;

            case 2:
            System.out.print("\nDigite o nome do titular da conta: ");
            Scanner nomePoupança = new Scanner(System.in);
            nome_titular = nomePoupança.nextLine();

            System.out.print("Digite um número para a conta: ");
            numero = scanner.nextInt();

            ContaPoupanca cadastroPoupança = new ContaPoupanca(numero, nome_titular);
            System.out.println("\n|CONTA POUPANÇA|\n\nNúmero: "+cadastroPoupança.getNumero()+"\nTitular: "+cadastroPoupança.getNome_titular()+'\n');
            break;

            case 3:
            System.out.print("\nDigite o nome do titular da conta: ");
            Scanner nomeEspecial = new Scanner(System.in);
            nome_titular = nomeEspecial.nextLine();

            System.out.print("Digite um número para a conta: ");
            numero = scanner.nextInt();

            System.out.print("Insira o saldo a depositar na conta: ");
            double saldo = scanner.nextDouble();

            ContaEspecial cadastroEspecial = new ContaEspecial(numero, nome_titular, saldo);
            System.out.println("\n|CONTA ESPECIAL|\n\nNúmero: "+cadastroEspecial.getNumero()+"\nTitular: " +cadastroEspecial.getNome_titular()+"\nSaldo: "+cadastroEspecial.getLimite()+'\n');
            break;

            default:
            System.out.println("\nO número inserido foi inválido, programa finalizado.");
            break;
        }
        scanner.close();
    }
}