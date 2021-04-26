package monteiro.andre.models;

import monteiro.andre.enumeracoes.Resultado;

public  abstract class Jogada {

    public final Resultado verificaResultado(Jogada jogada) {
        if(verificaSeGanhei(jogada)){
            return Resultado.GANHEI;
        }
        if(verificaSePerdi(jogada)){
            return Resultado.PERDI;
        }
        return Resultado.EMPATEI;
    }

    public  boolean verificaSeGanhei(Jogada jogada){
        return true;
    }

    public boolean verificaSePerdi(Jogada jogada){
        return true;
    }
}
