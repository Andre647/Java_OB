package monteiro.andre.models;

import monteiro.andre.interfaces.PostarMensagem;
import java.util.Scanner;


/**
 * Classe abstrata membros, todos com nome/email/função
 */
abstract public class  Membros implements PostarMensagem {
    //Atributos

    protected String usuario;
    protected String email;
    protected int funcao;

    // Métodos
    public Membros(String usuario, String email,int funcao) {
        this.usuario = usuario;
        this.email = email;
        this.funcao = funcao;
    }






}
