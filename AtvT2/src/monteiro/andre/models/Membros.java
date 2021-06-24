package monteiro.andre.models;

import monteiro.andre.enums.Funcoes;
import monteiro.andre.interfaces.Apresentacao;
import monteiro.andre.interfaces.PostarMensagem;
import java.util.Scanner;


/**
 * Classe abstrata membros, todos com nome/email/função
 */
abstract public class  Membros implements PostarMensagem,Apresentacao {
    //Atributos

    private String usuario;
    private String email;
    private Funcoes funcao;


    // Métodos
    public Membros(String usuario, String email,Funcoes funcao) {
        this.usuario = usuario;
        this.email = email;
        this.funcao = funcao;
    }
    //getters e setters


    public String getEmail() { return email; }
    public Funcoes getFuncao() { return funcao; }
    public String getUsuario() { return usuario; }

    @Override
    public void apresentar() {
        System.out.println("Sou o "+getUsuario()+", dono do email: "+getEmail()+" e possuo cargo de "+getFuncao());
    }

    @Override
    public String toString() {
        return "{" +
                "usuario ='" + usuario + '\'' +
                ", email ='" + email + '\'' +
                ", cargo =" + funcao +
                '}';
    }
}
