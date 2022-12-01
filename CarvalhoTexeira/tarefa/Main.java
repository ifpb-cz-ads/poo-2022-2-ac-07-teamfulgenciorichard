package tarefa;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta cE = new Conta(0, null, 0.0);
        Conta cP = new Conta(0, null);
        boolean value = true;
        for(int n = 1; value != false; n++){ 
            System.out.print("\n 1 > Criar Nova Conta\n 2 > Ver Saldo\n 3 > Sacar\n 4 > Depositar\n    Qualquer Número para Sair\nDigite: ");

            switch (scanner.nextInt()) { 
                case 1: 
                    System.out.print("\n 1 > Criar Conta Especial\n 2 > Criar Conta Poupança\nDigite: ");
                    if(scanner.nextInt() == 1){
                        scanner = new Scanner(System.in);
                        System.out.print("Digite seu Nome: ");
                        cE.setNome_titular(scanner.nextLine());
                        
                        System.out.print("Digite o Saldo: ");
                        cE.setSaldo(scanner.nextDouble());

                        cE.setNumero(n);
                    }
                    if(scanner.nextInt() == 2){
                        scanner = new Scanner(System.in);
                        System.out.print("Digite seu Nome: ");
                        cP.setNome_titular(scanner.nextLine());

                        cP.setNumero(n);
                    }
                    scanner = new Scanner(System.in);
                    break;
                default:
                    value = false;
                    scanner.close();
                    break;
            }
        } 
    }

}