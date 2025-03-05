package models.armaduras;

public class ArmaduraMedia extends Armadura {
    public ArmaduraMedia() {
        super("Média", 6, 2);
    }

    @Override
    public String getDescricao() {
        return "Armadura média, equilibra proteção e mobilidade.";
    }
}