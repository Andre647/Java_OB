package monteiro.andre.models;

import monteiro.andre.enums.Funcoes;

/**
 * Filha de Membros, classe concreta ScriptGuys
 */
public class ScriptGuys extends Membros{
    public ScriptGuys(String usuario, String email, Funcoes funcao) {
        super(usuario, email, funcao);
    }

    @Override
    public void mensagemNormal() {
        System.out.println("Prazer em ajudar novos amigos de código!");
    }

    @Override
    public void mensagemExtra() {
        System.out.println("QU3Ro_S3us_r3curs0s.py");
    }
}
