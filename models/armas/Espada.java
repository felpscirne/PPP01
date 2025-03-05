package models.armas;
import models.Dado;

public class Espada extends Arma {
    public Espada(Dado dado) {
        super(dado, 10, 18, 1, 20);
    }

    @Override
    public String getNome() {
        return "Espada";
    }

    @Override
    public String getDescricao() {
        return "Arma de dano moderadamente alto(10), porém é pesada e dificil de acertar um critico.";
    }
}