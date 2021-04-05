package monteiro.andre;
import java.util.Scanner;

public class Sistema<bancoDados> {
    //Atribuições
    private boolean executarSistema; //Variavel auxiliar
    private Scanner scanner; //Variavel auxiliar
    private Scanner scanner1; //Variavel auxiliar
    private Scanner scanner2; //Variavel auxiliar

    private Contas conta1;
    private Contas conta2;
    private Contas conta3;
    private Usuario cliente1;
    private Usuario cliente2;
    private Usuario cliente3;
    //private Contas[] bancoContas;



    //Métodos
    public Sistema(){
        this.executarSistema = true;
        this.scanner = new Scanner(System.in);
        this.scanner1 = new Scanner(System.in);

        //Criando os usuarios e contas do exercicio

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
                this.bancoContas[cEscolha - 1].depositar(valorParaDepositar);
                break;
            case 3:
                System.out.println("Informe o valor para sacar:");
                double valorParaSacar = scanner.nextDouble();
                System.out.println("Informe a conta que deseja sacar: ");
                int cEscolha2 = scanner1.nextInt();
                this.bancoContas[cEscolha2 - 1].sacar(valorParaSacar);
                System.out.println("Algo de errado aconteceu!");
                break;
            case 4:
                System.out.println("Informe o valor para transferir:");
                double valorParaTransferir = scanner.nextDouble();
                System.out.println("Informe a sua conta : ");
                int cPagando = scanner1.nextInt();
                System.out.println("Informe a quem irá o pagamento: ");
                int cRecebendo = scanner2.nextInt();
                String QRCode = geraQRCode(bancoContas[cRecebendo - 1],valorParaTransferir);
                if(executarTransferencia(bancoContas[cPagando - 1],QRCode)){
                    System.out.println("Sucesso!");
                }
                else{
                    System.out.println("Invalido");
                    break;
                }
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