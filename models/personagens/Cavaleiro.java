package models.personagens;

public class Cavaleiro extends Personagem {
    public Cavaleiro() {
        super("Cavaleiro", 50, 10);
    }

    @Override
    public String getDescricao() {
        return "Grande defesa mas baixa vitalidade.";
    }
}