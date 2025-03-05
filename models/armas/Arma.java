package models.armas;
import models.Dado;
import models.personagens.Personagem;

public abstract class Arma {
    private final Dado dado;
    private final int dano;
    private final int acertoCritico;
    private final int falhaCritica;
    private final int danoCritico;
    

    public Arma(Dado dado, int dano, int acertoCritico, int falhaCritica, int danoCritico) {
        this.dado = dado;
        this.dano = dano;
        this.acertoCritico = acertoCritico;
        this.falhaCritica = falhaCritica;
        this.danoCritico = danoCritico;
    }

    public void atacar(Personagem atacante, Personagem alvo) {
        int resultadoDado = dado.rolar(); // Rola o dado
        System.out.println(atacante.getNome() + " rolou " + resultadoDado + " no dado de 20 faces.");
        int danoFinal = 0;

        // Verifica se foi um acerto crítico
        if (resultadoDado >= acertoCritico) {
            danoFinal = danoCritico - alvo.getDefesaTotal(); if (danoFinal < 0) danoFinal = 0; // Dano crítico menos proteção
            System.out.println(atacante.getNome() + " acertou um golpe crítico com " + getNome() + " e causou " + danoFinal + " de dano a " + alvo.getNome() + "!");
        }
        // Verifica se foi uma falha crítica
        else if (resultadoDado <= falhaCritica) {
            System.out.println(atacante.getNome() + " errou feio o ataque com " + getNome() + "!");
        }

        // Verifica se o ataque acertou
        else if (resultadoDado - atacante.getArmadura().getPenalidadeAtaque() > alvo.getDefesaTotal()) {
            danoFinal = dano - alvo.getDefesaTotal();

            if (danoFinal <= 0) {
                System.out.println(atacante.getNome() + " atacou com " + getNome() + ", mas não causou dano a " + alvo.getNome() + ".");
            } else {
                System.out.println(atacante.getNome() + " atacou com " + getNome() + " e causou " + danoFinal + " de dano a " + alvo.getNome() + ".");
            }

            }

        // Caso contrário, o ataque falhou
        else {
            System.out.println(atacante.getNome() + " atacou com " + getNome() + ", mas errou o ataque contra " + alvo.getNome() + ".");
        }

        // Aplica o dano ao alvo
        if (danoFinal > 0) {
            alvo.receberDano(danoFinal);
        }
    }

    public abstract String getNome();
    public abstract String getDescricao();

}