package monteiro.andre.models.bazinga;

import monteiro.andre.models.Jogada;
import monteiro.andre.models.classico.Papel;
import monteiro.andre.models.classico.Pedra;
import monteiro.andre.models.classico.Tesoura;

public class Spoke extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Tesoura(), new Pedra()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}