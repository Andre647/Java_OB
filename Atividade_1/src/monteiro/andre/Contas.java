package monteiro.andre;

public class Contas {
    //Atributos
    protected static int numContas = 0;
    protected int idConta; //Gerado a partir do numero de conta ja criadas//
    Usuario cliente;
    protected double saldo;

    //Metodos
    public Contas( Usuario cliente, double saldo) {
        this.saldo = saldo;
        this.cliente = new Usuario(cliente.Nome, cliente.Senha, cliente.Email);
        idConta = numContas;
        numContas++;
    }//Construtor

    public double getSaldo() {
        return this.saldo;
    }

    public boolean sacar(double valor){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
            return true;
        }
        else
            return false;
    }
    public void depositar(double valor){
        this.saldo =this.saldo + valor;
    }

    @Override
    public String toString() {
        return "Contas{" +
                "idConta=" + idConta +
                ", cliente=" + cliente +
                ", saldo=" + saldo +
                '}';
    }
}
