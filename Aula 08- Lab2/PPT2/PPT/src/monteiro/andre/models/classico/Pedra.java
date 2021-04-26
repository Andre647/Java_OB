package monteiro.andre.models.classico;

import monteiro.andre.models.Jogada;
import monteiro.andre.models.bazinga.Lagarto;
import monteiro.andre.models.bazinga.Spoke;

public class Pedra extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
