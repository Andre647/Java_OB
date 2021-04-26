package monteiro.andre.models.bazinga;

import monteiro.andre.models.Jogada;
import monteiro.andre.models.classico.Papel;
import monteiro.andre.models.classico.Pedra;
import monteiro.andre.models.classico.Tesoura;

public class Lagarto extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Spoke(), new Papel()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }
    @Override
    public String toString() {
        return "Lagarto";
    }
}