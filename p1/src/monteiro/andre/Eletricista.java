package monteiro.andre;

public class Eletricista extends Trabalhador{

    //Contrutor sobescrito
    public Eletricista(String nome, Double salario, String telefone) {
        super(nome, salario, telefone);
    }
    //Cada trabalhador descreve e executa seu trabalho de uma forma -> cada um implementa da sua maneira.
    @Override
    public String descricao() {
        return super.descricao();
    }

    @Override
    public boolean executartrabalho() {
        return super.executartrabalho();
    }
}
