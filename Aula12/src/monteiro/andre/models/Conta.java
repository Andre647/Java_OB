package monteiro.andre.models;

/**
 * Classe que representa o objeto Conta
 */
public class Conta {
    public double saldo;

    /**
     * Construtor que inicializa o saldo da conta
     * @param saldo Saldo inicial da conta
     */
    public Conta(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Construtor que inicializa o saldo com 0
     */
    public Conta() {
    }

    /**
     * Retorna o estado do objeto conta
     * @return O valor do saldo
     */
    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}