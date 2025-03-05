package view;

import controller.Jogo;
import java.util.Scanner;
import models.Dado;
import models.factories.ArmaFactory;
import models.factories.ArmaduraFactory;
import models.factories.PersonagemFactory;
import models.personagens.Personagem;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dado dado = new Dado();

        Personagem jogador = PersonagemFactory.criarPersonagem(scanner, "=== ESCOLHA SEU PERSONAGEM ===");
        System.out.print("Digite o nome do seu personagem: ");
        jogador.setNome(scanner.nextLine());

        Personagem inimigo = PersonagemFactory.criarPersonagem(scanner, "\n=== ESCOLHA O INIMIGO ===");
        System.out.print("Digite o nome do inimigo: ");
        inimigo.setNome(scanner.nextLine());

        jogador.equiparArma(ArmaFactory.escolherArma(dado, scanner, "\n=== ESCOLHA SUA ARMA ==="));
        jogador.equiparArmadura(ArmaduraFactory.escolherArmadura(scanner, "\n=== ESCOLHA SUA ARMADURA ==="));

        inimigo.equiparArma(ArmaFactory.escolherArma(dado, scanner, "\n=== ESCOLHA A ARMA DO INIMIGO ==="));
        inimigo.equiparArmadura(ArmaduraFactory.escolherArmadura(scanner, "\n=== ESCOLHA A ARMADURA DO INIMIGO ==="));

        Jogo.iniciar(scanner, jogador, inimigo);
        scanner.close();
    }
}