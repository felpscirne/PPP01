package models.personagens;

public class Rainha extends Personagem {
    public Rainha() {
        super("Rainha", 100, 1);
    }

    @Override
    public String getDescricao() {
        return "Defesa baixa e alta vitalidade.";
    }
}