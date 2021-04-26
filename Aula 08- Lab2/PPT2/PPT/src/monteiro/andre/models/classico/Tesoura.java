package monteiro.andre.models.classico;

import monteiro.andre.models.Jogada;
import monteiro.andre.models.bazinga.Lagarto;
import monteiro.andre.models.bazinga.Spoke;

public class Tesoura extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}


