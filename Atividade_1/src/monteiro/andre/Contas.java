package monteiro.andre;

import java.util.ArrayList;

public class Contas {
    //Atributos
    protected static int numContas = 0;
    protected int idConta; //Gerado a partir do numero de conta ja criadas//
    Usuario cliente;
    protected double saldo;
    public static ArrayList<Contas> bancoContas= new ArrayList<>();



    //Metodos
    public Contas( Usuario cliente, double saldo) {
        this.saldo = saldo;
        this.cliente = new Usuario(cliente.Nome, cliente.Senha, cliente.Email);
        idConta = numContas;
        Contas.bancoContas.add(this);
        numContas++;
    }//Construtor

    public static String  getNomeById(int idContaDestino) {
        for(int i =0; i < 3;i++){
            if(idContaDestino == bancoContas[i].idConta){
                return bancoContas[i].cliente.Nome;
            }
        }

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
        String[] dados = qrCode.split(";");
        double valor = Double.parseDouble(dados[2]);
        if(this.sacar(valor)){
            pagante.depositar(valor);
            return true;
        }
        return false;
    }
    }

