package monteiro.andre;

import java.util.ArrayList;

public class Contas {
    //Atributos
    protected static int numContas = 0;
    protected int idConta; //Gerado a partir do numero de conta ja criadas//
    Usuario cliente;
    protected double saldo;
    public static ArrayList<Contas> bancoContas = new ArrayList<>();



    //Metodos
    public Contas( Usuario cliente, double saldo) {
        this.saldo = saldo;
        this.cliente = new Usuario(cliente.Nome, cliente.Senha, cliente.Email);
        idConta = numContas;
        Contas.bancoContas.add(this);
        numContas++;
    }//Construtor

    public static String  getNomeById(int idContaDestino) {
        return bancoContas.get(idContaDestino).cliente.getNome();
    }

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

    public boolean transferir(String qrCode,Contas pagante) {
        String[] dados = qrCode.split(";"); //Dados: "idConta;nomeUsuario;valor;numeroAleatorio"
        int idContaDestino = Integer.parseInt(dados[0]);
        String nomeUsuarioContaDestino = dados[1];
        double valor = Double.parseDouble(dados[2]);
        int idTransacao = Integer.parseInt(dados[3]);

        if (this.sacar(valor)){
            pagante.getConta(idContaDestino).depositar(valor);
            return true;
        }
        return false;
    }

    public static Contas getConta(int contaId){ //Retorna objeto Conta com id especificado ou null, caso não exista a conta
        for(Contas i : Contas.bancoContas) {
            if (i.idConta == contaId) {
                return i;
            }
        }
        return null;
    }
}

