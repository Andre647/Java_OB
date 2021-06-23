package monteiro.andre.models;
import java.util.Scanner;


/**
 * Criação da Classe Sistema, que implementará todas as outras
 */
public class Sistema {
    Scanner escolha;

    public void execute(){
    exibirMenu();

        if (escolha.nextInt() == 1) cadastrarMembro;
        //if (escolha.nextInt() == 2) removerMembro();
        //if (escolha.nextInt() == 3) exibirHorario();

    }

    private void exibirMenu() {
        System.out.println("SEJA BEM VINDO A MASK SOCIETY");
        System.out.println("--------------------------------");
        System.out.println("[ 1 ] Cadastrar membro");
        System.out.println("[ 2 ] Remover membro");
        System.out.println("[ 3 ] Perguntar horário");
        System.out.println("[ 4 ] Sair");
    }


}
