package models;
import java.util.Random;

public class Dado {
    private Random random;
    private int lados;


    public Dado() {
        this.random = new Random();
        this.lados = 20;
    }


    public int rolar() {
        return random.nextInt(lados) + 1;
    }
}