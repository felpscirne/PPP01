package models.personagens;

public class Orc extends Personagem {
    public Orc() {
        super("Orc", 150, 15);
    }

    @Override
    public String getDescricao() {
        return "PERIGO:  ALTO RISCO MORTAL";
    }
    
}
