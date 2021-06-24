package monteiro.andre.outraQuestao;



public class Pintor2 implements Trabalhador2 {

    String nome;
    double salario;
    String telefone;

    //Construtor
    public Pintor2(String nome, double salario, String telefone) {
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

