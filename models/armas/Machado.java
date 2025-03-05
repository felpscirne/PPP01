package models.armas;
import models.Dado;

// O Machado é a arma mais forte do jogo, porém é a mais dificil de conseguir um acerto critico.

public class Machado extends Arma {
    public Machado(Dado dado) {
        super(dado, 15, 20, 5, 30);
    }

    @Override
    public String getNome() {
        return "Machado";
    }

    @Override
    public String getDescricao() {
        return "Arma de dano alto(15), porém é pesada e lenta, deixando dificil para acertar um critico e facil para errar um golpe.";
    }
}