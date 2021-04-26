package monteiro.andre.models.classico;

import monteiro.andre.models.Jogada;

public class Tesoura extends Jogada {
    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return jogada instanceof Papel;
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return jogada instanceof Pedra;
    }

    @Override
    public String toString() {
        return "Tesoura";
    }

}



