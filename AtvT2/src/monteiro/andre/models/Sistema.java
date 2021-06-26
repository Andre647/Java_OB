package monteiro.andre.models;

import monteiro.andre.enums.Funcoes;
import monteiro.andre.enums.Horario;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.Scanner;



/**
 * Interacao com o usuario, resposavel pelo menu e todos os tipos de acoes derivado deles
 */
public class Sistema {

    // Banco de dados
    /**
     * Array com todos os membros da MASK SOCIETY
     */
    private static final ArrayList<Membros> bancoMembros = new ArrayList<>();

    //Escrita do arquivo csv
    void escrevendoCSV() throws FileNotFoundException{
        File csvFile = new File("arquivo_super_Secreto_nao_abrir.csv");
        PrintWriter out = new PrintWriter(csvFile);
        for(Membros i: bancoMembros){
            out.println(i);
        }
        out.close();
    }







    //Atributos
    private boolean executarSistema = true;
    int j = 0; // Variavel auxiliar da removerMembro ( case 2 )
    int z = 0; // Variavel auxiliar da exibirMembros ( case 3 )
    int indiceRemocao; // Variavel auxiliar da removerMembro ( case 2 )
    static Horario horarioAtual = Horario.NORMAL;

    /**
     * Serie de scanners para interagir com o usuario ( Big Brother )
     */
    //Scanners
    final private Scanner scannerEscolha = new Scanner(System.in);
    final private Scanner usuarioScan = new Scanner(System.in);
    final private Scanner emailScan = new Scanner(System.in);
    final private Scanner funcaoScan = new Scanner(System.in);
    final private Scanner indexScan = new Scanner(System.in);


    //Métodos
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
        System.out.println("Horario atual: "+horarioAtual);
        System.out.println("[ 1 ] Cadastrar Membro");
        System.out.println("[ 2 ] Remover Membro");
        System.out.println("[ 3 ] Exibir Membros");
        System.out.println("[ 4 ] Trocar Horario");
        System.out.println("[ 5 ] Postar Mensagem");
        System.out.println("[ 0 ] Sair");
    }
    /**
     * Metodo crucial do programa, avalia a opcao do usuario, relizando assim o cadastro/remocao/exibicao/
     * Postar Mensagem etc...
     * @param opcao pega a opção escolhida pelo usuario
     */
    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0:
                //Escrevendo o CSV
                try {
                    escrevendoCSV();
                }catch (FileNotFoundException e){
                    System.out.println("Arquivo não Encontrado :(");
                }
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
                if(horarioAtual == Horario.NORMAL){
                    horarioAtual = Horario.EXTRA;
                    System.out.println("Troca efetuada! ");
                    break;
            }
                if(horarioAtual == Horario.EXTRA){
                    horarioAtual = Horario.NORMAL;
                    System.out.println("Troca efetuada! ");
                    break;
            }

            case 5:
                for(Membros i: bancoMembros){
                    System.out.println(j+"º: "+i.toString());
                    if(horarioAtual == Horario.NORMAL)i.mensagemNormal();
                    else i.mensagemExtra();
                    j++;
                }
                j = 0;
                break;
            default:
                System.out.println("Opção ainda não implementada");
                break;
        }
    }




}
