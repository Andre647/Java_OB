package monteiro.andre.outraQuestao;



public class Zelador implements Trabalhador2 {

    private String nome;
    private double salario;
    private String telefone;

    //Construtor
    public Zelador(String nome, double salario, String telefone) {
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
    }

    //Métodos da Interface -> cumprindo o 'contrato'
    @Override
    public void descricao() {}

    @Override
    public void executarTrabalho() {}
}
