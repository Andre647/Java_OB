package monteiro.andre.models;
import monteiro.andre.enums.Funcoes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Filha de Membros, classe concreta BigBrothers
 */
public class BigBrothers extends Membros{

    // Atributos

    //Métodos
    public BigBrothers(String usuario, String email, Funcoes funcao) {
        super(usuario, email, funcao);
    }

    @Override
    public void mensagemNormal() {
        System.out.println("Sempre ajudando as pessoas membros ou não S2!");
    }

    @Override
    public void mensagemExtra() {
        System.out.println(". . .");
    }
}
