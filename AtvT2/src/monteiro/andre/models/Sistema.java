package monteiro.andre.models;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Criação da Classe Sistema, que implementará todas as outras
 */
public class Sistema {
    // Banco de dados
    private static ArrayList<Membros> bancoMembros = new ArrayList<>();
    //Atributos
    private boolean executarSistema = true;
    //Scanners
    Scanner scannerEscolha = new Scanner(System.in);
    Scanner usuarioScan = new Scanner(System.in);
    Scanner emailScan = new Scanner(System.in);
    Scanner funcaoScan = new Scanner(System.in);

    public void execute(){
    int opcao;
    while (executarSistema){
        exibirMenu();
        opcao = scannerEscolha.nextInt();
        avaliarOpcao(opcao);
        }
    }
    private void exibirMenu() {
        System.out.println("SEJA BEM VINDO A MASK SOCIETY");
        System.out.println("--------------------------------");
        System.out.println("[ 1 ] Cadastrar membro");
        System.out.println("[ 2 ] Remover membro");
        System.out.println("[ 3 ] Perguntar horário");
        System.out.println("[ 0 ] Sair");
    }

    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Até Logo!");
                this.executarSistema = false;
                break;
            case 1://Cadastrando Membro
                System.out.println("Digite o usuario do membro: ");
                String usuario = usuarioScan.next();
                System.out.println("Digite o email do membro: ");
                String email = emailScan.next();
                System.out.println("Função:\n [ 1 ] MobileMember\n [ 2 ] HeavyLifter\n [ 3 ] ScriptGuys\n [ 4 ] BigBrothers ");
                int funcao = funcaoScan.nextInt();
                if(funcao < 1 || funcao > 4) {
                    System.out.println("Digite um numero valido na proxima!");
                    break;
                }
                if (funcao == 1) bancoMembros.add(new MobileMembers(usuario,email,funcao));
                if (funcao == 2) bancoMembros.add(new HeavyLifters(usuario,email,funcao));
                if (funcao == 3) bancoMembros.add(new ScriptGuys(usuario,email,funcao));
                if (funcao == 4) bancoMembros.add(new BigBrothers(usuario,email,funcao));
                System.out.println("Membro Adicionado!");
                break;
            case 2://Removendo Membro

                break;
            case 3:

                break;

            default:
                System.out.println("Opcao ainda não implementada");
                break;
        }
    }
}
