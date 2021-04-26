package monteiro.andre.models.classico;

import monteiro.andre.models.Jogada;
import monteiro.andre.models.classico.Pedra;
import monteiro.andre.models.classico.Tesoura;

public class Papel extends Jogada {
    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return jogada instanceof Pedra;
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return jogada instanceof Tesoura;
    }

    @Override
    public String toString() {
        return "Papel";
    }
}
