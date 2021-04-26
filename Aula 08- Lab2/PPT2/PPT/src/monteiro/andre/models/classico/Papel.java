package monteiro.andre.models.classico;

import monteiro.andre.models.Jogada;
import monteiro.andre.models.bazinga.Lagarto;
import monteiro.andre.models.bazinga.Spoke;
import monteiro.andre.models.classico.Pedra;
import monteiro.andre.models.classico.Tesoura;

public class Papel extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }

    @Override
    public String toString() {
        return "Papel";
    }
}