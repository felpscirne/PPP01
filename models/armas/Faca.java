package models.armas;
import models.Dado;

public class Faca extends Arma {
    public Faca(Dado dado) {
        super(dado, 10, 18, 5, 20);
    }

    @Override
    public String getNome() {
        return "Faca";
    }

    @Override
    public String getDescricao() {
        return "Arma de dano moderadamente alto(10), porém é leve e facil de acertar um critico. Por ser pequena, é facil errar um ataque.";
    }
}