package models.armas;
import models.Dado;

public class ArcoEFlecha extends Arma {
    public ArcoEFlecha(Dado dado) {
        super(dado, 12, 20, 5, 25);
    }

    @Override
    public String getNome() {
        return "Arco e Flecha";
    }

    @Override
    public String getDescricao() {
        return "Arma de dano alto(12), porém é facil de falhar um ataque.";
    }
}