package monteiro.andre;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;
    private Conta conta;

    public void executar(){
        int opcao;
        while(executarSistema){
            exibirMenu();
            opcao = scanner.nextInt();
            avalirOpcao(opcao);
        }
    }

    private void avalirOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Até Logo!");
                this.executarSistema = false;
                break;
            case 1:
                System.out.println("Saldo R$:"+ this.conta.getSaldo());
                break;
            case 2:
                System.out.println("Informe o valor para depositar:");
                double valorParaDepositar = scanner.nextDouble();
                this.conta.depositar(valorParaDepositar);
                System.out.println("Operação realizada com sucesso");
                break;
            case 3:
                System.out.println("Informe o valor para sacar:");
                double valorParaSacar = scanner.nextDouble();
                if(this.conta.sacar(valorParaSacar)){
                    System.out.println("Operação realizada com sucesso");
                }
                else{
                    System.out.println("Algo de errado aconteceu!");
                }
                break;
            case 5:
                System.out.println("Nome do titulo a pagar: ");
                String nomeTitulo = scanner.next();
                System.out.println("Valor do titulo");
                double valorTitulo = scanner.nextDouble();
                System.out.println("Valor de juros por dia:");
                double valorJurosPorDia = scanner.nextDouble();
                System.out.println("Informa a data de vencimento( aaaa-mm-dd )");
                String dataVencimentoTitulo= scanner.next();
                Titulo titulo = new Titulo(valorTitulo,nomeTitulo,valorJurosPorDia,dataVencimentoTitulo);
                if(this.conta.sacar(titulo.getValorPagamento())){
                    System.out.println("Operação realizada com sucesso!");
                }
                else{
                    System.out.println("Não foi possivel realizar a operação");
                }
                break;
            default:
                System.out.println("Opcao ainda não implementada");
                break;
        }
    }

    public Sistema(){
        this.executarSistema = true;
        this.scanner = new Scanner(System.in);
        this.conta = new Conta("Luighi",1235,1000);
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
