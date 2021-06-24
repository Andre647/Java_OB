package monteiro.andre.models;

import monteiro.andre.enums.Funcoes;


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
    int j = 0; // Variavel auxiliar da removerMembro ( case 2 )
    int z = 0; // Variavel auxiliar da exibirMembros ( case 3 )
    int indiceRemocao;
    //Scanners
    private Scanner scannerEscolha = new Scanner(System.in);
    private Scanner usuarioScan = new Scanner(System.in);
    private Scanner emailScan = new Scanner(System.in);
    private Scanner funcaoScan = new Scanner(System.in);
    private Scanner indexScan = new Scanner(System.in);

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
        System.out.println("[ 1 ] Cadastrar Membro");
        System.out.println("[ 2 ] Remover Membro");
        System.out.println("[ 3 ] Exibir Membros");
        System.out.println("[ 4 ] Visualizar Horario");
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
                if (funcao == 1) bancoMembros.add(new MobileMembers(usuario,email, Funcoes.MOBILE_MEMBERS));
                if (funcao == 2) bancoMembros.add(new HeavyLifters(usuario,email,Funcoes.HEAVY_LIFTERS));
                if (funcao == 3) bancoMembros.add(new ScriptGuys(usuario,email,Funcoes.SCRIPT_GUYS));
                if (funcao == 4) bancoMembros.add(new BigBrothers(usuario,email,Funcoes.BIG_BROTHERS));
                System.out.println("Membro Adicionado!");
                break;
            case 2://Removendo Membro
                for(Membros i: bancoMembros){
                    System.out.println(j+"º: "+i.toString());
                    bancoMembros.get(j).apresentar();
                    j++;
                }
                j = 0;
                System.out.println("Selecione o index de quem será removido: ");
                indiceRemocao = indexScan.nextInt();
                bancoMembros.remove(indiceRemocao);
                break;
            case 3:
                for(Membros i: bancoMembros){
                    System.out.println(z+"º: "+i.toString());
                    z++;
                }
                z = 0;
                break;
            case 4:

                break;

            default:
                System.out.println("Opcao ainda não implementada");
                break;
        }
    }
}
