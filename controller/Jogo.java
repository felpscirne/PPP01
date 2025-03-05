package controller;

import java.util.Scanner;
import models.Dado;
import models.personagens.Personagem;
import models.factories.ArmaFactory;

public class Jogo {
    public static void iniciar(Scanner scanner, Personagem jogador, Personagem inimigo) {
        boolean jogando = true;
        while (jogando) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Atacar");
            System.out.println("2. Ver status");
            System.out.println("3. Trocar arma");
            System.out.println("4. Trocar arma do inimigo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    jogador.atacar(inimigo);
                    if (inimigo.estaVivo()) {
                        inimigo.atacar(jogador);
                    } else {
                        System.out.println("Você derrotou " + inimigo.getNome() + "!");
                        jogando = false;
                    }
                    break;
                case 2:
                    exibirStatus(jogador, inimigo);
                    break;
                case 3:
                    jogador.equiparArma(ArmaFactory.escolherArma(new Dado(), scanner, "\n=== ESCOLHA SUA ARMA ==="));
                    break;
                case 4:
                    inimigo.equiparArma(ArmaFactory.escolherArma(new Dado(), scanner, "\n=== ESCOLHA A ARMA DO INIMIGO ==="));
                    break;
                case 5:
                    System.out.println("Saindo do jogo...");
                    jogando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            if (!jogador.estaVivo()) {
                System.out.println("Você foi derrotado por " + inimigo.getNome() + "!");
                jogando = false;
            } else if (!inimigo.estaVivo()) {
                System.out.println("Você derrotou " + inimigo.getNome() + "!");
                jogando = false;
            }
        }
    }

    private static void exibirStatus(Personagem jogador, Personagem inimigo) {
        System.out.println("\n=== STATUS ===");
        System.out.println("Jogador: " + jogador.getNome());
        System.out.println("Vida: " + jogador.getVida());
        System.out.println("Arma equipada: " + jogador.getArmaEquipada().getNome());
        System.out.println("Armadura equipada: " + jogador.getArmadura().getTipo());

        System.out.println("\nInimigo: " + inimigo.getNome());
        System.out.println("Vida: " + inimigo.getVida());
        System.out.println("Arma equipada: " + inimigo.getArmaEquipada().getNome());
        System.out.println("Armadura equipada: " + inimigo.getArmadura().getTipo());
    }
}