package monteiro.andre.models;

/**
 * Modelo utilizado para representar uma pessoa
 * com nome e cpf
 */
public class Pessoa {
    final public String nome;
    final public String cpf;

    /**
     *
     * @param nome
     * @param cpf
     */
    public Pessoa(String nome, String cpf){
    this.nome = nome;
    this.cpf  = cpf;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
