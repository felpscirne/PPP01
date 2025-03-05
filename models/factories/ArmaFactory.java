package models.factories;

import java.util.Scanner;
import models.Dado;
import models.armas.*;

public class ArmaFactory {
    public static Arma escolherArma(Dado dado, Scanner scanner, String mensagem) {
        while(true){
            System.out.println(mensagem);
            System.out.println("1. Espada:            " + new Espada(dado).getDescricao());
            System.out.println("2. Arco e Flecha:     " + new ArcoEFlecha(dado).getDescricao());
            System.out.println("3. Machado:           " + new Machado(dado).getDescricao());
            System.out.println("4. Mão:               " + new Mao(dado).getDescricao());
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
                    System.out.println("Escolha inválida, tente novamente!");
            }
        }
    }
}