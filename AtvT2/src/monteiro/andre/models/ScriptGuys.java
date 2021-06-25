package monteiro.andre.models;
import monteiro.andre.enums.Funcoes;

/**
 * Filha de Membros, classe concreta ScriptGuys
 */
public class ScriptGuys extends Membros{

    //Construtor da classe Membros
    public ScriptGuys(String usuario, String email, Funcoes funcao) {
        super(usuario, email, funcao);
    }

    /**
     * Cumprindo o contrato da interface PostarMensagem, reescreve as mensagens dos Membros ScriptGuys
     */
    @Override
    public void mensagemNormal() { System.out.println("Prazer em ajudar novos amigos de código!"); }
    @Override
    public void mensagemExtra() { System.out.println("QU3Ro_S3us_r3curs0s.py"); }
}
