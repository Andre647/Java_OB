package monteiro.andre.models;
import monteiro.andre.enums.Funcoes;

/**
 * Filha de Membros, classe concreta MobileMembers
 */
public class MobileMembers extends Membros{

    //Construtor da classe Membros
    public MobileMembers(String usuario, String email, Funcoes funcao ) {
        super(usuario, email, funcao);
    }

    /**
     * Cumprindo o contrato da interface PostarMensagem, reescreve as mensagens dos Membros ScriptGuys
     */
    @Override
    public void mensagemNormal() { System.out.println("Happy Coding!"); }
    @Override
    public void mensagemExtra() { System.out.println("Happy_C0d1ng. Maskers"); }
}
