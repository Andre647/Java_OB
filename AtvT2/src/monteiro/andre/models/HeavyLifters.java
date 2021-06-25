package monteiro.andre.models;
import monteiro.andre.enums.Funcoes;

/**
 * Filha de Membros, classe concreta HeavyLifters
 */
public class HeavyLifters extends Membros {

    //Construtor da classe Membros
    public HeavyLifters(String usuario, String email, Funcoes funcao) {
        super(usuario, email, funcao);
    }

    /**
     * Cumprindo o contrato da interface PostarMensagem, reescreve as mensagens dos Membros ScriptGuys
     */
    @Override
    public void mensagemNormal() {
        System.out.println("Podem contar conosco!");
    }
    @Override
    public void mensagemExtra() {
        System.out.println("N00b_qu3_n_Se_r3pita.bat");
    }
}
