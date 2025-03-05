package models.armaduras;

public class ArmaduraLeve extends Armadura {
    public ArmaduraLeve() {
        super("Leve", 2, 0);
    }

    @Override
    public String getDescricao() {
        return "Armadura leve, permite movimentos ágeis e não penaliza o ataque.";
    }
}