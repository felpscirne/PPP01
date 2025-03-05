package models.armas;
import models.Dado;

public class Mao  extends Arma {
    public Mao(Dado dado) {
        super(dado, 5, 15, 1, 10);
    }

    @Override
    public String getNome() {
        return "Mão";
    }
    
    @Override
    public String getDescricao() {
        return "Arma de dano baixo(5), porém é leve e facil de acertar um critico.";
    }
}
