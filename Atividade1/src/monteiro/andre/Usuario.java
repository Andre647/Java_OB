package monteiro.andre;

public class Usuario {
    //Atribuições
    public String Nome;
    public String Senha;
    public String Email;

    //Metodos
    public Usuario(String Nome,String Senha,String Email) {
        this.Nome = Nome;
        this.Senha = Senha;
        this.Email = Email;
    }//Contrutor

    @Override
    public String toString() {
        return "Usuario{" +
                "Nome='" + Nome + '\'' +
                ", Senha='" + Senha + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
