package models.factories;

import java.util.Scanner;
import models.personagens.*;

public class PersonagemFactory {
    public static Personagem criarPersonagem(Scanner scanner, String mensagem) {
        while(true){
            System.out.println(mensagem);
            System.out.println("1. Rainha:     " + new Rainha().getDescricao());
            System.out.println("2. Rei:        " + new Rei().getDescricao());
            System.out.println("3. Cavaleiro:  " + new Cavaleiro().getDescricao());
            System.out.println("4. Orc:        " + new Orc().getDescricao());
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

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
                    System.out.println("Escolha inválida, tente novamente!");
            }
        }
    }
}