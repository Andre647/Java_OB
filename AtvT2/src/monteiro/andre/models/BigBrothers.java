package monteiro.andre.models;
import monteiro.andre.enums.Funcoes;

/**
 * Filha de Membros, classe concreta BigBrothers
 */
public class BigBrothers extends Membros{

    //Construtor da classe Membros
    public BigBrothers(String usuario, String email, Funcoes funcao) {
        super(usuario, email, funcao);
    }

    /**
     * Cumprindo o contrato da interface PostarMensagem, reescreve as mensagens dos Membros ScriptGuys
     */
    @Override
    public void mensagemNormal() { System.out.println("Sempre ajudando as pessoas membros ou não S2!"); }
    @Override
    public void mensagemExtra() { System.out.println(". . ."); }
}
