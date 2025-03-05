package view;

import java.util.Scanner;
import models.Dado;
import models.armaduras.*;
import models.armas.*;
import models.personagens.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dado dado = new Dado();

        // Menu de seleção de personagem
        System.out.println("=== ESCOLHA SEU PERSONAGEM ===");
        System.out.println("1. Rainha:     " + new Rainha().getDescricao());
        System.out.println("2. Rei         " + new Rei().getDescricao());
        System.out.println("3. Cavaleiro   " + new Cavaleiro().getDescricao());
        System.out.print("Escolha: ");
        int escolhaPersonagem = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        Personagem jogador = criarPersonagem(escolhaPersonagem);
        System.out.print("Digite o nome do seu personagem: ");
        jogador.setNome(scanner.nextLine());

        // Menu de seleção de inimigo
        System.out.println("\n=== ESCOLHA O INIMIGO ===");
        System.out.println("1. Rainha:     " + new Rainha().getDescricao());
        System.out.println("2. Rei         " + new Rei().getDescricao());
        System.out.println("3. Cavaleiro   " + new Cavaleiro().getDescricao());
        System.out.println("4. Orc:        " + new Orc().getDescricao());
        System.out.print("Escolha: ");
        int escolhaInimigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        Personagem inimigo = criarPersonagem(escolhaInimigo);
        System.out.print("Digite o nome do inimigo: ");
        inimigo.setNome(scanner.nextLine());

        // Menu de seleção de arma para o jogador
        System.out.println("\n=== ESCOLHA SUA ARMA ===");
        Arma armaJogador = escolherArma(dado, scanner);
        jogador.equiparArma(armaJogador);

        // Menu de seleção de armadura para o jogador
        System.out.println("\n=== ESCOLHA SUA ARMADURA ===");
        Armadura armaduraJogador = escolherArmadura(scanner);
        jogador.equiparArmadura(armaduraJogador);

        // Menu de seleção de arma para o inimigo
        System.out.println("\n=== ESCOLHA A ARMA DO INIMIGO ===");
        Arma armaInimigo = escolherArma(dado, scanner);
        inimigo.equiparArma(armaInimigo);

        // Menu de seleção de armadura para o inimigo
        System.out.println("\n=== ESCOLHA A ARMADURA DO INIMIGO ===");
        Armadura armaduraInimigo = escolherArmadura(scanner);
        inimigo.equiparArmadura(armaduraInimigo);

        // Loop principal do jogo
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
                case 1: // Atacar
                    jogador.atacar(inimigo);
                    if (inimigo.estaVivo()) {
                        inimigo.atacar(jogador);
                    } else {
                        System.out.println("Você derrotou " + inimigo.getNome() + "!");
                        jogando = false;
                    }
                    break;

                case 2: // Ver status
                    System.out.println("\n=== STATUS ===");
                    System.out.println("Jogador: " + jogador.getNome());
                    System.out.println("Vida: " + jogador.getVida());
                    System.out.println("Arma equipada: " + jogador.getArmaEquipada().getNome());
                    System.out.println("Armadura equipada: " + jogador.getArmadura().getTipo());

                    System.out.println("\nInimigo: " + inimigo.getNome());
                    System.out.println("Vida: " + inimigo.getVida());
                    System.out.println("Arma equipada: " + inimigo.getArmaEquipada().getNome());
                    System.out.println("Armadura equipada: " + inimigo.getArmadura().getTipo());
                    break;

                case 3: // Trocar de arma
                    System.out.println("\n=== ESCOLHA SUA ARMA ===");
                    armaJogador = escolherArma(dado, scanner);
                    jogador.equiparArma(armaJogador);
                    break;


                case 4: // Trocar arma do inimigo
                    System.out.println("\n=== ESCOLHA A ARMA DO INIMIGO ===");
                    armaInimigo = escolherArma(dado, scanner);
                    inimigo.equiparArma(armaInimigo);
                    break;
                
                
                case 5: // Sair
                    System.out.println("Saindo do jogo...");
                    jogando = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            // Verifica se o jogador ou o inimigo morreu
            if (!jogador.estaVivo()) {
                System.out.println("Você foi derrotado por " + inimigo.getNome() + "!");
                jogando = false;
            } else if (!inimigo.estaVivo()) {
                System.out.println("Você derrotou " + inimigo.getNome() + "!");
                jogando = false;
            }
        }

        scanner.close();
    }

    // Método para criar personagens
    private static Personagem criarPersonagem(int escolha) {
        switch (escolha) {
            case 1:
                return new Rainha();
            case 2:
                return new Rei();
            case 3:
                return new Cavaleiro();
            case 4:
                return new Orc();
            default:
                throw new IllegalArgumentException("Escolha inválida!");
        }
    }

    // Método para escolher armas
    private static Arma escolherArma(Dado dado, Scanner scanner) {
        System.out.println("1. Espada:        " + new Espada(dado).getDescricao());
        System.out.println("2. Arco e Flecha: " + new ArcoEFlecha(dado).getDescricao());
        System.out.println("3. Machado:       "  + new Machado(dado).getDescricao());
        System.out.println("4. Mão:           "  + new Mao(dado).getDescricao());
        System.out.print("Escolha: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                return new Espada(dado);
            case 2:
                return new ArcoEFlecha(dado);
            case 3:
                return new Machado(dado);
            case 4:
                return new Mao(dado);
            default:
                throw new IllegalArgumentException("Escolha inválida!");
        }
    }

    // Método para escolher armaduras
    private static Armadura escolherArmadura(Scanner scanner) {
        System.out.println("1. Leve:          " + new ArmaduraLeve().getDescricao());
        System.out.println("2. Média:         " + new ArmaduraMedia().getDescricao());
        System.out.println("3. Pesada:        " + new ArmaduraPesada().getDescricao());
        System.out.print("Escolha: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                return new ArmaduraLeve();
            case 2:
                return new ArmaduraMedia();
            case 3:
                return new ArmaduraPesada();
            default:
                throw new IllegalArgumentException("Escolha inválida!");
        }
    }
}