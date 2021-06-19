package monteiro.andre.models;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * Criação da Classe Sistema, que implementará todas as outras
 */
public class Sistema {
    public void execute(){
    exibirMenu();
    }

    private void exibirMenu() {
        System.out.println("SEJA BEM VINDO A MASK SOCIETY");
        System.out.println("--------------------------------");
        System.out.println("[ 1 ] Cadastrar membro");
        System.out.println("[ 2 ] Remover membro");
        System.out.println("[ 3 ] Perguntar horário");
    }


}
