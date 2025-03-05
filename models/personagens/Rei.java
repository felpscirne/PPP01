package models.personagens;

public class Rei extends Personagem {
    public Rei() {
        super("Rei", 100, 5);
    }

    @Override
    public String getDescricao() {
        return "Média defesa e média vitalidade";
    }
}