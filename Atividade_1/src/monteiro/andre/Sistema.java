package monteiro.andre;
import java.util.Scanner;

public class Sistema {
    //Atribuições
    private boolean executarSistema; //Variavel auxiliar
    private Scanner scanner; //Variavel auxiliar
    private Scanner scanner1; //Variavel auxiliar
    private Contas conta;
    private Contas conta1;
    private Contas conta2;
    private Contas conta3;
    private Usuario cliente1;
    private Usuario cliente2;
    private Usuario cliente3;

    //Métodos
    public Sistema(){
        this.executarSistema = true;
        this.scanner = new Scanner(System.in);
        this.scanner1 = new Scanner(System.in);
        this.cliente1 = new Usuario("A","A123","Azinho@gmail.com");
        this.cliente2 = new Usuario("B","B123","Bzinho@gmail.com");
        this.cliente3 = new Usuario("C","C123","Czinho@gmail.com");
        this.conta1 = new Contas(cliente1,1000);
        this.conta2 = new Contas(cliente2,250);
        this.conta3 = new Contas(cliente3,3000);

    }
    private void exibirMenu(){
        System.out.println("Seja Bem vindo!");
        System.out.println("[ 1 ]- Visualizar Saldo");
        System.out.println("[ 2 ]- Depositar Dinheiro");
        System.out.println("[ 3 ]- Sacar Dinheiro");
        System.out.println("[ 4 ]- Transferir Dinheiro");
        System.out.println("[ 5 ]- Pagar Conta");
        System.out.println("[ 0 ]- Encerrar Sistema");
    }

    private void avalirOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Até Logo!");
                this.executarSistema = false;
                break;
            case 1:
                System.out.println("Saldo primeira conta R$:"+ this.conta1.getSaldo());
                System.out.println("Saldo segunda conta  R$:"+ this.conta2.getSaldo());
                System.out.println("Saldo terceira conta R$:"+ this.conta3.getSaldo());
                break;
            case 2:
                System.out.println("Informe o valor para depositar:");
                double valorParaDepositar = scanner.nextDouble();
                System.out.println("Informe a conta que deseja depositar: ");
                int cEscolha = scanner1.nextInt();
                if (cEscolha == 1){
                    this.conta1.depositar(valorParaDepositar);
                }
                else if(cEscolha == 2){
                    this.conta2.depositar(valorParaDepositar);
                }
                else if(cEscolha == 3){
                    this.conta3.depositar(valorParaDepositar);
                }
                else{
                    System.out.println("Invalido");
                    break;
                }
                System.out.println("Operação realizada com sucesso");
                break;
            case 3:
                System.out.println("Informe o valor para sacar:");
                double valorParaSacar = scanner.nextDouble();
                System.out.println("Informe a conta que deseja sacar: ");
                int cEscolha2 = scanner1.nextInt();
                if(this.conta.sacar(valorParaSacar)){
                    if (cEscolha2 == 1){
                        this.conta1.sacar(valorParaSacar);
                    }
                    else if(cEscolha2 == 2){
                        this.conta2.sacar(valorParaSacar);
                    }
                    else if(cEscolha2 == 3){
                        this.conta3.sacar(valorParaSacar);
                    }
                    else{
                        System.out.println("Invalido");
                        break;
                    }
                    System.out.println("Operação realizada com sucesso");
                }
                else{
                    System.out.println("Algo de errado aconteceu!");
                }
                break;
            case 4:
                //executarTransacao();
                break;
            default:
                System.out.println("Opcao ainda não implementada");
                break;
        }
    }
    public void executar(){
        int opcao;
        while(executarSistema){
            exibirMenu();
            opcao = scanner.nextInt();
            avalirOpcao(opcao);
        }
    }


}