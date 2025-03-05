public class Espada implements Arma {
    private static final int DANO = 6;
    private static final int ACERTO_CRITICO = 20;
    private static final int FALHA_CRITICA = 1;
    private static final int DANO_CRITICO = 12;
    
    @Override
    public void atacar(Personagem atacante, Personagem alvo) {
        int dado = new Dado().rolar(20);
        int dano = 0;
        
        if (dado == ACERTO_CRITICO) {dano = DANO_CRITICO;}
        else if (dado == FALHA_CRITICA) {dano = 0;}
        else if (dado >= alvo.getArmadura().getProtecao()) {
            dano = DANO;
        }
        
        alvo.receberDano(dano);
    }
}