package monteiro.andre.models;

import monteiro.andre.enums.Funcoes;
import monteiro.andre.interfaces.Apresentacao;
import monteiro.andre.interfaces.PostarMensagem;

/**
 * Classe abstrata membros, todos com nome/email/funcao
 * Implementa as duas interfaces PostarMensagem e Apresentacao
 * Classe crucial para o programa, todos usuários são Membros
 */
abstract public class  Membros implements PostarMensagem,Apresentacao {

    //Atributos
    final private String usuario;
    final private String email;
    final private Funcoes funcao;


    // Contrutor Abstrato
    public Membros(String usuario, String email,Funcoes funcao) {
        this.usuario = usuario;
        this.email = email;
        this.funcao = funcao;
    }

    //getters e setters
    public String getEmail() { return email; }
    public Funcoes getFuncao() { return funcao; }
    public String getUsuario() { return usuario; }


    /**
     * Cumprindo contrato da Interface Apresentacao, reescrevendo-a com a mensagem desejada
     */
    @Override
    public void apresentar() { System.out.println("Sou o "+getUsuario()+", dono do email: "+getEmail()+" e possuo cargo de "+getFuncao()); }
    @Override
    public String toString() {
        return
                "Usuario:'" + usuario + '\'' +
                ", Email: '" + email + '\'' +
                ", Cargo: " + funcao ;
    }
}
