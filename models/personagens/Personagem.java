package models.personagens; 

import models.armaduras.Armadura;
import models.armas.Arma;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int defesaBase;
    private Armadura armadura;
    private Arma armaEquipada;
    private int defesaTotal;

    public Personagem(String nome, int vida, int defesaBase) {
        this.nome = nome;
        this.vida = vida;
        this.defesaBase = defesaBase;
    }

    /**
     * Equipa uma armadura no personagem.
     */
    public void equiparArmadura(Armadura armadura) {
        this.armadura = armadura;
        System.out.println(nome + " equipou a armadura: " + armadura.getTipo());
        defesaTotal = defesaBase + armadura.getProtecao();
    }

    /**
     * Equipa uma arma no personagem.
     */
    public void equiparArma(Arma arma) {
        this.armaEquipada = arma;
        System.out.println(nome + " equipou a arma: " + arma.getNome());
    }

    /**
     * Realiza um ataque contra outro personagem.
     */
    public void atacar(Personagem alvo) {
        if (armaEquipada != null) 
            armaEquipada.atacar(this, alvo);
    }

    /**
     * Recebe dano, considerando a defesa total (defesa base + proteção da armadura).
     */
    public void receberDano(int dano) {
        vida -= dano; // Apenas subtrai o dano da vida
        System.out.println(nome + " agora tem " + vida + " de vida.");
    }

    /**
     * Verifica se o personagem está vivo.
     */
    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }
    
    public int getVida() {
        return vida;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public Arma getArmaEquipada() {
        return armaEquipada;
    }

    public int getDefesaTotal() {
        return defesaTotal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getDescricao();
}