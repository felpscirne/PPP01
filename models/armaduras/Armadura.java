package models.armaduras;

public abstract class Armadura {
    private String tipo;
    private int protecao; // Valor de proteção (reduz o dano recebido)
    private int penalidadeAtaque; // Penalidade na rolagem do dado para acertar o ataque

    public Armadura(String tipo, int protecao, int penalidadeAtaque) {
        this.tipo = tipo;
        this.protecao = protecao;
        this.penalidadeAtaque = penalidadeAtaque;
    }

    public int getProtecao() {
        return protecao;
    }

    public int getPenalidadeAtaque() {
        return penalidadeAtaque;
    }

    public String getTipo() {
        return tipo;
    }

    
    public abstract String getDescricao();
}