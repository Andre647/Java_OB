package monteiro.andre.models;

import monteiro.andre.interfaces.PostarMensagem;

/**
 * Classe abstrata membros, todos com nome/email/função
 */
abstract public class  Membros implements PostarMensagem {
    //Atributos
     protected String usuario;
     protected String email;
     protected int funcao;


}
