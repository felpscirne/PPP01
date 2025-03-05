package models.armaduras;

public class ArmaduraPesada extends Armadura {
    public ArmaduraPesada() {
        super("Pesada", 10, 5);
    }

    @Override
    public String getDescricao() {
        return "Armadura pesada, oferece muita proteção, mas dificulta muito os ataques.";
    }
}