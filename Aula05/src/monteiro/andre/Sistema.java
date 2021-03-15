package monteiro.andre;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;

    public void executar(){
        int opcao;
        while(executarSistema){
            exibirMenu();
            opcao = scanner.nextInt();
        }
    }
    public Sistema(){
        this.executarSistema = true;
        this.scanner = new Scanner(System.in);
    }
    private void exibirMenu(){
        System.out.println("Bem vindo ao Mauá Bank");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar Dinheiro");
        System.out.println("3 - Sacar Dinheiro");
        System.out.println("4 - Transferir Dinheiro");
        System.out.println("5 - Pagar Conta");
        System.out.println("0 - Encerrar Sistema");
    }
}
