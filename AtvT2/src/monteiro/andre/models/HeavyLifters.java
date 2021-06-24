package monteiro.andre.models;

import monteiro.andre.enums.Funcoes;

/**
 * Filha de Membros, classe concreta HeavyLifters
 */
public class HeavyLifters extends Membros {
    public HeavyLifters(String usuario, String email, Funcoes funcao) {
        super(usuario, email, funcao);
    }

    @Override
    public void mensagemNormal() {
        System.out.println("Podem contar conosco!");
    }

    @Override
    public void mensagemExtra() {
        System.out.println("N00b_qu3_n_Se_r3pita.bat");
    }
}
