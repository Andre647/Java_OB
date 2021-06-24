package monteiro.andre.models;

import monteiro.andre.enums.Funcoes;

import java.util.ArrayList;

/**
 * Filha de Membros, classe concreta MobileMembers
 */
public class MobileMembers extends Membros{

    public MobileMembers(String usuario, String email, Funcoes funcao ) {
        super(usuario, email, funcao);
    }


}
