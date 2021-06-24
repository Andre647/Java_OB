package monteiro.andre;

abstract public class Trabalhador {
    private String nome;
    private Double salario;
    private String telefone;

    //Construtor genérico
    public Trabalhador(String nome, Double salario, String telefone) {
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
    }

    //Métodos
    public String descricao(){
        String descrevendo = null;
        return descrevendo;
    }
    public boolean executartrabalho(){
        return true;
    }

}
