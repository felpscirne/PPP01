package models.factories;

import java.util.Scanner;
import models.armaduras.*;

public class ArmaduraFactory {
    public static Armadura escolherArmadura(Scanner scanner, String mensagem) {
        while(true){
            System.out.println(mensagem);
            System.out.println("1. Leve:   " + new ArmaduraLeve().getDescricao());
            System.out.println("2. Média   " + new ArmaduraMedia().getDescricao());
            System.out.println("3. Pesada  " + new ArmaduraPesada().getDescricao());
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
                    System.out.println("Escolha inválida, tente novamente!");
            }
        }
    }
}